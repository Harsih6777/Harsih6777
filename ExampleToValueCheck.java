import java.util.HashMap;


 public class ExampleToValueCheck{
    public static void main(String args[]) {
        
    
    HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
 
    
    hashmap.put(11,"Apple");
    hashmap.put(22,"Banana");
    hashmap.put(33,"Mango");
    hashmap.put(44,"Pear");
    hashmap.put(55,"PineApple");
 
   
    boolean flag = hashmap.containsValue("Mango");
    System.out.println("String Mango exists in HashMap? : " + flag);
 
    boolean flag2 = hashmap.containsValue("Grapes");
    System.out.println("String Grapes exists in HashMap? : " + flag2);
 
    }

}
 