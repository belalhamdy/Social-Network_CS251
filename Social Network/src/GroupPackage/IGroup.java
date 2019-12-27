package GroupPackage;

import MessagePackage.IGroupMessage;
import PostPackage.IPost;
import UserPackage.IUser;

import java.util.List;

public interface IGroup {
    void addAdmin(IUser user);
    void removeAdmin(IUser user);

    void addPost(IPost post);

    List<IGroupMessage> getMessages();
    void addMessage(IGroupMessage msg);

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
