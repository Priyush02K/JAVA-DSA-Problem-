import java.util.*;
public class ASCII {
    
    public static void main(String[] args) {
        char ch;
        int ascii;
        System.out.println("entre the value");
        Scanner sc =new Scanner(System.in);
        ch=sc.next().charAt(0);

        ascii=ch;
        System.out.println("\nASCII Value = " +ascii);
    }
}
