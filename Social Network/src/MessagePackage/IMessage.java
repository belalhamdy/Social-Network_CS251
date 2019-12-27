package MessagePackage;

import GroupPackage.Group;
import UserPackage.User;

public class IMessage {
    private Message message;
    private MessageView messageView;

    IMessage(){

    }

    public void sendMessage(User src, User des){

    }

    public void sendGroupMessage(User src, Group group){

    }

    public void setId(String id) {
        this.message.setId(id);
    }

    public void setContent(String content) {
        this.message.setContent(content);
    }

    public void setSender(User sender) {
        this.message.setSender(sender);
    }

    public String getId() {
        return this.message.getId();
    }

    public String getContent() {
        return this.message.getContent();
    }

    public User getSender() {
        return this.message.getSender();
    }
}
