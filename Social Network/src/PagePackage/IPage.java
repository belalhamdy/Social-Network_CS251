package PagePackage;

import PostPackage.IPost;
import UserPackage.IUser;

public interface IPage {

    void like(IUser user);

    void addPost(IPost post);

    int getnLikes();

    void addAdmin(IUser user);
    void removeAdmin(IUser user);

    void setPicture(String picture);
    String getPicture();

    String getId();

    String getName();
    void setName(String name);
}
