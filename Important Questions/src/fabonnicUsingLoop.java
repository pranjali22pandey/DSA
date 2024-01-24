
import java.util.*;
public class fabonnicUsingLoop {
    public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
        System.out.println("write the limit ");
    int limit = sc.nextInt();


        int a = 0;
        int b = 1;
        int c;

        for (int i =0 ; i<limit; i++){
            System.out.print(a);
            c = a+b;
            a=b;
            b=c;

        }



    }
}
