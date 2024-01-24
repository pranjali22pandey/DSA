package recursion_1.src;

public class Main {

    public static void printnumber(int n){
        if (n ==0){
            return;
        }
        System.out.println(n);
        printnumber(n-1);

    }
    public static void main(String[] args) {

        int n = 5;
        printnumber(n);
    }
}
//recursion calls are always in stack
// stack will be
