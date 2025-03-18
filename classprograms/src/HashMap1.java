import java.util.HashMap;

public class HashMap1
{
    public static void main ( String[] args ){
        HashMap <Integer,String> KV= new HashMap<>();
        KV.put(2,"Hello World");
        KV.put(4,"foo");
        KV.put(5,"test");
        KV.put(1234,"1234");
        System.out.println(KV.get("Hello World"));
        System.out.println(KV);
         for( Integer key : KV.keySet()){
             System.out.println(key);

         }


         for(Integer key : KV.keySet()){
             String value = KV.get(key);
             System.out.println(key + "'s string is " + value);

         }


        for(int a=0 ; a<=10 ;a++ ){
            System.out.println("numbers from 0-10 : " + a);

        }

    }
}
