public class Main {
    public static int calcuPower(int x, int n){

        if(n==0){
            return 1;
        }
        if (x==0){
            return 0;
        }

       if(n%2 ==0){
           return calcuPower(x,n/2)*calcuPower(x,n/2);
       }
       else {
           return calcuPower(x,n/2)*calcuPower(x,n/2)*x;
       }

    }
    public static void main(String[] args) {
        int x=2 ,n =5;
        int ans = calcuPower(x,n);
        System.out.println(ans);

    }
}