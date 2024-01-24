import java.util.ArrayList;

public class Main {

    public static void printSubset(ArrayList<Integer>subset){
        for(int i =0; i<subset.size(); i++){
            System.out.println(subset.get(i)+" ");
        }
        System.out.println(" ");
    }
    //all subsets
    public static void findSubsets(int n , ArrayList<Integer>subset){
       if(n==0){
           printSubset(subset);
           return;
       }
  //add hoga

        findSubsets(n-1,subset);
        subset.add(n);

        //add nhi hoga

        findSubsets(n-1,subset);
        subset.remove(subset.size()-1);

    }
    public static void main(String[] args) {
        int n= 3;

        findSubsets(n,new ArrayList<Integer>());
    }
}