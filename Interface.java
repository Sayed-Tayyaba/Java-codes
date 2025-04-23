interface first{
    public void myMethod();


}
interface Second{
    public void myOtherMethod();
}
class DemoClass implements first,Second{
    public void myMethod(){
        System.out.println("Some Text");
    }
    public void myOtherMethod(){
        System.out.println("some other text");
    }
}


public class Interface {
    public static void main(String[] args) {
        DemoClass d=new DemoClass();
        d.myMethod();
        d.myOtherMethod();

    }
}
