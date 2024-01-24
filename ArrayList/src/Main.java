
//array list size is changeable and non continuous ... we can store objects ... in heap
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
         list.add(0);
         list.add(2);
        System.out.println(list);


        //get
        int element =list.get(0);
        System.out.println(element);


        //add in between
        list.add(1,1);
        System.out.println(list);

        //set element
        int element2 = list.set(1,8);
        System.out.println(list);


        //delete
        list.remove(1);
        System.out.println(list);

        //size
         int element3 = list.size();
        System.out.println(element3);


        //loops
        for(int i =0; i< list.size(); i++){
            System.out.println(list.get(i));
        }

        //sort
        Collections.sort(list);
        System.out.println(list);

    }
}