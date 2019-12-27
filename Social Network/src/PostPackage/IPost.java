package PostPackage;

import GroupPackage.Group;
import PagePackage.Page;
import UserPackage.User;

public interface IPost {
    void like(User user);
    Post share(User user);

    void setId(String id);
    String getId();

    void setContent(String content);
    String getContent();

    void setGroup(Group group);
    Group getGroup();

    void setnLikes(int nLikes);
    int getnLikes();

    void setCreator(User creator);
    User getCreator();

    int getnShares();

    void setPage(Page page);
    Page getPage();

    String getPostLocation();
}
