class Mobile{
    public void showTime(){
        System.out.println("Time is 9:50am");
    }
    public void turnOn(){
        System.out.println("Mobile is turning on............");
    }

}
class SmartPhone extends Mobile{
    public void showTime(){
        System.out.println("Time is 10:50am");
    }
    public void musicPlay(){
        System.out.println("Music is playing .....");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Mobile m=new Mobile();
        m.showTime();

    }
}
