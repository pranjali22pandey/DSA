public class Main {
    public static void main(String[] args) {

        //pattern1(5);
        //pattern2(4);
         //pattern3(5);
       // pattern4(4);
        //pattern5(5);
       // pattern6(5);
        //pattern7(5);
          //pattern8(5);
        //pattern9(5);
       // pattern10(5);
    }


    public static void pattern1(int n ){
        for(int row=1; row<= n; row++){
            for(int col= 1; col<=n ; col++){
                System.out.print("x");
            }
            System.out.println();
        }


    }

    public static void pattern2(int n){

        for(int row=1 ; row<= n ; row ++){
             for(int col=1 ; col <=row; col++){
                 System.out.print("*");
             }
            System.out.println();
        }

    }

    public static void pattern3(int n){

        for(int row=1 ; row<= n ; row ++){
            for(int col=1 ; col<= n - row + 1; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void pattern4(int n){

        for(int row=1 ; row<= n ; row ++){
            for(int col=1 ; col<= row ; col++){
                System.out.print(col);
            }
            System.out.println();
        }

    }

    public static void pattern5(int n){

        for(int row=0 ; row<=2* n ; row ++){
            int totalColRows= row >n? 2*n - row:row;
            for(int col=0 ; col< totalColRows ; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void pattern6(int n){

        for(int row=0 ; row<=2* n ; row ++) {
            int totalColRows = row > n ? 2 * n - row : row;
            int noOfSpaces = n - totalColRows;


            for (int s = 0; s < noOfSpaces; s++){
                System.out.print(" ");
        }
            for(int col=0 ; col< totalColRows ; col++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }




    }

    public static void pattern7(int n) {
       for(int row= 1; row<=n; row++)  {

           for(int s = 0; s< n-row; s++){
               System.out.print(" ");
           }


           for (int col = row; col>=1; col-- ){
               System.out.print(col);
           }
           for(int col=2; col<= row ; col++){
               System.out.print(col);
           }
           System.out.println();

       }



    }
    static void pattern8 (int n) {
        for (int row = 1; row <= 2 * n; row++) {

            int c = row > n ? 2 * n - row: row;

            for (int space = 0; space < n-c; space++) {
                System.out.print("  ");
            }

            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }
    static void pattern10(int n) {
        int originalN = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {
        for (int row = 1; row <= n; row++) {

            for (int space = 0; space < n-row; space++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }


}