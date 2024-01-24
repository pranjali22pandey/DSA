
import java.util.List;
import java.util.Collections;

//find the second largest number from the list
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class secondLargest {

    public static Integer secLargest(List<Integer> numbers) {
        if (numbers == null || numbers.size() < 2) {
            // Return null to indicate that the list has less than two elements
            return null;
        }

        // Create a mutable ArrayList and then sort it
        List<Integer> mutableList = new ArrayList<>(numbers);
        Collections.sort(mutableList, Collections.reverseOrder());

        return mutableList.get(1);
    }

    public static void main(String args[]) {
        List<Integer> numberList = List.of(1, 12, 34, 87, 37, 99, 76, 24, 5, 78);

        Integer secondLargest = secLargest(numberList);

        if (secondLargest != null) {
            System.out.println("Second largest is " + secondLargest);
        } else {
            System.out.println("List has less than two numbers");
        }
    }
}
