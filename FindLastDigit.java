public class FindLastDigit {

    public static int lastDigit(int number) {
        return Math.abs(number)%10;
    }
    public static void main(String[] args) {
        int num1=3852;
        int num2=804;

        System.out.println("Last digit of "+num1+" is: "+lastDigit(num1));
        System.out.println("Last digit of "+num2+" is: "+lastDigit(num2));
    }
}
