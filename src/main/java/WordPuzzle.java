import java.util.ArrayList;
import java.util.HashMap;


public class WordPuzzle {

  public static String runWordPuzzle(String input) {

    char[] inputArray = input.toCharArray();
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    String results = new String();

    for(char letter : inputArray) {
      Boolean isVowel = false;
      for (char vowel : vowels) {
        if (letter == vowel) {
          results += "-";
          isVowel = true;
        }
      }
      if (!isVowel) {
        results += letter;
      }
    }

    return results;

  }

}
