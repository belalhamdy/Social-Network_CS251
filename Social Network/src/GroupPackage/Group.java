package GroupPackage;

public class Group {
    private String id;
    private String name;
    private String picture;
    private String type;

    Group(String name, String picture, String type){
        this.name = name;
        this.picture = picture;
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPicture() {
        return picture;
    }

    public String getType() {
        return type;
    }
}
