// Implement a function isArmstrongNumber that takes an integer and returns true if it's an Armstrong number, false otherwise.
import java.util.*;
public class Armstrong {

    public static void isArmstrong(int num){
        int c=num;
        int rem;
        int res=0;
        while(num>0){
          rem= num%10;
          res =(rem*rem*rem)+ res;
          num=num/10;
        }

        if(c == res)
            System.out.println("number is armstrong");
        else
            System.out.println("number is not");
    }


public static void main (String args[]){
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    isArmstrong(num);

}

}
