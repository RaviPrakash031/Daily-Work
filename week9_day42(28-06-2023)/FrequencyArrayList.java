import java.util.*;
public class FrequencyArrayList {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(2);
        numbers.add(4);
      // Count the frequency of number 2 in the ArrayList
        int frequency = Collections.frequency(numbers, 2);
      // Display the result
        System.out.println("Frequency of number 2: " + frequency);
    }
}
