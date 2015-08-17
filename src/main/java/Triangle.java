import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class Triangle {
  private int mSide1;
  private int mSide2;
  private int mSide3;
    // public static void main(String[] args) {
    //
    //     String layout = "templates/layout.vtl";
    //
    //     get("/", (request, response) -> {
    //         Map<String, Object> model = new HashMap<String, Object>();
    //         model.put("template", "templates/home.vtl");
    //         return new ModelAndView(model, layout);
    //     }, new VelocityTemplateEngine());
    //
    //     // www.mywebsite.com/detector?userInput=34&userSecondInput=43
    //     //
    //     // queryParams.put("userInput", 34);
    //
    //     get("/detector", (request, response) -> {
    //       Map<String, Object> model = new HashMap<String, Object>();
    //       model.put("template", "templates/detector.vtl");
    //
    //      String userInputtedNumber = request.queryParams("userInput");
    //
    //      String coins = coinCombination(userInputtedNumber);
    //      model.put("coins", coins);
    //      model.put("userInput", userInputtedNumber);
    //      return new ModelAndView(model, layout);
    //   }, new VelocityTemplateEngine());
    // }

    public Triangle(int side1, int side2, int side3) {
      mSide1 = side1;
      mSide2 = side2;
      mSide3 = side3;
    }

    public int getSide1() {
      return mSide1;
    }
    public int getSide2() {
      return mSide2;
    }
    public int getSide3() {
      return mSide3;
    }
}
