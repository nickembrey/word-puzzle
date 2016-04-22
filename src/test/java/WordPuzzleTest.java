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

}
