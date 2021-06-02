 enum Level{

  LOW,

  MEDIUM,

  HIGH
}

 public class Main{

 public static void main(String[] args){

  Level myVar = Level.MEDIUM;


switch(myVar) {
 case LOW:

    System.out.println( "LOW Level");

break;

case MEDIUM:

 System.out.println( "MEDIUM Level");

break;

case HIGH:

 System.out.println( "HIG H Level");

break;

}
}
}