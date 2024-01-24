import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class BinarySearch {


    public static int binarySearch(int[]arr,int key,int l){


        int start=0;
        int end= l -1;

        while(start<=end){

            int mid = (start+end)/2;
            if(mid==key) {
                return mid;
            }
           if(mid<key) {

               start= mid+1;
           }
           else{

               end= mid-1;
           }


        }



      return -1;

    }


    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int[] arr= new int[l];



        for(int i = 0 ; i<l;i++){
            arr[i]= sc.nextInt();
        }


        int k = sc.nextInt();

        System.out.println(binarySearch(arr, k,l));


        // for(int i = 0; i<l; i++){
            //System.out.println(arr[i]);
        }//



    }

