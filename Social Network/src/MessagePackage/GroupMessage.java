package MessagePackage;

import GroupPackage.Group;

public class GroupMessage extends Message {
    private Group group;

    public void setGroup(Group group) {
        this.group = group;
    }
    public Group getGroup() {
        return group;
    }
}
