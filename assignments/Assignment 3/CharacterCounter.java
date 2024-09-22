package exercises;


/*The class CharacterCounter counts the number of occurrences of a character in a string.

The class has only the following method public Map<Character, Integer> count(String inputString).

The method accepts a String as input and counts the number of occurrences of each character in the string. The method returns a Map where the key is the character and the value is the count of that character in the string.

So, if the input string is hello the method will return a Map containing {e:1, h:1, l:2, o:1 }.

If the input string is empty, the method should return an empty HashMap.

Hints:

Use a HashMap to store the characters and their counts.

You may need to convert the input string to an array of characters.

Review the Java documentation for HashMap and String classes; you may find useful methods to simplify the implementation. */
import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {

    public Map<Character, Integer> count(String inputString) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        if (inputString == null || inputString.isEmpty()) {
            return charCountMap;
        }
        for (char c : inputString.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        return charCountMap;
    }
}
