package PagePackage;

import UserPackage.User;

public class IPage {
    private Page page;
    private PageView pageView;

    IPage() {
    }

    public int LikesCount() {
        return page.getnLikes();
    }

    public void Like(User user, Page page) {

    }

    public void changePageName(String name) {

    }

    public void changePagePicture(String picture) {

    }

    public void createPost() {
    }

    public void addAdmin(User user) {

    }

    public void removeAdmin(User user) {

    }

    public String getPicture() {
        return page.getPicture();
    }

    public String getId() {
        return page.getId();
    }

    public String getName() {
        return page.getName();
    }

    public int getnLikes() {
        return page.getnLikes();
    }

    public void setPicture(String picture) {
        this.page.setPicture(picture);
    }

    public void setId(String id) {
        this.page.setId(id);
    }

    public void setName(String name) {
        this.page.setName(name);
    }

    public void setnLikes(int nLikes) {
        this.page.setnLikes(nLikes);
    }

}
