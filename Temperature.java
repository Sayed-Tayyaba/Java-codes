import java.util.Scanner;
import java.util.SortedMap;

public class Temperature {
    double celsius;
    double fahrenheit;
    public static double farhrenheit(double celsius){
        return (1.8*celsius)+32;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temp in celsius:");
        double celsius= sc.nextDouble();
        System.out.println("Temo in F:"+farhrenheit(celsius));

    }
}
