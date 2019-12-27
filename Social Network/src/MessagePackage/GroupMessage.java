package MessagePackage;

import GroupPackage.Group;

public class GroupMessage extends Message {
    private Group group;

    GroupMessage(Group group, String content) {
        super(content);
        this.group = group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Group getGroup() {
        return group;
    }
}
