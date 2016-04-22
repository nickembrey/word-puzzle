import java.util.ArrayList;
import java.util.HashMap;


public class WordPuzzle {

  public static String runWordPuzzle(String input) {

    char[] inputArray = input.toCharArray();
    char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
    String results = new String();
    int yIndex = 0;

    for(char letter : inputArray) {
      boolean isVowel = false;
      boolean vowelBeforeY = false;
      boolean vowelAfterY = false;
      if(letter == 'y') {
        if(yIndex == 0) {
          for(char vowel : vowels) {
            if(inputArray[yIndex + 1] == vowel) {
              vowelAfterY = true;
            }
          }
        } else if(yIndex == inputArray.length - 1) {
          for(char vowel : vowels) {
            if(inputArray[yIndex - 1] == vowel) {
              vowelBeforeY = true;
            }
          }
        } else {
          for(char vowel : vowels) {
            if(inputArray[yIndex + 1] == vowel) {
              vowelAfterY = true;
            }
          }
          for(char vowel : vowels) {
            if(inputArray[yIndex - 1] == vowel) {
              vowelBeforeY = true;
            }
          }
        }
        if (!vowelBeforeY && !vowelAfterY) {
          results += "-";
        }
      } else {
        for (char vowel : vowels) {
          if (letter == vowel) {
            results += "-";
            isVowel = true;
          }
        }
        if (!isVowel) {
          results += letter;
        }
        yIndex++;
      }
    }

    return results;

  }

}
