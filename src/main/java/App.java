// import java.util.HashMap;
//
// import spark.ModelAndView;
// import spark.template.velocity.VelocityTemplateEngine;
// import static spark.Spark.*;
//
// public class App {
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
//      www.mywebsite.com/detector?userInput=34&userSecondInput=43
//
//      queryParams.put("userInput", 34);
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
// }
