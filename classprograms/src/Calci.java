import java.util.Scanner;

public class Calci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number : ");
        double a = sc.nextDouble();
        System.out.println("enter second number : ");
        double b = sc.nextDouble();

        System.out.println("Addition of the numbers is "+(a+b));
        System.out.println("Subtraction of the numbers is "+(a-b));
        System.out.println("Multiplication of the numbers is "+(a*b));
        System.out.println("Division of the numbers is "+(a/b));
        System.out.println("Remainder of the numbers is "+(a%b));

    }
}

