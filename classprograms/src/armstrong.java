import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int num = sc.nextInt();
        int og = num;
        int sum = 0;
        int digit = 0 ;
        int tmp = num;
        while (tmp != 0) {
            tmp /=10;
            digit++;
        }
        tmp = num;
        while (tmp != 0) {
            int rem = tmp % 10;
            sum += Math.pow(rem,digit);
            tmp /= 10;
        }

        if (sum == og) {
            System.out.println("The number is a armstrong number");
        }else{
            System.out.println("The number is not a armstrong number");

        }

    }
}
