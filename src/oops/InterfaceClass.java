package oops;
                    //Interface Method
interface Camera{
    void photoclick();
}
interface musicplayer{
    void playmusic();
}
class SmartPhone implements Camera,musicplayer{
    public void photoclick(){
        System.out.println("Photo click");
    }
    public void playmusic(){
        System.out.println("Playing Music");
    }
}
public class InterfaceClass{
    public static void main(String[] args){
        SmartPhone s = new SmartPhone();
        System.out.println("Interface Overloaded");
        s.photoclick();
        s.playmusic();

        System.out.println("\n");
        //Interface using Abstraction
        System.out.println("Interface Using Abstraction");
        Camera c = new SmartPhone();
        musicplayer m = new SmartPhone();
        c.photoclick();
        m.playmusic();
    }
}
