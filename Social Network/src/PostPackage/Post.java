package PostPackage;

import GroupPackage.IGroup;
import PagePackage.IPage;
import UserPackage.IUser;

public class Post implements IPost {
    private String content;
    private String id;
    private int nLikes;
    private int nShares;
    private IUser Creator;
    private String relation;
    private IPage page;
    private IGroup group;


    public void like(IUser user) {

    }

    public Post share(IUser user) {
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

    public void setGroup(IGroup group) {
        this.group = group;
    }
    public IGroup getGroup() {
        return group;
    }

    public void setnLikes(int nLikes) {
        this.nLikes = nLikes;
    }
    public int getnLikes() {
        return nLikes;
    }

    public void setCreator(IUser creator) {
        Creator = creator;
    }
    public IUser getCreator() {
        return null;
    }

    public void setPage(IPage page) {
        this.page = page;
    }
    public IPage getPage() {
        return page;
    }

    public int getnShares() {
        return nShares;
    }

    public String getPostLocation() {
        return null;
    }
}
