import java.util.Scanner;

public class Sumofnnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        int sum = n * (n + 1) / 2; // Using formula

        System.out.println("Sum of first " + n + " natural numbers: " + sum);
    }
}
