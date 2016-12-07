package models;

import com.fdflib.model.state.CommonState;

/**
 * Created by davemedvedev on 12/6/16.
 */
public class UserPost extends CommonState {
    public UserPost() { super(); }
    public UserPost(long inUserId, long inPostId) {
        super();
        userId = inUserId;
        postId = inPostId;
    }
    public long userId;
    public long postId;
}
