import java.util.ArrayList;
import java.util.HashMap;


public class CoinCombination {
  public static ArrayList<Object> runCoinCombination(String input) {
    ArrayList<Object> changeGiven = new ArrayList<Object>();
    Integer quartersGiven = 0;
    Integer quartersLeft = 10;
    Integer dimesGiven = 0;
    Integer dimesLeft = 10;
    Integer nickelsGiven = 0;
    Integer nickelsLeft = 20;
    Integer penniesGiven = 0;
    Integer inputGiven = Integer.parseInt(input);

  while(inputGiven > 0){

    if (quartersLeft > 0 && inputGiven >= 25){
      quartersGiven++;
      quartersLeft--;
      inputGiven=inputGiven-25;
    }else if (dimesLeft > 0 && inputGiven >= 10){
      dimesGiven++;
      dimesLeft--;
      inputGiven=inputGiven-10;
    }else if (nickelsLeft > 0 && inputGiven >= 5){
      nickelsGiven++;
      nickelsLeft--;
      inputGiven=inputGiven-5;
    } else {
      penniesGiven = inputGiven;
      inputGiven = 0;
    }
  }
    changeGiven.add(quartersGiven);
    changeGiven.add(dimesGiven);
    changeGiven.add(nickelsGiven);
    changeGiven.add(penniesGiven);
    return changeGiven;
  }
}
