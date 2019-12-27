package PostPackage;

import GroupPackage.Group;
import PagePackage.Page;
import UserPackage.User;

public class Post implements IPost {
    private String content;
    private String id;
    private int nLikes;
    private int nShares;
    private User Creator;
    private String relation;
    private Page page;
    private Group group;


    public void like(User user) {

    }

    public Post share(User user) {
        return null;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
    public Group getGroup() {
        return group;
    }

    public void setnLikes(int nLikes) {
        this.nLikes = nLikes;
    }
    public int getnLikes() {
        return nLikes;
    }

    public void setCreator(User creator) {
        Creator = creator;
    }
    public User getCreator() {
        return null;
    }

    public void setPage(Page page) {
        this.page = page;
    }
    public Page getPage() {
        return page;
    }

    public int getnShares() {
        return nShares;
    }

    public String getPostLocation() {
        return null;
    }
}
