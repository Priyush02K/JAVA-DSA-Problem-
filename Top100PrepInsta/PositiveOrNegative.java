/*
Example
Input : num = 11
Output : Positive

Check if a Number is Positive or Negative in Java
In this article, we will create a java program to check whether the number entered by the user is positive or negative. The number is demonstrated as positive or negative by comparing the entered number with the Zero(0). If the number entered by the user is greater than zero, then the number is positive, else if the number is less than zero, then the number is negative and else the number is zero.

N > 0 then, number is Positive.
N < 0 then, number is Negative.
N = 0 then, number is Zero.
*/
package PrepInsta;

import java.util.Scanner;


/**
 * PositiveOrNegative
 */
public class PositiveOrNegative {
  
    public static void main(String[] args) {
        int no;
        System.out.println("Entre the no:");
        Scanner sc =new Scanner(System.in);
        no=sc.nextInt();
        if (no> 0) {
            System.out.println ("The number is positive");

        }else if(no < 0){
            System.out.println ("The number is negative");

        }else{
            System.out.println ("Zero");

        }
    }
    
    

}
