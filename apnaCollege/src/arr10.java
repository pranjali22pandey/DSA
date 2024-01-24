public class arr10 {



        public static int[] repeatedNumber(final int[] A) {
            long n = A.length;
            long sumActual = n * (n + 1) / 2;
            long sumSquaredActual = n * (n + 1) * (2 * n + 1) / 6;

            long sumGiven = 0;
            long sumSquaredGiven = 0;
            for (int num : A) {
                sumGiven += num;
                sumSquaredGiven += (long) num * num;
            }

            long diffSum = sumActual - sumGiven;
            long diffSumSquared = sumSquaredActual - sumSquaredGiven;

            long sum = diffSumSquared / diffSum;

            int repeated = (int) ((diffSum + sum) / 2);
            int missing = (int) (sum - repeated);

            int[] result = new int[]{repeated, missing};
            return result;
        }

        public static void main(String[] args) {
            int[] input = {3, 1, 2, 5, 3};
            int[] result = repeatedNumber(input);

            System.out.println("Repeated Number: " + result[0]);
            System.out.println("Missing Number: " + result[1]);
        }
    }


