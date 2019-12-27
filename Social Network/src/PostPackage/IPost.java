package PostPackage;

import GroupPackage.IGroup;
import PagePackage.IPage;
import UserPackage.IUser;

public interface IPost {
    void like(IUser user);
    Post share(IUser user);

    void setId(String id);
    String getId();

    void setContent(String content);
    String getContent();

    void setGroup(IGroup group);
    IGroup getGroup();

    void setnLikes(int nLikes);
    int getnLikes();

    void setCreator(IUser creator);
    IUser getCreator();

    int getnShares();

    void setPage(IPage page);
    IPage getPage();

    String getPostLocation();
}
