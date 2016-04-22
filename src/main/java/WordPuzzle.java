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
        if(yIndex == 0) { // If y is at the start of the word, only check to see if the letter after is a vowel.
          for(char vowel : vowels) {
            if(inputArray[yIndex + 1] == vowel) {
              vowelAfterY = true;
            }
          }
        } else if(yIndex == inputArray.length - 1) { // If y is at the end of the word, only check to see if the letter before is a vowel.
          for(char vowel : vowels) {
            if(inputArray[yIndex - 1] == vowel) {
              vowelBeforeY = true;
            }
          }
        } else { // If y is not at the start or end of the word, check the letter before and the letter after to see if they are vowels.
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
        if (!vowelBeforeY && !vowelAfterY) { // If there is no vowel before or after y, then y is a vowel.
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
        yIndex++; // Allows the loop to check the location of y in the array so that it can check before and after y for vowels.
      }
    }

    return results;

  }

}
