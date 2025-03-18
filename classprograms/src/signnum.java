import java.util.Scanner;

public class signnum {
    public static void main(String[] args) {
        System.out.println("enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0){
            System.out.println("It is negative number");
        } else if (n>0) {
            System.out.println("It is positive number");

        }else{
            System.out.println("It is zero");
        }
    }
}
