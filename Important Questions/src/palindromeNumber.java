
// - Write a function isPalindromeNumber to determine if a given integer is a palindrome.

import java.util.Scanner;

public class palindromeNumber {
   public static boolean isPalindromeNumber(int num){

       int reversed = 0;
       int orignum = num;
       while(num>0){
        int digit = num%10;
        reversed = reversed*10 + digit;
        num /=10;
       }
      return orignum == reversed;
   }


public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    boolean result = isPalindromeNumber(num);
    if(result){
        System.out.println("num is palindrome");
    }
    else{
        System.out.println("num is not palindrome ");
    }



}}

