package MessagePackage;

import GroupPackage.IGroup;

public interface IGroupMessage extends IMessage {
    void setGroup(IGroup group);
    IGroup getGroup();
}
