import java.util.Scanner;

public class AgeCalculater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year:");
        int year=sc.nextInt();
        int currentyear=2025;

        int age=currentyear-year;

        System.out.println("Your age is:"+age);
    }
}
