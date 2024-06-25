import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random ran =new Random();
        System.out.println("Random Number using random, class:");
        for(int i=1;i<5;i++){
            System.out.println(ran.nextInt(100));
        }
        System.out.println("\nRandom number using random method:");
        for(int i=1;i<=5;i++){
            System.out.println(Math.random());
        }
    }
}
