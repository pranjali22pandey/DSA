//total no of subsquences 2^n
//time complexity O(2^n)
// using hashset stores unique elements in the set

import java.util.HashSet;

public class Main {
    public static void subsequences(String str , int idx , String newString, HashSet<String> allSubseq){

        if(idx==str.length()){
            if(allSubseq.contains(newString)){
                return;
            }
            else{
                System.out.println(newString);
                allSubseq.add(newString);
                return;
            }

        }


        char currChar = str.charAt(idx);
        // to be
        subsequences(str,idx+1,newString+currChar , allSubseq);

        // not to be
        subsequences(str , idx+1, newString,allSubseq);

    }
    public static void main(String[] args) {

        String str = "aaa";
        HashSet<String> allSubseq= new HashSet<>();
        subsequences(str , 0," ", allSubseq);
    }
}