import java.util.Scanner;

public class Salarybonus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

        double newSalary = salary + (salary * ((salary > 10000) ? 0.10 : 0.05));
        System.out.println("New Salary: " + newSalary);

        sc.close();
    }
    }

