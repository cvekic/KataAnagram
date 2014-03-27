import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Mladjan on 27.3.2014.
 */
public class Anagram {


    public List<String> createAnagram(String inputString) {
        switch (inputString.length()) {
            case 0:
                return Arrays.asList("");
            case 1:
                return Arrays.asList(inputString);
            case 2:
                return Arrays.asList(inputString, reverse(inputString));
            default:
                return splitWord(inputString);
        }
    }

    private List<String> splitWord(String inputString) {
        List<String> anagrams = new ArrayList<String>();
        char[] chars = inputString.toCharArray();
        for (int i = 0; i < chars.length ; i++) {
            char head = chars[i];
            String thail = inputString.substring(0, i) + inputString.substring(i + 1);
            anagrams.addAll(combineAll(head, createAnagram(thail)));
        }
        return anagrams;
    }

    private List<String> combineAll(char head, List<String> thails) {
        List<String> combination = new ArrayList<String>();
        for (String thail : thails) {
            combination.add(Character.toString(head) + thail);
        }
        return combination;
    }


    private String reverse(String inputString) {
        return Character.toString(inputString.charAt(1)) + Character.toString(inputString.charAt(0));
    }
}