import java.util.HashMap;
public class Mixing {
    public static void main(String[] args)
    {
  
        
        HashMap<String, Integer> mixing= new HashMap<String, Integer>();
  
        
        mixing.put("Ajith", 10);
        
          mixing.put("Surya", 20);
       
          mixing.put("Adhi", 30);

       mixing.put("Harish", 26);
     
       mixing.put("Nathan", 02);
       mixing.put("Seetha", 30);
  
        System.out.println("Initial Mappings are: " +   mixing);
  
      
        System.out.println("Is the key 'Welcomes' present? " + 
         mixing.containsKey("Ajith"));
  
        
        System.out.println("Is the key 'World' present? " + 
       mixing.containsKey("Vijay"));

      System.out.println("Initial Mappings are: " + mixing);
  
        
        System.out.println("Is the key 'Harish' present? " + 
        mixing.containsKey("Harish"));
  
       
        System.out.println("Is the key 'Roman' present? " + 
        mixing.containsKey("Roman"));
   
      System.out.println(mixing.size());
 
    }
}
