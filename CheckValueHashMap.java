import java.util.HashMap;

class CheckValueHashMap{

 public static void main(String[] args){

  HashMap hashmap = new HashMap();

  hashmap.put("key_1","value_1");

  hashmap.put("key_2","value_2");

  hashmap.put("key_3","value_3"); 

 boolean exists = hashmap.containsValue("value_2");

 System.out.println("value_2 exists in HashMap ? : " + exists);

}
}
 