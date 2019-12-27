package GroupPackage;

import UserPackage.IUser;

public interface IClosedGroup extends IGroup {
    void approveMembership(IUser user);
    void requestMembership(IUser user);
}
