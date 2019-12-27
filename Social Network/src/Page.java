public class Page {
    private String name;
    private String id;
    private String picture;
    private int nLikes;

    Page(String name, String picture, int nLikes) {
        this.name = name;
        this.picture = picture;
        this.nLikes = nLikes;
    }

    public String getPicture() {
        return picture;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getnLikes() {
        return nLikes;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setnLikes(int nLikes) {
        this.nLikes = nLikes;
    }
}
