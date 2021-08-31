import java.util.HashMap;

class Keys{

  public static void main(String[] args){

            HashMap<Integer, String> keys = new HashMap<Integer, String>();

  keys.put(7, "Dhoni");
 
    keys.put(3, "Raina");
  
    keys.put(18, "Virat");
 
 System.out.println("Initial Mapping:" + keys);

  System.out.println( "Is the key '7' present? " + keys.containskey(7));

   System.out.println( "Is the key '5' present? " + keys.containskey(5));
  
   System.out.println( "Is the key '18' present? " + keys.containskey(18));

}
}




