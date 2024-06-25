import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre the value A:");
        int A =sc.nextInt();
        System.out.println("entre the value B:");

        int B =sc.nextInt();
        System.out.println("entre the value C:");

        int C =sc.nextInt();
        int avg=(A+B+C)/3;
        System.out.println("The Average  is: "+ avg); 
    }
}
