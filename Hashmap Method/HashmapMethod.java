import java.util.HashMap;
import java.util.*;
public class hashmapMethod{
    public static void main(String[] args) {
        HashMap<Integer,String> obj=new HashMap<Integer,String>();
                                    //IS EMPTY METHOD
        System.out.println("empty -->"+obj.isEmpty());
                                    //ADD METHOD
        obj.put(1,"karan");
        obj.put(2,"null");               
        obj.put(3,"mahan");
        System.out.println(obj);
                                                             //CONTAINS KEY METHOD
        System.out.println("contains kay --->"+obj.containsKey(1));
                                                                    //CONTAINS VALUE METHOD
        System.out.println("contains value --->"+obj.containsValue("null"));
        
        HashMap<Integer,String> obj1=new HashMap<Integer,String>();
                                                                     //PUT ALL METHOD
        obj1.put(4,"sri");
        obj.putAll(obj1);
        System.out.println(obj);

                                           //KEY SET METHOD
        System.out.println("key sets --->"+obj.keySet());
                                                 //ENTRY SET METHOD
        System.out.println("entry set --->"+obj1.entrySet());
        System.out.println(obj);
                                //REMOVE KEY METHOD
        System.out.println(obj.remove(2));
                                      //REMOVE KEY AND VALUE METHOD
        System.out.println(obj.remove(4,"sri"));
        System.out.println(obj);





    }
}
