package PostPackage;

import UserPackage.User;

public class SharedPost extends Post{
    private User sharer;

    SharedPost(User creator, String content){
        super(creator,content);
    }

    public User getSharer() {
        return sharer;
    }

    public void setSharer(User sharer) {
        this.sharer = sharer;
    }
}
