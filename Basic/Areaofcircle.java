import java.util.Scanner;

public class Areaofcircle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        float rad= sc.nextFloat();
        float area= 3.14f * rad *rad;
        System.out.println("The area is:"+area);   
    }
}