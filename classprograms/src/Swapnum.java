import java.util.Scanner;

public class Swapnum {

         public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter two numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            sc.close();

            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("After swapping: a = " + a + ", b = " + b);
        }
}






