import java.util.Scanner;

public class countdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int digits = 0;
        while (num != 0) {
            digits++;
            num = num / 10;
        }
        System.out.println(" count of given  digits is :  " + digits);

    }
}
