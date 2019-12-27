enum GType{Male, Female, Other}
public class User {
    private String name;
    private String id;
    private String password;
    private String userName;
    private String email;
    private String picture;
    private String gender;
    private GType gType;

    User(String name,String id, String userName, String password){
        this.name = name;
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setgType(GType gType) {
        this.gType = gType;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getPicture() {
        return picture;
    }

    public String getUserName() {
        return userName;
    }
}
