
import java.util.HashMap;
import java.util.*;
public class TreemapMethod{
    public static void main(String[] args) {
        TreeMap<Integer,String> obj=new TreeMap<Integer,String>();
                                    //IS EMPTY METHOD
        System.out.println("empty -->"+obj.isEmpty());
                                    //ADD METHOD
        obj.put(10,"karan");
        obj.put(9,"null");               
        obj.put(11,"mohan");
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

