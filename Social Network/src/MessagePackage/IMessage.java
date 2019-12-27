package MessagePackage;

import UserPackage.IUser;

public interface IMessage {

    void setId(String id);
    String getId();

    void setContent(String content);
    String getContent();

    void setSender(IUser sender);
    IUser getSender();
}
