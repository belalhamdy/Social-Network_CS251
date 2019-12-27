package MessagePackage;

import UserPackage.IUser;

public class Message implements IMessage {
    private String id;
    private IUser sender;
    private String content;

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }

    public void setSender(IUser sender) {
        this.sender = sender;
    }
    public IUser getSender() {
        return sender;
    }
}
