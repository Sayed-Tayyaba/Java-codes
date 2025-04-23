public class lab5task3 {

    public static int lastdigit(int num){
       return Math.abs(num)%10;
    }


    public static void main(String[] args) {
        int num=3852;
        System.out.println("Last digit:" +num+"is"+" "+lastdigit(num));
    }
}
