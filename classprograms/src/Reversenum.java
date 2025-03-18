import java.util.Scanner;

public class Reversenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int reversnum = 0;
        while (num != 0) {
            //if 123 is input then num will be 123
            int digits = num % 10;
            // reversnum = 0*10 + 3 = 3
            reversnum = reversnum * 10 + digits;
            // num = 123 / 10
            num = num / 10;
        }
        System.out.println("the reversed number is : " + reversnum);
    }
}
