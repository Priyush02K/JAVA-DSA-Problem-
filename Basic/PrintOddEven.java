import java.util.Scanner;

public class PrintOddEven {
    public static void main (String arg []){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        if (number%2==0) {
            System.out.println("EVEN");
        }else{
            System.out.println("ODD");
        }

    }
}
