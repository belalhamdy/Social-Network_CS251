public class PersonalMessage extends Message {
    private User to;

    PersonalMessage(User sender, String content, User to) {
        super(sender, content);
        this.to = to;
    }

    public void setTo(User to) {
        this.to = to;
    }

    public User getTo() {
        return to;
    }
}
