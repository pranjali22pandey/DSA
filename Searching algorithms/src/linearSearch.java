public class linearSearch {

public static int linearSearch(int [] arr , int key){
    for(int i = 0 ; i<arr.length; i++){
        if(arr[i]==key){
            return i;
        }
    }
    return -1;
}

    public static void main(String args[]){
        int[] arr ={12, 13, 14, 16};
        int key = 14;


        System.out.println(linearSearch(arr,key));
    }
}
