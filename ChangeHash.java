import java.util.HashMap;

 class ChangeHash{

 public static void main(String[] args){

 HashMap<String,Integer> Changehash = new HashMap<String,Integer>();

Changehash.put("hai", 101);

Changehash.put("boi", 102);

Changehash.put("sai", 103);

Changehash.put("pai", 103);
  
System.out.println(Changehash.size());

 System.out.println("HashMap: "
                           + Changehash.toString());
Changehash.replace("pai", 104);

  System.out.println("HashMap: "
                           + Changehash.toString());

System.out.println(Changehash.size());
}
}

 