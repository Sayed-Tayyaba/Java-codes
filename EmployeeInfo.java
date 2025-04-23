public class EmployeeInfo {

    int salary;
    int hours;
    void getInfo(int s,int h){
        salary=s;
        hours=h;
    }
    void AddWork(){
        if(hours>6){
            salary+=5;
        }
        else {
            System.out.println("Hours are less than 6 hours:");
        }
    }
void display(){
    System.out.println("Salary:"+salary);
}
    public static void main(String[] args) {
        EmployeeInfo e1=new EmployeeInfo();
        e1.getInfo(23000,5);
        e1.AddWork();
        e1.display();

    }
}
