package UserPackage;

import MessagePackage.IPersonalMessage;

import java.util.Date;
import java.util.List;

public interface IUser {
    enum GenderType{Male, Female, Other}
    enum UserType{NormalUser, PremiumUser}

    void setId(String id);
    String getId();

    void setUsername(String username);
    String getUsername();

    void setName(String name);
    String getName();

    void setPassword(String pass);
    boolean checkPassword(String pass);

    void setEmail(String email);
    String getEmail();

    void setGender(GenderType gender);
    GenderType getGender();

    void setDateOfBirth(Date d);
    Date getDateOfBirth();

    void setPicture(String picture);
    String getPicture();

    void addFriend(IUser other);
    List<IUser> getFriends();
    List<IPersonalMessage> getMessages();

    void addMessage(IPersonalMessage pm);

    void setCountry(String country);
    String getCountry();

    void setUserType(UserType ut);
    UserType getUserType();
}
