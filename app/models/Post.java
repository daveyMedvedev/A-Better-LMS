package models;

import com.fdflib.model.state.CommonState;

/**
 * Created by davemedvedev on 12/6/16.
 */
public class Post extends CommonState {

    public String title;
    public String content;
    public long sectionId;

    public Post()
    {
        super();
    }
    public Post(String inTitle, String inContent, long inSectionId)
    {
        this.title = inTitle;
        this.content = inContent;
        this.sectionId = inSectionId;
    }
}
