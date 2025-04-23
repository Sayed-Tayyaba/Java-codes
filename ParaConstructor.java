class Animal{
    Animal(){
        System.out.println("I am an animal");
    }
    Animal(String type){
        System.out.println("Type: "+type);
    }
}
class Dog extends Animal{
    Dog(){
        super("Animal");
        System.out.println("I am a dog");
    }
}


public class ParaConstructor {
    public static void main(String[] args) {
        Dog d=new Dog();

    }
}
