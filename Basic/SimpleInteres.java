/* Example 1:

Input :  P = 10000
         R = 5
         T = 5
Output : 2500

Explanation - We need to find simple interest on 
Rs. 10, 000 at the rate of 5% for 5 
units of time.

Example 2:

Input :  P = 3000
         R = 7
         T = 1
Output : 210


 */
public class SimpleInteres {
    public static void main(String[] args) {
        int p=3000;
        int r=7;
        int t=1;

        int SI=(p*r*t)/100;
        System.out.println("Simple Interest is: " +SI);  

    }
}
