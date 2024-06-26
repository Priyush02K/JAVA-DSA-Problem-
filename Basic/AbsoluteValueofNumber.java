import java.util.Scanner;

public class AbsoluteValueofNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the Number : ");;
        num= sc.nextInt();

        if (num<0) {
            num =num * -1;
        }
        System.out.println("the absolute value  is   " +num);
    }
}
