import java.util.*;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());

    get("/results", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      String userInput = request.queryParams("userNumber");
      CoinCombination newMoney = new CoinCombination();
      Object[] results = newMoney.runCoinCombination(userInput).toArray();
      Object quarters = results[0];
      Object dimes = results[1];
      Object nickels = results[2];
      Object pennies = results[3];
      model.put("quarters", quarters);
      model.put("dimes", dimes);
      model.put("nickels", nickels);
      model.put("pennies", pennies);
      model.put("results", userInput);

      model.put("template", "templates/results.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());
   }


}
