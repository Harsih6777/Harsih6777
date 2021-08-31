import java.util.HashMap;
  
public class Hash_Map {
    public static void main(String[] args)
    {
  
       
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
  
      
        hash_map.put(7, "Dhoni");
        hash_map.put(45, "Rohit");
        hash_map.put( 18, "Virat");
       
       
        System.out.println("Initial Mappings are: " + hash_map);
  
       
        System.out.println("Pairs key '7' present? " + 
        hash_map.containsKey(7));
  
        
        System.out.println("Pairs key '03' present? " + 
        hash_map.containsKey(03));

      System.out.println(hash_map.size());

    }
}