package UserPackage;

import MessagePackage.PersonalMessage;

import java.util.List;

public class User implements IUser {
    private String name;
    private String id;
    private String password;
    private String username;
    private String email;
    private String picture;
    private GenderType gender;

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

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }

    public GenderType getGender() {
        return gender;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkPassword(String pass) {
        return pass.equals(password);
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getPicture() {
        return picture;
    }

    public void addFriend(User other) {
    }

    public List<User> getFriends() {
        return null;
    }

    public List<PersonalMessage> getMessages() {
        return null;
    }

    public void addMessage(PersonalMessage pm) {
    }

    public void setUsername(String userName) {
        this.username = userName;
    }

    public String getUsername() {
        return this.username;
    }
}
