class A{
    A(){
        System.out.println("A");
    }
    A(int a){
        System.out.println("The value of a is:"+a);
    }
}
class B extends A{
    B(){
        System.out.println("B");
    }
    B(int a,int b){
        super(a);
        System.out.println("The value of b is:"+b);
    }
}
class C extends B{
    C(){
        System.out.println("c");
    }
    C(int a,int b,int c){
        super(a,b);
        System.out.println("The value of c is:"+c);
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        C ob=new C(1,2,3);
    }
}
