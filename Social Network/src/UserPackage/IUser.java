package UserPackage;

import MessagePackage.PersonalMessage;

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

    void setPicture(String picture);
    String getPicture();

    void addFriend(User other);
    List<User> getFriends();
    List<PersonalMessage> getMessages();

    void addMessage(PersonalMessage pm);
}
