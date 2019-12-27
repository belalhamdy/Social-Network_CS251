package CommentPackage;

import PostPackage.Post;
import UserPackage.User;

public class IComment {
    private Comment comment;
    private CommentView commentView;

    IComment(){

    }

    public void setContent(String content) {
        this.comment.setContent(content);
    }

    public void setId(String id) {
        this.comment.setId(id);
    }

    public void setPost(Post post) {
        this.comment.setPost(post);
    }

    public void setWriter(User writer) {
        this.comment.setWriter(writer);
    }

    public String getContent() {
        return comment.getContent();
    }

    public String getId() {
        return comment.getId();
    }

    public Post getPost() {
        return comment.getPost();
    }

    public User getWriter() {
        return comment.getWriter();
    }
}
