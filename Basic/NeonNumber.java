public class NeonNumber {

    public static void main(String[] args) {
        int num =9;
        //step 1 square 
        int Square=num*num;

        //step 2  calculate the sum of digit 
        int sum =0;
        int temp=Square;
        while (temp!=0) {
            int digit =temp %10;
            sum += digit;
            temp /=10;
        }
        // Step 3: Check if it is a Neon Number
        if (sum == num) {
            System.out.println(num + " is a Neon Number.");
        } else {
            System.out.println(num + " is not a Neon Number.");
        }
    }
}