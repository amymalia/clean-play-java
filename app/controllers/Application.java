package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

/**
 * Adds controllers to application.
 */
public class Application extends Controller {

  /**
   * Application controller for the home page.
   * @return rendered page
   */
  public static Result index() {
    return ok(index.render("Your new application is ready."));
  }

}
