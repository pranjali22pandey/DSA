public class insertion_sort {

        public static void main (String args[]){
            int[] nums = {5,6,2,3,1};
            int size = nums.length;


            System.out.println("before sort");
            for(int num:nums){
                System.out.print(num);
            }




            for(int i = 1; i<size;i++){

                int key = nums[i];
                int j = i -1;

                while( j>=0 && nums[j] > key){
                    nums[j+1]= nums[j];
                    j--;


                }

                nums[j+1] = key;



            }



            System.out.println(" ");
            System.out.println("after sort");

            for(int num:nums){
                System.out.print(num);
            }


        }






}
