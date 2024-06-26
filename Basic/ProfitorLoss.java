

//  - Write a program to take input from user for Cost Price (C.P.) and Selling Price(S.P.) and calculate Profit or Loss.
// Explanation : Formula for profit and loss
// Profit = S.P - C.P
// Loss = C.P - S.P
// (S.P is Selling Price and C.P is Cost Price)
// Enter cost price: 4000
// Enter selling price: 9560
// Profit = 5560

import java.util.Scanner;

public class ProfitorLoss {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int cp;
    int sp;
    System.out.println("Enter the cost Price : " );
    cp=sc.nextInt();

    System.out.println("Enter the selling price:   ");
    sp=sc.nextInt();

    int amt;
    if(cp>sp)
    {
    amt=cp-sp;
    System.out.print("The loss is : "+amt);
    }else if(cp<sp)
    {
    amt=sp-cp;
    System.out.print("The profit is : "+amt);
    }else{
    System.out.print("No Profit No Loss");
    }
  }  
}
