package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fdflib.model.entity.FdfEntity;
import com.google.gson.Gson;
import init.DbInit;
import models.Post;
import models.User;
import models.UserPost;
import play.Logger;
import play.data.DynamicForm;
import play.data.Form;
import play.libs.Json;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;
import services.PostService;
import services.UserService;
import models.UserPost;
import views.html.user;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by davemedvedev on 12/6/16.
 */
public class PostController extends Controller {

    private long postId;
    private long userId;


    public Result getAllPosts() {
        PostService ps = new PostService();
        List<Post> allPosts = ps.getAllPosts();
        return ok(Json.toJson(allPosts));
    }

    public Result getUserPostByIds(Long userId, Long postId) {
        PostService ps = new PostService();
        List<FdfEntity<UserPost>> posts = ps.getUserPostByIds(userId, postId);
        return ok(Json.toJson(posts));
    }

    public Result deletePost() {
        DynamicForm dynamicForm = Form.form().bindFromRequest();

        Logger.info("First is: " + dynamicForm.get("postId"));

        postId = Long.valueOf(dynamicForm.get("postId"));

        PostService ps = new PostService();

        ps.deletePost(ps.getPostById(postId));


        return ok(user.render("Your new application is ready."));
    }




    public Result savePost() {
        DynamicForm dynamicForm = Form.form().bindFromRequest();
        Logger.info("Title is: " + dynamicForm.get("title"));
        Logger.info("Content is: " + dynamicForm.get("sectionId"));
        Logger.info("Section ID is: " + dynamicForm.get("sectionId"));


        PostService ps = new PostService();
        Post newPost = new Post();

        newPost.content = dynamicForm.get("content");
        newPost.sectionId = Long.valueOf(dynamicForm.get("sectionId"));
        newPost.title = dynamicForm.get("title");

        ps.savePost(newPost);

        UserService us = new UserService();
        List<FdfEntity<User>> existingUser = us.getUserByUsername(LoginController.uname);

        if(existingUser != null && existingUser.size() > 0) {
            userId = existingUser.get(0).entityId;
        }


        List<Post> uPoster = new ArrayList<>();
        uPoster.add(newPost);

        ps.savePostsForUser(userId, uPoster);

        return getAllPosts();


    }

}



