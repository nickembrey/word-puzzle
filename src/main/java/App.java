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
      WordPuzzle puzzleGenerator = new WordPuzzle();

      String userString = request.queryParams("userString");
      request.session().attribute("userString", userString);
      String puzzle = puzzleGenerator.runWordPuzzle(userString);
      model.put("puzzle", puzzle);
      model.put("template", "templates/results.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());

    get("/guess", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      String userGuess = request.queryParams("userGuess");
      model.put("userGuess", userGuess);
      model.put("userString", request.session().attribute("userString"));
      model.put("template", "templates/guess.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());

   }

}
