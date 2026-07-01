package games;

import java.util.Scanner;
public class VotingSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Voters Lists Total-Numbers
        System.out.println("How many users will vote?");
        int totalUsers = sc.nextInt();
        String[] candidates = {
                "Rahul",
                "Shubham",
                "Simi",
                "Gauresh",
                "Ravi"
        };
        int[] votes = new int[candidates.length];
        int vote=0;
        // Votes Inputs
        for(int i=0;i<votes.length;i++){
            System.out.println("Enter Your Choice\n1 for Rahul\n2 for Shubham\n3 for Simi\n4 for Gauresh\n5 for Ravi");
            votes[i]=sc.nextInt();
            vote++;
        }
        for(int i=1; i<=totalUsers; i++)
        {
            System.out.println("\nVoter " + i);
            System.out.println("Enter Your Choice\n1 for Rahul\n2 for Shubham\n3 for Simi\n4 for Gauresh\n5 for Ravi");
            int choice = sc.nextInt();
            if(choice >= 1 && choice <= 5)
            {
                votes[choice - 1]++;                      //ex-> choice = 2   -> vote for Shubham at index 1
            }
            else
            {
                System.out.println("Invalid Vote");
                i--;                                        // voter ko dobara chance
            }
        }
        // Votes Prints
        for(int i=0;i<candidates.length;i++){
            System.out.println("Votes for " + candidates[i] + " is : " + votes[i]);
        }
        int winnerIndex = 0;
        for(int i=1;i<votes.length;i++)
        {
            if(votes[i] > votes[winnerIndex])
            {
                winnerIndex = i;
            }
        }
        System.out.println("Winner : " + candidates[winnerIndex]);
    }
}