package exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* Emphasize the use of List and Map interface implementations focusing on sorting and grouping data.

The class DataOrganizer only has the method HashMap<String, ArrayList<Integer>> groupAndSort(ArrayList<Integer> numbers). Note that in the method returns a map with String as the key and ArrayList as the value.

The method groups numbers in the parameter array into two lists within the map:

Key Even returns list of even numbers, sorted in ascending order.

Key Odd returns list of odd numbers, sorted in descending order. */
public class DataOrganizer {

    public HashMap<String, ArrayList<Integer>> groupAndSort(ArrayList<Integer> numbers) {
        HashMap<String, ArrayList<Integer>> groupedNumbers = new HashMap<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }
        Collections.sort(evenNumbers);
        Collections.sort(oddNumbers, Collections.reverseOrder());
        groupedNumbers.put("Even", evenNumbers);
        groupedNumbers.put("Odd", oddNumbers);
        return groupedNumbers;
    }

}
