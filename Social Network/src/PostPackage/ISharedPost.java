package PostPackage;

import UserPackage.IUser;

public interface ISharedPost extends IPost {
    void setSharer(IUser sharer);
    IUser getSharer();
}
