import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
   public static void main(String[] args){
   int n = 100;
    for(int i= 1; i<= n; i++){
        if(i%5 == 0 && i%3==0)
            System.out.println("fizzbuzz");
        else if (i%5==0) {
            System.out.println("buzz");
        } else if (i%3==0) {
            System.out.println("fizz");
        }
        else{
            System.out.println(i + " ");
        }
    }
   }
}

