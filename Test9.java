import java.util.ArrayList;
class Test9 {
   
       
        public static void main(String[] args){
  

      ArrayList<String> test9 = new ArrayList<>();
 
       

 
    test9.add(args[0]);

    test9.add(args[1]);

    test9.add(args[2]);
   
     test9.add(args[3]);
  
      test9.add(args[4]);

   
    int size = test9.size(); 
 System.out.println("ArrayList Size: " + size);
 
for(int i = 0; i < test9.size(); i++ ){

  
  System.out.println(test9.get(i)+ "");

}
}
}