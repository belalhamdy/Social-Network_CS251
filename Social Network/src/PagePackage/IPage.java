package PagePackage;

import UserPackage.IUser;

public interface IPage {

    void like(IUser user);

    int getnLikes();
    void setnLikes(int nlikes);

    void addAdmin(IUser user);
    void removeAdmin(IUser user);

    void setPicture(String picture);
    String getPicture();

    String getId();
    void setId(String id);

    String getName();
    void setName(String name);
}
