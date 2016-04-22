import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class coinCombinationTest{

// the app takes the input and returns the output
//   @Test
// public void runCoinCombination_getInputReturnOutput_ArrayList() {
//   CoinCombination testCoinCombination = new CoinCombination();
//   ArrayList<Object> expected = new ArrayList<Object>();
//   expected.add(2);
//   assertEquals(expected, testCoinCombination.runCoinCombination("50"));
//   }

  //the app gets the input and returns the equivalent in quarters
  @Test
public void runCoinCombination_getInputReturnEquivalentQuarters_ArrayList() {
  CoinCombination testCoinCombination = new CoinCombination();
  ArrayList<Object> expected = new ArrayList<Object>();
  expected.add(2);
  expected.add(0);
  expected.add(0);
  expected.add(0);
  assertEquals(expected, testCoinCombination.runCoinCombination("50"));
  }

//App gets the input and returns the equivalent in quarters and dimes
  @Test
public void runCoinCombination_getInputReturnEquivalentquartersAndDimes_ArrayList() {
  CoinCombination testCoinCombination = new CoinCombination();
  ArrayList<Object> expected = new ArrayList<Object>();
  expected.add(3);
  expected.add(1);
  expected.add(0);
  expected.add(0);
  assertEquals(expected, testCoinCombination.runCoinCombination("85"));
  }

  //App gets the input and returns the equivalent in dimes
  //   @Test
  // public void runCoinCombination_getInputReturnEquivalentDimes_ArrayList() {
  //   CoinCombination testCoinCombination = new CoinCombination();
  //   ArrayList<Object> expected = new ArrayList<Object>();
  //   expected.add(0);
  //   expected.add(8);
  //   assertEquals(expected, testCoinCombination.runCoinCombination("80"));
  //   }

    //App gets the input and returns the equivalent in quarters and dimes and nickels
      @Test
    public void runCoinCombination_getInputReturnEquivalentQandDandN_ArrayList() {
      CoinCombination testCoinCombination = new CoinCombination();
      ArrayList<Object> expected = new ArrayList<Object>();
      expected.add(3);
      expected.add(1);
      expected.add(1);
      expected.add(0);
      assertEquals(expected, testCoinCombination.runCoinCombination("90"));
      }

    //App gets the input and returns the equivalent in nickels ans pennies to test the //nickels
      @Test
    public void runCoinCombination_getInputReturnEquivalentNickelsandP_ArrayList() {
      CoinCombination testCoinCombination = new CoinCombination();
      ArrayList<Object> expected = new ArrayList<Object>();
      expected.add(0);
      expected.add(0);
      expected.add(1);
      expected.add(4);
      assertEquals(expected, testCoinCombination.runCoinCombination("9"));
      }

      //App gets the input and returns the equivalent in quarters and dimes and nickels //and pennies
        @Test
      public void runCoinCombination_getInputReturnEquivalentQandDandNandP_ArrayList() {
        CoinCombination testCoinCombination = new CoinCombination();
        ArrayList<Object> expected = new ArrayList<Object>();
        expected.add(3);
        expected.add(1);
        expected.add(1);
        expected.add(3);
        assertEquals(expected, testCoinCombination.runCoinCombination("93"));
        }

      //App gets the input and returns the equivalent in pennies
        @Test
      public void runCoinCombination_getInputReturnEquivalentPennies_ArrayList() {
        CoinCombination testCoinCombination = new CoinCombination();
        ArrayList<Object> expected = new ArrayList<Object>();
        expected.add(0);
        expected.add(0);
        expected.add(0);
        expected.add(4);
        assertEquals(expected, testCoinCombination.runCoinCombination("4"));
        }


}
