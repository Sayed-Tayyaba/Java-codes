import java.util.Scanner;

public class CalculateBMI {

    public static double CalculateBMI(double weight, double height){
        return (weight/(height*height))*703;
    }
    public static String findStatus(double bmi){
        if (bmi<18.5){
            return "Underweight";
        }
        else if (bmi>=18.5 && bmi<=24.9) {
            return "Normal";
        }
        else if (bmi>=25.5 && bmi<=29.9) {
            return "Overweight";
        }
        else {
            return "Obese";
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter weight in pounds:");
        double weight= sc.nextDouble();

        System.out.print("Enter height in inches:");
        double height= sc.nextDouble();

        double bmi= CalculateBMI(weight,height);
        String status=findStatus(bmi);

        System.out.printf("Your BMI is:%2f\n",bmi);
        System.out.println("Weight status:"+status);



    }
}
