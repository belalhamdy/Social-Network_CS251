package GroupPackage;

import GroupPackage.Group;
import UserPackage.User;

public class IGroup {
    private Group group;
    private GroupView groupView;

    IGroup() {

    }

    public void addAdmin(User user) {

    }

    public void removeAdmin(User user) {

    }

    public void createPost() {
    }

    public void viewMessages() {

    }

    public void approveMember(User user) {

    }

    public void createGroup() {

    }

    public void requestMembership(User user) {

    }

    public void addToRequestList(User user) {

    }

    public void reviewRequestList(){

    }

    public void setName(String name) {
        this.group.setName(name);
    }

    public void setId(String id) {
        this.group.setId(id);
    }

    public void setPicture(String picture) {
        this.group.setPicture(picture);
    }

    public void setType(String type) {
        this.group.setType(type);
    }

    public String getName() {
        return this.group.getName();
    }

    public String getId() {
        return this.group.getId();
    }

    public String getPicture() {
        return this.group.getPicture();
    }

    public String getType() {
        return this.group.getType();
    }
}
