// Question2:Write a program that reads a set of integers,and the n prints the sum of the 2525even and odd integers.

import java.util.Scanner;

public class Alpha03 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number;
        int choice;
        int evensum=0;
        int oddsum=0;

        do{
            System.out.println("Enter the number :");
            number = sc.nextInt();

            if (number % 2 ==0) {
                evensum += number;
            
            }else{
                oddsum +=number;
            }
            System.out.println("Do you want to continue? Press 1 for yes or 0 for no");
            choice =sc.nextInt();
        }while(choice ==1);

        System.out.println("Sum of even numbers: " + evensum);
            System.out.println("Sum of odd numbers: " + oddsum);
    }
}
