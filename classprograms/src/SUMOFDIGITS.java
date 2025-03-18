import java.util.Scanner;

public class SUMOFDIGITS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits : ");
        int digits = sc.nextInt();
        int sum = 0;
       while (digits != 0) {
           sum += digits % 10;
           digits /= 10;
       }

       System.out.println(" the sum of the entered no is : " + sum);
    }
}
