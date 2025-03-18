
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        double val = 20.0 ;
//        while (val >1){
//            System.out.println(val);
//            val /=2 ;
//        }
//
//        for(int a=0 ; a<10 ;a++ ){
//            System.out.println(a);
//
//        } // intialize -> condition -> body-> update


        ArrayList<String> list = new ArrayList<>();
        list.add("hello world");
        list.add("Foo ");
        list.add("test");
        list.add("1234");
        System.out.println(list);
        ArrayList<String> list1 = new ArrayList<>(List.of("hello world", "Foo", "test", "1234"));
        System.out.println(list1);
        for (String s : list1) {
            System.out.println(s);
        }


    }
}
