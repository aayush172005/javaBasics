import java.util.Scanner;

public class Largestdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int a = sc.nextInt();

        int max = 0 ;
        while(a>0) {
            int digit = a % 10;
            if(digit>max) {
                max = digit;
            }
            a = a / 10;
        }
        System.out.println(" Maximum digit is : "+max);
    }
}
