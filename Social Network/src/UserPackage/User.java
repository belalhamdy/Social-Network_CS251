package UserPackage;

import MessagePackage.IPersonalMessage;

import java.util.Date;
import java.util.List;

public class User implements IUser {
    private String name;
    private String id;
    private String password;
    private String username;
    private String email;
    private String picture;
    private GenderType gender;
    private Date dateOfBirth;
    private String country;
    private UserType userType;

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

    public void setDateOfBirth(Date d) {
        this.dateOfBirth = d;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
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

    public void addFriend(IUser other) {
    }

    public List<IUser> getFriends() {
        return null;
    }

    public List<IPersonalMessage> getMessages() {
        return null;
    }

    public void addMessage(IPersonalMessage pm) {
    }

    public void setCountry(String country) {
        this.country=country;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public void setUserType(UserType ut) {
        userType = ut;
    }

    @Override
    public UserType getUserType() {
        return userType;
    }

    public void setUsername(String userName) {
        this.username = userName;
    }

    public String getUsername() {
        return this.username;
    }
}
