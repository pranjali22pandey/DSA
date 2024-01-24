
//   - Write a function isPrime to determine if a given positive integer is a prime number.
//
//   - Implement a function generatePrimesInRange that takes two integers start and end and returns a list of prime numbers in that range.
//
//   - Write a function countPrimesInRange that counts the total number of prime numbers in a given range.
public class primeNumber {

  public static boolean posPrime(int a){
      int p = a ;
      if(p<=1){
          return false;
      }
      for(int i = 2 ; i<= Math.sqrt(a);i++ )
      {
          if(a%i == 0){
              return false;
          }

      }

   return true;
  }


    public static void primeInRange(int b , int c){

      for(int i = b; i<=c ; i++){
          if(posPrime(i))
              System.out.print(i);

      }
        System.out.println(" ");
    }


    public static int countPrime(int b , int c){

      int count=0;
      for(int i = b ; i<=c;i++){
          if(posPrime(i))
              count++;
      }

      return count ;
    }


    public static void main (String args[]) {

        int a = 12;
        int b = 1;
        int c = 10;

        System.out.println(posPrime(a));
        primeInRange(b,c);
        System.out.println(countPrime(b,c));




    }
}
