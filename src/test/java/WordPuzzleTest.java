import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class WordPuzzleTest{

  // Test passes a single vowel into runWordPuzzle and expects it to return a single dash.
  @Test
  public void runWordPuzzle_replaceVowelwithDash_String() {
  WordPuzzle testWordPuzzle = new WordPuzzle();
  String expected = "-";
  assertEquals(expected, testWordPuzzle.runWordPuzzle("a"));
  }

  // Test passes a string of all five vowels into runWordPuzzle and expects it to return a string of five dashes.
  @Test
  public void runWordPuzzle_replaceAllFiveVowelswithFiveDashes_String() {
  WordPuzzle testWordPuzzle = new WordPuzzle();
  String expected = "-----";
  assertEquals(expected, testWordPuzzle.runWordPuzzle("aeiou"));
  }

  // Test passes a word into runWordPuzzle and expects it to return the word with dashes replacing the vowels.
  @Test
  public void runWordPuzzle_replaceAllVowelsInWordWithDashes_String() {
  WordPuzzle testWordPuzzle = new WordPuzzle();
  String expected = "-sp-rt-m-";
  assertEquals(expected, testWordPuzzle.runWordPuzzle("aspartame"));
  }

  // Test passes a mixed-case word into runWordPuzzle and expects it to return the word with dashes replacing the vowels.
  @Test
  public void runWordPuzzle_replaceMixedCaseVowelsWithDashes_String() {
  WordPuzzle testWordPuzzle = new WordPuzzle();
  String expected = "c-nV-V--l-tY";
  assertEquals(expected, testWordPuzzle.runWordPuzzle("cOnViViAlItY"));
  }

  // Test passes a sentence into runWordPuzzle and expects it to return the sentence with dashes replacing the vowels.
  @Test
  public void runWordPuzzle_replaceVowelsInSentenceWithDashes_String() {
  WordPuzzle testWordPuzzle = new WordPuzzle();
  String expected = "Th- -nly -mp-r-r -s th- -mp-r-r -f -c- cr--m.";
  assertEquals(expected, testWordPuzzle.runWordPuzzle("The only emperor is the emperor of ice cream."));
  }

  // Test passes a word with y functioning as a vowel into runWordPuzzle and expects it to return the sentence with a dash replacing the y.
  @Test
  public void runWordPuzzle_replaceYAsVowelWithDash_String() {
  WordPuzzle testWordPuzzle = new WordPuzzle();
  String expected = "chr-s-nth-m-m";
  assertEquals(expected, testWordPuzzle.runWordPuzzle("chrysanthemum"));
  }

}
