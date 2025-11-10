package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargest_Streams {
    public static void main(String[] args) {

        int[] arr = {10, 23, 43, 23, 56, 76, 12, 12, 23};

        // Find the second largest number using streams

        Integer secondLargest = Arrays.stream(arr)
                .boxed() // converts the int[] --> Stream<Integer>
                .distinct() // Remove duplicates
                .sorted(Comparator.reverseOrder()) //sort the descending order
                .skip(1)           //skipping the largest element
                .findFirst()         // pick the next element which is the second largest
                .orElse(null);  //Return null if not found

        System.out.println("Second largest element is: " + secondLargest);
    }
}
