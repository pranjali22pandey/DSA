public class factorial {



        public static long calculateFactorial(int n) {
            if (n < 0) {
                throw new IllegalArgumentException("Input must be a non-negative integer");
            }
            if (n == 0 || n == 1) {
                return 1;
            }
            return n * calculateFactorial(n - 1);
        }

        public static void main(String[] args) {
            // Example usage:
            int number = 5;  // Change this number for testing
            long factorialResult = calculateFactorial(number);

            System.out.println("Factorial of " + number + " is: " + factorialResult);
        }


}
