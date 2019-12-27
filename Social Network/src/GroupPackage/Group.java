package GroupPackage;

import MessagePackage.IGroupMessage;
import PostPackage.IPost;
import UserPackage.IUser;

import java.util.List;

public class Group implements IGroup{
    private String id;
    private String name;
    private String picture;
    private String type;
    public void addAdmin(IUser user) {

    }
    public void removeAdmin(IUser user) {

    }
    public void addPost(IPost post) {

    }

    public List<IGroupMessage> getMessages() {
        return null;
    }

    public void addMessage(IGroupMessage msg) {

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
