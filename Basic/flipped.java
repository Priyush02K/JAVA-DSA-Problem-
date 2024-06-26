// Find the total number of bits needed to be flipped to convert x to y.
// Input: 65 80
// Output: 2

// counting set bits
// The idea is to take XOR of the given two integers. After calculating the XOR, the problem will reduce to
// counting set bits in the XOR output using Brian Kernighan algorithm.

import java.util.Scanner;

public class flipped {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int x =sc.nextInt();
        int y= sc.nextInt();
        int count =0;
        int n =x ^ y;

        while(n!=0){
            n= n & (n-1);
            count++;
        }
        System.out.println(count);
    }
}
