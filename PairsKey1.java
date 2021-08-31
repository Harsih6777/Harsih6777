import java.util.HashMap;
  
public class PairsKey1 {
    public static void main(String[] args){
    
  
       
        HashMap<String, Integer> pairskey1 = new HashMap<String, Integer>();
  
        
        pairskey1.put("Harish", 26);
     
        pairskey1.put("Nathan", 02);
        pairskey1.put("Seetha", 30);
        
  
       
        System.out.println("Initial Mappings are: " + pairskey1);
  
        
        System.out.println("Is the key 'Harish' present? " + 
        pairskey1.containsKey("Harish"));
  
       
        System.out.println("Is the key 'Roman' present? " + 
        pairskey1.containsKey("Roman"));

    System.out.println(pairskey1.size());
    }
}


