import java.sql.SQLOutput;
import java.util.Scanner;

public class Primenum {
    public static void main(String[] args) {
        System.out.println("enter a number to check prime number : ");
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();

        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("The number is a prime number");
        } else {
            System.out.println("The number is not a prime number");
        }

    }
}
