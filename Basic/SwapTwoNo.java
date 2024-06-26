import java.util.Scanner;

public class SwapTwoNo {
    public static void main (String arg[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 1st Number:");
        int x=sc.nextInt();

        System.out.println("Enter 2nd Number:");
        int y=sc.nextInt();

        x=x +y;
        y=x-y;
        x=x-y;

        System.out.println(x);
        System.out.println(y);


    }
}
