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

    get("/detector", (request, response) -> {
       HashMap<String, Object> model = new HashMap<String, Object>();
       int side1 = Integer.parseInt(request.queryParams("userInput1"));
       int side2 = Integer.parseInt(request.queryParams("userInput2"));
       int side3 = Integer.parseInt(request.queryParams("userInput3"));

       Triangle myTriangle = new Triangle(side1, side2, side3);
       //
      //  model.put("userInput1", request.queryParams("userInput1"));
      //  model.put("userInput2", request.queryParams("userInput2"));
      //  model.put("userInput3", request.queryParams("userInput3"));
       model.put("myTriangle", myTriangle);

       model.put("template", "templates/detector.vtl");
       return new ModelAndView(model, layout);
     }, new VelocityTemplateEngine());



    //  String triangle = isTriangle(side1, side2, side3);
    //  model.put("side1", side1);
    //  model.put("side2", side2);
    //  model.put("side3", side3);
    //  model.put("userInput1", userInputtedNumber1);
    //  model.put("userInput2", userInputtedNumber2);
    //  model.put("userInput3", userInputtedNumber3);


  }
}
