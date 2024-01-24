public class spaceWitUnderscore {
  public static String modifyString(String input){
  String modified ="";

  for( char c : input.toCharArray()){
      if(c == ' ')
          modified+= '_';
      else
          modified+= c;

  }

return modified;

  }



public static void main(String args[]){
    String ogString="this is a sample";
    String modifiedString= modifyString(ogString);

    System.out.println(ogString);
    System.out.println(modifiedString);
}

}
