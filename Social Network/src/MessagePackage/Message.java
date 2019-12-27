package MessagePackage;

import UserPackage.User;

public class Message {
    private String id;
    private User sender;
    private String content;

    Message(String content) {
        this.content = content;
    }

    Message(User sender, String content) {
        this.content = content;
        this.sender = sender;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public User getSender() {
        return sender;
    }
}
