package PostPackage;

import UserPackage.User;

public class SharedPost extends Post{
    private User sharer;

    public void setSharer(User sharer) {
        this.sharer = sharer;
    }
    public User getSharer() {
        return sharer;
    }
}
