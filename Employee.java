public class Employee {

    String name;
    int year_of_joining;
    int salary;
    String address;
    Employee(String n,int y,int s,String a){
        name=n;
        year_of_joining=y;
        salary=s;
        address=a;
    }
    void display(){
        System.out.println(name+year_of_joining+salary+address);
//        System.out.println("Name"+name);
//        System.out.println("Year_of_joining"+year_of_joining);
//        System.out.println("Salary"+salary);
//        System.out.println("Address"+address);
    }
    public static void main(String[] args) {
        Employee e1=new Employee("Eman",12-3-2023,30000,"Dadu");
        Employee e2=new Employee("Aliza",30-5-2024,20000,"Hyd");
        System.out.println("name"+"year_of_joining"+"salary"+"address");
        e1.display();
        e2.display();;

    }
}
