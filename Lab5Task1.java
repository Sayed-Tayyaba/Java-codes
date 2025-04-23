import java.util.Scanner;

public class Lab5Task1 {

    public static double calculateBMI(double weight,double height){
        return (weight/(height*height))*703;
    }
    public static String findStatus(double bmi){
        if (bmi<18.5){
            return "Underweight";
        } else if (bmi>=18.5 && bmi<=24.9) {
            return "Normal";
        } else if (bmi>=25.0 && bmi<=29.9) {
            return "Overweight";
        }else {
            return "Obese";
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        double weight=sc.nextDouble();

        System.out.println("Enter height in inches: ");
        double height=sc.nextDouble();

        double bmi=calculateBMI(weight,height);
        String status=findStatus(bmi);

        System.out.println("Your BMI is:\n"+bmi);
        System.out.println("Weight status: "+status);
    }
}
