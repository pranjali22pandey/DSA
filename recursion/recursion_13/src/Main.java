public class Main {
    public static char moveAllX(String str , int idx , int count , String newString ){
      if(idx == str.length())
      {
          for(int i = 0; i<count; i++){
              newString += "x";
          }
          System.out.println(newString);
          return 0;
      }

        char currChar = str.charAt(idx);
        if(currChar =='x'){
            count++;
           moveAllX(str , idx+1, count , newString);

        }

        else{
            newString += currChar;
            moveAllX(str,idx+1,count,newString);
        }


        return currChar;
    }
    public static void main(String[] args) {

        String str = "axbxcxdx";
        System.out.println(moveAllX(str, 0,0," "));
    }
}