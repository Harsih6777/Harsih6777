import java.util.HashMap;

class Delete {

 public static void main(String[] args){

   HashMap<String,Integer> hm = new HashMap<String,Integer>();

 hm.put("Wallet",500);

  hm.put("Belt",600);

  hm.put("Bag",700);

 System.out.println(hm.size());

 System.out.println("Map = "+hm);

 hm.clear();

 System.out.println("Map after removing all = "+hm);
   
  System.out.println(hm.size());
}
}