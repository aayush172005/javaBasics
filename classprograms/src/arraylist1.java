import java.util.ArrayList;
import java.util.Scanner;

public class arraylist1 {

    public static int sum(ArrayList<Integer> arrIn) {
        int out = 0;
        for (int x=0; x<arrIn.size(); x++) {

            out += arrIn.get(x);
        }
        return out;
    }


    public static void main(String[] args) {

        ArrayList<Integer> arr1 = new ArrayList<>();

        for (int x=0; x<4; x++) {
            arr1.add(10-x);
        }
        System.out.println(arr1);
        ArrayList<Integer> arr2 = arr1;
        System.out.println(arr2);
        int total = sum(arr1);
        System.out.println("total: " + total);


    }
}





