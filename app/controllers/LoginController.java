package controllers;


import init.DbInit;
import play.Logger;
import play.data.DynamicForm;
import play.data.Form;

import play.mvc.Controller;
import play.mvc.Result;

import views.html.*;

/**
 * Created by davemedvedev on 12/6/16.
 */
    public class LoginController extends Controller {

    public static String uname;
    public static String pass;

    public Result index() {
        return ok(login.render("Your new application is ready."));
    }

    public Result mainpage() {
        return ok(user.render("Your new application is ready."));
    }
    public Result login() {
        DynamicForm dynamicForm = Form.form().bindFromRequest();
        Logger.info("Username is: " + dynamicForm.get("username"));
        Logger.info("Password is: " + dynamicForm.get("password"));
        uname = dynamicForm.get("username");
        pass = dynamicForm.get("password");
        DbInit.connectDB();
        return mainpage();

    }




}
