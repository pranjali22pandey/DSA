public class selection_sort {

        public static void main (String args[]){
            int[] nums = {6,2,4,5,9,8};
            int size = nums.length;
            int temp;
            int minSize = -1;

            System.out.println("before sort");
            for(int num:nums){
                System.out.print(num);
            }


          for(int i = 0 ; i<size-1; i++){
              minSize = i;
              for(int j = i+1; j<size; j++){
                  if(nums[minSize] > nums[j]){
                      minSize = j;
                  }
              }

              temp= nums[minSize];
              nums[minSize]=nums[i];
              nums[i]= temp;



          }
            System.out.println(" ");
            System.out.println("after sort");

            for(int num:nums){
                System.out.print(num);
            }


        }




}
