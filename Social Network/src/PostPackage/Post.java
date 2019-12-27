package PostPackage;

import UserPackage.User;

public class Post {
    private String content;
    private String id;
    private int nLikes;
    private int nShares;
    private User Creator;
    private String relation;
    private Page page;
    private Group group;

    Post(User creator, String content){

    }

    public void setId(String id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void setnLikes(int nLikes) {
        this.nLikes = nLikes;
    }

    public void setCreator(User creator) {
        Creator = creator;
    }

    public void setnShares(int nShares) {
        this.nShares = nShares;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Group getGroup() {
        return group;
    }

    public int getnLikes() {
        return nLikes;
    }

    public int getnShares() {
        return nShares;
    }

    public Page getPage() {
        return page;
    }

    public String getRelation() {
        return relation;
    }

    public User getCreator() {
        return Creator;
    }

}
