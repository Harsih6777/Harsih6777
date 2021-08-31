public class ReplaceString{

 public static void main(String[] args){

   StringBuilder str
            = new StringBuilder("HappySunday");
  
          System.out.println("String length is:"+str.length());
        System.out.println("String = "
                           + str.toString());
  
       
        StringBuilder strReturn = str.replace(6, 8, "XYZ ");
  
     
        System.out.println("After Replace() String = "
                           + strReturn.toString());
        String str = str.replace("XYZ");
int newLength = str.length;     
       
}
}