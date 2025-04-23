import java.util.Scanner;

public class lab5task4 {

    public static int GCD(int num1, int num2){
        if (num2==0){
            return num1;
        }
        else {
            return GCD(num1,num1%num2);
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("num1:");
        int num1= sc.nextInt();
        System.out.println("num2:");
        int num2= sc.nextInt();
        System.out.println("GCD is:"+GCD(num1,num2));
    }
}
