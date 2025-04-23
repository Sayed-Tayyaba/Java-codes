public class Vehicle {
    int no_of_seats;
    int no_of_wheels;
    Vehicle(int no_of_seats,int no_of_wheels){
        this.no_of_seats=no_of_seats;
        this.no_of_wheels=no_of_wheels;
    }
    void display(){
        System.out.println("Seats:"+no_of_seats+" "+"Wheels:"+no_of_wheels);
    }
    public static void main(String[] args) {
        Vehicle car=new Vehicle(5,4);
        Vehicle motorcycle=new Vehicle(2,2);
        System.out.println("Car");
        car.display();
        System.out.println("Motorcycle");
        motorcycle.display();
    }
}
