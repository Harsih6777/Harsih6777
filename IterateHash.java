import java.util.Map;

import java.util.HashMap;

class IterateHash{

  public static void main(String[] args){

  Map<String,String> hm = new HashMap<String,String>();

 hm.put("What", "harish.org");

 hm.put("Do", "practice.harish.org");

 hm.put("you", "code.harish.org");

 hm.put("Mean", "quiz.harish.org");

 for(String name : hm.keyset())
  
    System.out.println("key:" + name);



  for(String url: hm.values())
  
    System.out.println("value:" + url);

}
}

