package PagePackage;

import PostPackage.IPost;
import UserPackage.IUser;

public class Page implements IPage {
    private String name;
    private String id;
    private String picture;
    private int nLikes;

    Page(String name, String picture, int nLikes) {
        this.name = name;
        this.picture = picture;
        this.nLikes = nLikes;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
    public String getPicture() {
        return picture;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setnLikes(int nLikes) {
        this.nLikes = nLikes;
    }
    public int getnLikes() {
        return nLikes;
    }

    public void addAdmin(IUser user) {

    }

    public void removeAdmin(IUser user) {

    }

    public void like(IUser user) {

    }

    public void addPost(IPost post) {

    }

}
