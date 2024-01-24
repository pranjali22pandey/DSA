
// Implement a function isPalindromeString that takes a string as input and returns true if it's a palindrome, false otherwise.
import java.util.*;

public class palindromeString{
    public static boolean isPalindromeString(String input){

   int left = 0;
   int right = input.length() - 1 ;

   while(left<right){
      if (input.charAt(left)!= input.charAt(right)){
       return false;
   }
   left++;
   right --;


    }

return true;



}
public static void main(String args[]){

 Scanner sc = new Scanner(System.in);
    System.out.println("enter the string to check : ");
 String test = sc.nextLine();



boolean result = isPalindromeString(test);
if(result){
    System.out.println("string is a palindrome");
}
else{
    System.out.println("string is not a palindrome");
}


}}
