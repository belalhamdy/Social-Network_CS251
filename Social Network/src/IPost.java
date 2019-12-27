import javax.crypto.spec.PSource;

public class IPost {
    private Post post;
    private PostView postView;

    IPost(){

    }

    public void Like(User user, Post post){

    }

    public void share(User user, Post post){

    }

    public void createPost(User user){

    }

    public void createPost(Group group){

    }

    public void createPost(Page page){

    }

    public void publishPost(){

    }

    public void setId(String id) {
        this.post.setId(id);
    }

    public void setContent(String content) {
        this.post.setContent(content);
    }

    public void setGroup(Group group) {
        this.post.setGroup(group);
    }

    public void setnLikes(int nLikes) {
        this.post.setnLikes(nLikes);
    }

    public void setCreator(User creator) {
        this.post.setCreator(creator);
    }

    public void setnShares(int nShares) {
        this.post.setnShares(nShares);
    }

    public void setPage(Page page) {
        this.post.setPage(page);
    }

    public void setRelation(String relation) {
        this.post.setRelation(relation);
    }

    public String getId() {
        return this.post.getId();
    }

    public String getContent() {
        return this.post.getContent();
    }

    public Group getGroup() {
        return this.post.getGroup();
    }

    public int getnLikes() {
        return this.post.getnLikes();
    }

    public int getnShares() {
        return this.post.getnShares();
    }

    public Page getPage() {
        return this.post.getPage();
    }

    public String getRelation() {
        return this.post.getRelation();
    }

    public User getCreator() {
        return this.post.getCreator();
    }

}
