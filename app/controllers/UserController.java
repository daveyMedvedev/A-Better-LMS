package controllers;

import com.fdflib.model.entity.FdfEntity;


import models.Role;
import models.User;
import play.Logger;
import play.data.DynamicForm;
import play.data.Form;
import play.libs.Json;

import play.mvc.Controller;
import play.mvc.Result;

import services.UserService;
import views.html.user;

import java.util.List;

/**
 * Created by brian.gormanly on 9/26/16.
 */
public class UserController extends Controller {

    public long userId;

    public Result getAllUsers() {
        UserService us = new UserService();
        List<User> allUsers = us.getAllUsers();
        return ok(Json.toJson(allUsers));
    }

    public Result getUserByUsername(String username) {
        UserService us = new UserService();
        List<FdfEntity<User>> users = us.getUserByUsername(username);
        return ok(Json.toJson(users));
    }

    public Result deleteUser() {
        DynamicForm dynamicForm = Form.form().bindFromRequest();

        Logger.info("First is: " + dynamicForm.get("userId"));

        userId = Long.valueOf(dynamicForm.get("userId"));

        UserService us = new UserService();

       us.deleteUser(userId);


        return ok(user.render("Your new application is ready."));
    }





    public Result saveUser() {
        DynamicForm dynamicForm = Form.form().bindFromRequest();
        Logger.info("First is: " + dynamicForm.get("fname"));
        Logger.info("Last is: " + dynamicForm.get("lname"));
        Logger.info("Username is: " + dynamicForm.get("username"));
        Logger.info("Password is: " + dynamicForm.get("password"));
        Logger.info("Email is: " + dynamicForm.get("email"));


        UserService us = new UserService();
        User newUser = new User();

        newUser.firstName = dynamicForm.get("fname");
        newUser.lastName = dynamicForm.get("lname");
        newUser.username = dynamicForm.get("username");
        newUser.password = dynamicForm.get("password");
        newUser.email = dynamicForm.get("email");

        us.save(newUser);

        return ok(user.render("Your new application is ready."));



    }
}
