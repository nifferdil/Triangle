import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
public static void main(String[] args) {

    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
        HashMap<String, Object> model = new HashMap<String, Object>();
        model.put("template", "templates/home.vtl");
        return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

//     get("/detector", (request, response) -> {
//        HashMap<String, Object> model = new HashMap<String, Object>();
//       model.put("template", "templates/detector.vtl");
//
//      String userInputtedNumber1 = request.queryParams("userInput1");
//      Integer side1 = isEquilateral(userInputtedNumber1);
//      String userInputtedNumber2 = request.queryParams("userInput2");
//      Integer side2 = isEquilateral(userInputtedNumber2);
//      String userInputtedNumber3 = request.queryParams("userInput3");
//      Integer side3 = isEquilateral(userInputtedNumber3);
//
//
//      String triangle = isTriangle1(userInputtedNumber1, userInputtedNumber2, userInputtedNumber3);
//      model.put("side1", side1);
//      model.put("side2", side2);
//      model.put("side3", side3);
//      model.put("userInput1", userInputtedNumber1);
//      model.put("userInput2", userInputtedNumber2);
//      model.put("userInput3", userInputtedNumber3);
//      return new ModelAndView(model, layout);
//   }, new VelocityTemplateEngine());
//
//
  }
}
