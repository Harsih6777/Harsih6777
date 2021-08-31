 import java.util.ArrayList;

   class Example{

   public static void main(String[] args){

  ArrayList<String> example = new ArrayList<>();

   example.add(args[0]);
  
      example.add(args[1]);
 
     example.add(args[2]);

      example.add(args[3]);

      example.add(args[4]);

 int size = example.size();


 
 System.out.println("ArrayList size: " + size);

for(int i = 0; i < example.size(); i++){

 System.out.println(example.get(i)+ "");

}
}
}


  
