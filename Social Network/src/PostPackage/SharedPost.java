package PostPackage;

import UserPackage.IUser;

public class SharedPost extends Post implements ISharedPost{
    private IUser sharer;

    public void setSharer(IUser sharer) {
        this.sharer = sharer;
    }
    public IUser getSharer() {
        return sharer;
    }
}
