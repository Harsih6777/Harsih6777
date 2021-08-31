import java.util.HashMap;


class HashMapDemo{

  public static void main(String[] args){

    HashMap <Integer,String>hashmapdemo = new HashMap  <Integer,String>();

    hashmapdemo .put(1, "Dhoni");

   hashmapdemo .put(2, "Raina");
  
    hashmapdemo .put(3, "Virat");

  String val = (String)hashmapdemo .get(3); 

     System.out.println("The Existing Key 3 Is: " + val);

}
}