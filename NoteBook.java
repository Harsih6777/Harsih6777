class NoteBook{

NoteBook(){

 System.out.println("Default constructor");

 }

public void mymethod(){

  System.out.println("Void method of the class");
}

public static void main(String[] args){

 NoteBook Obj = new NoteBook();

Obj.mymethod();
}
}