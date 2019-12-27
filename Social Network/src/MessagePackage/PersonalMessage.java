package MessagePackage;

import UserPackage.IUser;

public class PersonalMessage extends Message {
    private IUser to;

    public void setTo(IUser to) {
        this.to = to;
    }
    public IUser getTo() {
        return to;
    }
}
