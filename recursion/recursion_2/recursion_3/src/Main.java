public class Main {
    public static void printSum(int n){
        if(n==6){

            return;
        }

        System.out.println(n);
        printSum(n+1);
    }
    public static void main(String[] args) {
        int n=1;
        printSum(n);
    }
}