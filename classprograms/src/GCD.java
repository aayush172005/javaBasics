import java.util.Scanner;

public class GCD {
    // A GCD is of two integers is the largest positive integer that divides both integers without a remainder.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        int a1= Math.abs(a);
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();
        int b1 = Math.abs(b);// because to get a gcd we need to ignore the signs

        while(b1!=0){
            int temp = b1;
            b1 = a1 % b;
            a1 = temp;
        }
        System.out.println("The greatest common divisor is : " + a);

    }
}

