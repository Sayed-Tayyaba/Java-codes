public class Overloading {
    public void Add(){
        int a=10;
        int b=11;
        int c=a+b;
    }
    public void Add(int x,int y){
        int c=x+y;
        System.out.println(c);
    }
    public void Add(int x,double y){
        double c=x+y;
        System.out.println(c);
    }
    public static void main(String[] args) {
        Overloading o=new Overloading();
        o.Add();
        o.Add(10,10);
        o.Add(10,12.3);
    }
}
