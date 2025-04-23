// Abstract base class
abstract class Animal1 {
    String name;
    int age;
    String gender;

    Animal1(String n, int a, String g) {
        name = n;
        age = a;
        gender = g;
    }

    void produceSound() {
        System.out.println("Animal Sound.");
    }

    // Static nested classes
    static class Dog extends Animal1 {
        Dog(String n, int a, String g) {
            super(n, a, g);
        }

        void produceSound() {
            System.out.println("Bow wow");
        }
    }

    static class Frog extends Animal1 {
        Frog(String n, int a, String g) {
            super(n, a, g);
        }

        void produceSound() {
            System.out.println("Rabbit");
        }
    }

    static class Kitten extends Animal1 {
        Kitten(String n, int a) {
            super(n, a, "Female");
        }

        void produceSound() {
            System.out.println("Meow (Kitten)");
        }
    }

    static class Tomcat extends Animal1 {
        Tomcat(String n, int a) {
            super(n, a, "Male");
        }

        void produceSound() {
            System.out.println("Meow (Tomcat)");
        }
    }
}

// Main class with main method
public class Lab7Task3 {
    public static void main(String[] args) {
        Animal1[] animals = {
                new Animal1.Dog("Moni", 4, "Male"),
                new Animal1.Frog("Sheela", 5, "Female"),
                new Animal1.Kitten("Ruhi", 8),
                new Animal1.Tomcat("Rocky", 6)
        };

        int sumDog = 0, countDog = 0;
        int sumFrog = 0, countFrog = 0;
        int sumKitten = 0, countKitten = 0;
        int sumTomcat = 0, countTomcat = 0;

        for (Animal1 animal : animals) {
            animal.produceSound();

            if (animal instanceof Animal1.Dog) {
                sumDog += animal.age;
                countDog++;
            }
            if (animal instanceof Animal1.Frog) {
                sumFrog += animal.age;
                countFrog++;
            }
            if (animal instanceof Animal1.Kitten) {
                sumKitten += animal.age;
                countKitten++;
            }
            if (animal instanceof Animal1.Tomcat) {
                sumTomcat += animal.age;
                countTomcat++;
            }
        }

        if (countDog > 0)
            System.out.println("Average Dog age = " + (sumDog / countDog));
        if (countFrog > 0)
            System.out.println("Average Frog age = " + (sumFrog / countFrog));
        if (countKitten > 0)
            System.out.println("Average Kitten age = " + (sumKitten / countKitten));
        if (countTomcat > 0)
            System.out.println("Average Tomcat age = " + (sumTomcat / countTomcat));
    }
}
