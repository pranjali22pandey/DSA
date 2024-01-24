public class Main {
    public static int calcuPower(int x, int n){

        if(n==0){
            return 1;
        }
        if (x==0){
            return 0;
        }


        int xPowNm1 = calcuPower(x,n-1);
        int xpowN = x*xPowNm1;
        return xpowN;
    }
    public static void main(String[] args) {
     int x=2 ,n =5;
     int ans = calcuPower(x,n);
        System.out.println(ans);

    }
}