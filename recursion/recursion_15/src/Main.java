//total no of subsquences 2^n
//time complexity O(2^n)

public class Main {
    public static void subsequences(String str , int idx , String newString){

        if(idx==str.length()){
            System.out.println(newString);
            return;
        }


        char currChar = str.charAt(idx);
        // to be
        subsequences(str,idx+1,newString+currChar);

        // not to be
        subsequences(str , idx+1, newString);

    }
    public static void main(String[] args) {

        String str = "abc";
        subsequences(str , 0," ");
    }
}