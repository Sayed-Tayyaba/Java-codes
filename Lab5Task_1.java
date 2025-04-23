import java.util.Scanner;

public class Lab5Task_1 {
    public static double calculateBMI(double weight, double height){
        double BMI=weight/height*height*703;
        return BMI;
    }
    public static String findStatus(double BMI){
        if(BMI<18.5){
            return "Underweight";
        } else if (BMI>=18.5 && BMI<=24.9) {
            return "Normal";
        }
        else if(BMI>=25.0 && BMI<=29.9){
            return "Overweight";

        }
        else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the weight in pounds");
        double weight=sc.nextDouble();

        System.out.println("Enter the height in inches");
        double height=sc.nextDouble();

        double bmi=calculateBMI(weight,height);
        String status=findStatus(bmi);
        System.out.println("BMI is:"+bmi);
        System.out.println(status);


    }
}
