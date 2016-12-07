package init;

import com.fdflib.model.entity.FdfEntity;
import com.fdflib.persistence.database.DatabaseUtil;
import com.fdflib.service.FdfServices;
import com.fdflib.util.FdfSettings;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import controllers.LoginController;
import models.*;
import play.Logger;
import play.api.Environment;
import services.PostService;
import services.RoleService;
import services.UserService;

import tyrex.security.container.helper.RolesRealm;

import java.util.ArrayList;
import java.util.List;
import controllers.LoginController;

/**
 * Created by dave
 */
@Singleton
public class DbInit {

    @Inject
    public DbInit(Environment environment) {
        Logger.info("Daves's Application start");

    }

    public static void connectDB() {

        // initialize 4DFLib
        // Create a array that will hold the classes that make up our 4df data model
        List<Class> myModel = new ArrayList<>();

        // add model objects
        myModel.add(User.class);
        myModel.add(Role.class);
        myModel.add(UserRole.class);
        myModel.add(Post.class);
        myModel.add(UserPost.class);


        // get the 4dflib settings singleton
        FdfSettings fdfSettings = FdfSettings.getInstance();
        fdfSettings.PERSISTENCE = DatabaseUtil.DatabaseType.MYSQL;
        fdfSettings.DB_PROTOCOL = DatabaseUtil.DatabaseProtocol.JDBC_MYSQL;
        fdfSettings.DB_ENCODING = DatabaseUtil.DatabaseEncoding.UTF8;
        fdfSettings.DB_HOST = "127.0.0.1:3306";
        fdfSettings.DB_NAME = "finalproject";
        fdfSettings.DB_ROOT_USER = "root";
        fdfSettings.DB_ROOT_PASSWORD = "password";
        fdfSettings.DB_USER = LoginController.uname;
        fdfSettings.DB_PASSWORD = LoginController.pass;

        // call the initialization of library!
        FdfServices.initializeFdfDataModel(myModel);

    }



    private void serviceTest() {

        User user1 = new User();
        user1.firstName = "David";
        user1.lastName = "Medvedev";
        user1.username = "e30guy";
        user1.password = "cars";
        user1.email = "david.medvedev1@marist.edu";

        UserService us = new UserService();
        user1 = us.save(user1);

        Role userRole = new Role();
        userRole.name = "user";
        userRole.description = "this is a user";

        Role studentRole = new Role();
        studentRole.name = "student";
        studentRole.description = "this is a student";

        Role facultyRole = new Role();
        facultyRole.name = "faculty";
        facultyRole.description = "this is a faculty";

        RoleService rs = new RoleService();
        rs.save(userRole);
        rs.save(studentRole);
        rs.save(facultyRole);

        List<Role> davesRoles = new ArrayList<>();
        davesRoles.add(userRole);
        davesRoles.add(studentRole);

        rs.saveRolesForUser(user1.id, davesRoles);

        // *********************** Post Test

        PostService ps = new PostService();
        Post post1 = new Post();

        post1.content = "This is a test post";
        post1.sectionId = 0;
        post1.title = "Test Post";

        post1 = ps.savePost(post1);

        /*
        UserPost davePost1 = new UserPost();
        davePost1.postId = post1.id;
        davePost1.userId = user1.id;
        */

        List<Post> davesPosts = new ArrayList<>();
        davesPosts.add(post1);

        ps.savePostsForUser(user1.id, davesPosts);

        // Logger output
        List<Role> allRoles = rs.getAllRoles();
        for(Role role: allRoles) {
            Logger.info("roles: " + role.name);
        }

        List<Post> allPosts = ps.getAllPosts();
        for(Post post: allPosts) {
            Logger.info("posts: " + post.title);
        }

        List<User> allUsers = us.getAllUsers();
        for(User user: allUsers) {
            Logger.info("user : " + user.username);
            List<Role> allUserRoles = rs.getRolesForUser(user.id);
            for(Role uRole: allUserRoles) {
                Logger.info("UserRole: " + uRole.name);
            }
        }

        // delete some stuff
        List<FdfEntity<Role>> studentRoleResults = rs.getRoleByName("student");
        Role studRole = null;
        if(studentRoleResults != null && studentRoleResults.size() > 0 && studentRoleResults.get(0).current != null) {
            studRole = studentRoleResults.get(0).current;
        }

        //delete me
        List<FdfEntity<User>> userResults = us.getUserByUsername("e30guy");
        User dave = null;
        if(userResults != null && userResults.size() > 0 && userResults.get(0).current != null) {
            dave = userResults.get(0).current;
        }

        //delete my post
        List<FdfEntity<UserPost>> postResults = ps.getUserPostByIds(dave.id, post1.id);
        UserPost post = null;
        if(postResults != null && postResults.size() > 0 && postResults.get(0).current != null) {
            post = postResults.get(0).current;
        }



        // delete my student role
        if(dave != null && studRole != null) {
            rs.deleteRoleForUser(dave.id, studRole.id);
        }


        // delete student role
        if(studRole != null) {
            rs.deleteRole(studRole.id);
        }

        // delete me
        if(dave!= null) {
            us.deleteUser(dave.id);
        }


        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // undelete student role
        if(studRole != null) {
            rs.undeleteRole(studRole.id);
        }

        // undelete me
        if(dave!= null) {
            us.undeleteUser(dave.id);
        }

        // undelete my post
        if(dave != null && davesPosts != null) {

        }


        // undelete daves student role
        if(dave != null && studRole != null) {
            rs.undeleteRoleForUser(dave.id, studRole.id);
        }


    }
}
