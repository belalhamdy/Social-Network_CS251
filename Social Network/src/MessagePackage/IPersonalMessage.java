package MessagePackage;

import UserPackage.IUser;

public interface IPersonalMessage extends IMessage {
    void setTo(IUser to);
    IUser getTo();
}
