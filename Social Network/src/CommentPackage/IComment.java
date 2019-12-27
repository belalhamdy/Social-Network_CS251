package CommentPackage;

import PostPackage.IPost;
import UserPackage.IUser;

public interface IComment {

    void setId(String id);
    String getId();

    void setContent(String content);
    String getContent();

    void setPost(IPost post);
    IPost getPost();

    void setWriter(IUser writer);
    IUser getWriter();
}
