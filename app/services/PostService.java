package services;

import com.fdflib.model.entity.FdfEntity;
import com.fdflib.service.impl.FdfCommonServices;
import models.*;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;


/**
 * Created by davemedvedev on 12/6/16.
 */
public class PostService extends FdfCommonServices {
    /**
     * Posts
     */

    public Post savePost(Post post) {
        save(Post.class, post);
        return post;
    }

    public List<Post> getAllPosts() { return this.getAllCurrent(Post.class); }
    public List<FdfEntity<Post>> getAllPostsWithHistory() { return this.getAll(Post.class); }
    public Post getPostById(Long id) { return getEntityCurrentById(Post.class, id); }
    public void deletePost(Post post) { setDeleteFlag(Post.class, post.id, -1, -1); }
    public void undeletePost(Post post) { removeDeleteFlag(Post.class, post.id, -1, -1); }


    /**
     *  UserPost services
     */
    public void savePostsForUser(long userId, List<Post> posts) {
        for(Post post : posts) {
            UserPost userPost = new UserPost(userId, post.id);
            List<FdfEntity<UserPost>> savedUserPosts;
            savedUserPosts = getUserPostByIds(userId, post.id);
            if(!savedUserPosts.isEmpty() && savedUserPosts.get(0).current != null &&
                    savedUserPosts.get(0).current.userId == userId &&
                    savedUserPosts.get(0).current.postId == post.id) {
                userPost.id = savedUserPosts.get(0).current.id;
            }
            save(UserPost.class, userPost);
        }
    }


    public List<FdfEntity<UserPost>> getUserPostByIds(long userId, long postId) {
        HashMap<String, String> fieldsAndValues = new HashMap<>();
        fieldsAndValues.put("userId", Long.toString(userId));
        fieldsAndValues.put("postId", Long.toString(postId));
        return getEntitiesByValuesForPassedFields(UserPost.class, fieldsAndValues);
    }

    public void deleteUserPost(UserPost userPost) {
        setDeleteFlag(UserPost.class, userPost.id, -1, -1);
    }

    public void undeleteUserPost(UserPost userPost) {
        removeDeleteFlag(UserPost.class, userPost.id, -1, -1);
    }

}
