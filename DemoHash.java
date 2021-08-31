import java.util.HashMap;

 class DemoHash {

 public static void main(String[] args){
 
  HashMap<Integer, String> demohash = new HashMap<Integer, String>();

  demohash.put(10,"Never");

   demohash.put(20,"Ever");

   demohash.put(30,"Give");

    demohash.put(40,"Up");
System.out.println(demohash.size());

 System.out.println("Initial Mapping are:" + demohash);

   String returned_value = (String)demohash.remove(20);

System.out.println("Returned value is: " + returned_value);

 System.out.println("New map is:" + demohash);

 System.out.println(demohash.size());
}
}





