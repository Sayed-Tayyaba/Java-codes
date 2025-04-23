public class PrintTest {

    public static void print(int n,char c){
        System.out.println("Integer: "+n+",Character: "+c);
    }
    public static void print(char c,int n){
        System.out.println("Character: "+c+",Integer: "+n);
    }
    public static void main(String[] args) {
        print(5,'T');
        print('A',3);
    }
}
