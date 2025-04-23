abstract class Employee1{
     String firstname;
     String lastname;
     String nationalID;

    Employee1(String firstname,String lastname,String nationlID){
        this.firstname=firstname;
        this.lastname=lastname;
        this.nationalID=nationlID;
    }
    public abstract double earning();

    public void display(){
        System.out.println("Name:"+firstname+" "+lastname);
        System.out.println("National ID:"+nationalID);
    }
}
class SalariedEmployee extends Employee1{
     double weeklySalary;

    SalariedEmployee(String firstname,String lastname,String nationalID,double weeklySalary){
        super(firstname,lastname,nationalID);
        this.weeklySalary= Math.max(weeklySalary,0);
    }
    public double earning(){
        return weeklySalary;
    }
    public void display(){
        System.out.println("Salaried Employee:");
        super.display();
        System.out.println("Weekly Salary:"+weeklySalary);
    }
}
class HourlyEmployee extends Employee1{
    double wage;
    double hours;
    public HourlyEmployee(String firstName, String lastName, String nationalID, double wage, double hours) {
        super(firstName, lastName, nationalID);
        this.wage = Math.max(wage, 0);
        this.hours = Math.max(hours, 0);
    }
    public double earning() {
        return (hours <= 40) ? wage * hours : (40 * wage + (hours - 40) * wage * 1.5);
    }
    public void display() {
        System.out.println("\nHourly Employee:");
        super.display();
        System.out.println("Wage: " + wage + ", Hours: " + hours);
    }

}
class CommissionEmployee extends Employee1 {
    double grossSales;
    double commissionRate;
    public CommissionEmployee(String firstName, String lastName, String nationalID, double grossSales, double commissionRate) {
        super(firstName, lastName, nationalID);
        this.grossSales = Math.max(grossSales, 0);
        this.commissionRate = Math.max(commissionRate, 0);
    }
    public double earning() {
        return grossSales * commissionRate;
    }
    public void display() {
        System.out.println("\nCommission Employee:");
        super.display();
        System.out.println("Gross Sales: " + grossSales + ", Commission Rate: " + commissionRate);
    }
}
class BasePlusCommissionEmployee extends CommissionEmployee {
    double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String nationalID, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, nationalID, grossSales, commissionRate);
        this.baseSalary = Math.max(baseSalary, 0);
    }
    public double earnings() {
        return baseSalary + super.earning();
    }
    public void display() {
        System.out.println("\nBase Plus Commission Employee:");
        super.display();
        System.out.println("Base Salary: " + baseSalary);
    }
}

public class Lab7Task1 {
    public static void main(String[] args) {
        Employee1[] employees = new Employee1[4];

        employees[0] = new SalariedEmployee("Muhammad", "Ali", "111-111", 800.00);
        employees[1] = new CommissionEmployee("Tarwan", "Kumar", "22-22-222", 10000, 0.86);
        employees[2] = new BasePlusCommissionEmployee("Fabeeha", "Fatima", "33-33-3333", 5000, 0.04, 300);
        employees[3] = new HourlyEmployee("Hussnain", "Ali", "444-44-44", 16.46, 45);

        for (Employee1 emp : employees) {
            emp.display();
            System.out.println("Earnings: $" + emp.earning());
        }

    }
}