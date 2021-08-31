import java.util.HashMap;

public class Map {
    public static void main(String[] args){
    
       
        HashMap<Integer, String>
            map = new HashMap<Integer, String>();
  
        
        map.put(1, "Ajith");
        map.put(2, "Surya");
        map.put(null, "AjithSurya");
  
      
        int keyToBeChecked = 2;
  
        
        System.out.println("HashMap: "
                           + map);
  
        
        boolean isKeyPresent = map.containsKey(keyToBeChecked);
  
      
        System.out.println("Does key "
                           + keyToBeChecked
                           + " exists: "
                           + isKeyPresent);
    }
}
