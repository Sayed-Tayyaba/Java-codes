class Person{
    String First_name;
    String Last_name;
     Person(String First_name,String Last_name){
        this.First_name=First_name;
        this.Last_name=Last_name;
    }
    public void displayDetails(){
        System.out.println("First Name:"+First_name+" "+Last_name);
    }
}
class Student extends Person{
     String studentid;
     String course;
     String teachername;
      Student(String First_name,String Last_name,String studentid,String course,String teachername){
         super(First_name,Last_name);
         this.studentid=studentid;
         this.course=course;
         this.teachername=teachername;
     }
     public void displayDetails(){
         super.displayDetails();
         System.out.println("Student ID: " +studentid);
         System.out.println("Course: " + course);
         System.out.println("Teacher: " +teachername);
     }
}
class Teacher extends Person{
    String subjectName;
    double salary;
    Teacher(String First_name, String Last_name, String subjectName, double salary){
        super(First_name,Last_name);
        this.subjectName=subjectName;
        this.salary=salary;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Subject:"+subjectName);
        System.out.println("Salary:"+salary);
    }
}
public class Lab6Task3 {
    public static void main(String[] args) {
   Student s1=new Student("Tayyaba","Shah","S123","Calculas","Sir Suleman");
   Student s2=new Student("Aliza","Shah","S345","Java","Mam Asia");

   Teacher t1=new Teacher("Sir Suleman","Pathan","Calculas",85000);
   Teacher t2=new Teacher("Sir GM","Mallah","English",87000);

        System.out.println("STUDENT 1:");
        s1.displayDetails();

        System.out.println("\nSTUDENT 2:");
        s2.displayDetails();

        System.out.println("\nTEACHER 1:");
        t1.displayDetails();

        System.out.println("\nTEACHER 2:");
        t2.displayDetails();
    }
}
