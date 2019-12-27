package CommentPackage;

import PostPackage.IPost;
import UserPackage.IUser;

public class Comment implements IComment {
    private String id;
    private String content;
    private IUser writer;
    private IPost post;

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }

    public void setPost(IPost post) {
        this.post = post;
    }
    public IPost getPost() {
        return post;
    }

    public void setWriter(IUser writer) {
        this.writer = writer;
    }
    public IUser getWriter() {
        return writer;
    }
}
