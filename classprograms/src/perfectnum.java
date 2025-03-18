import java.util.Scanner;

public class perfectnum {
    //A Perfect Number is a number equal to the sum of its proper divisors (excluding itself).

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {

            if (n % i == 0) {
                sum += i;
            }
        }

        if (sum == n) {
            System.out.println(n + " is Perfect number!  ");
        }else{
            System.out.println(n + " Is not a perfect number ! ");
        }
    }
}
