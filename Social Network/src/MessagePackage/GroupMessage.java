package MessagePackage;

import GroupPackage.IGroup;

public class GroupMessage extends Message implements IGroupMessage {
    private IGroup group;

    public void setGroup(IGroup group) {
        this.group = group;
    }
    public IGroup getGroup() {
        return group;
    }
}
