package GroupPackage;

import MessagePackage.IMessage;
import PostPackage.Post;
import UserPackage.User;

import java.util.List;

public interface IGroup {
    void addAdmin(User user);
    void removeAdmin(User user);

    void addPost(Post post);

    List<IMessage> getMessages();
    void addMessage(IMessage msg);

    void setName(String name);

    void setId(String id);
    String getId();

    void setPicture(String picture);
    String getPicture();

    void setType(String type);
    String getType();

    String getName();
    String setName();
}
