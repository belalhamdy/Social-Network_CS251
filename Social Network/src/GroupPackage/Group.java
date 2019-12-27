package GroupPackage;

import MessagePackage.IMessage;
import PostPackage.Post;
import UserPackage.User;

import java.util.List;

public class Group implements IGroup{
    private String id;
    private String name;
    private String picture;
    private String type;
    public void addAdmin(User user) {

    }
    public void removeAdmin(User user) {

    }

    public void addPost(Post post) {
    }

    public List<IMessage> getMessages() {
        return null;
    }

    public void addMessage(IMessage msg) {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
    public String getPicture() {
        return picture;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String setName() {
        return null;
    }
}
