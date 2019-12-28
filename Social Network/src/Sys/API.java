package Sys;

import CommentPackage.IComment;
import GroupPackage.IGroup;
import MessagePackage.IMessage;
import PagePackage.IPage;
import PostPackage.HashtagPackage.IHashtag;
import PostPackage.IPost;
import UserPackage.IUser;
import UserPackage.UserAccountView;
import UserPackage.UserView;

import java.util.ArrayList;
import java.util.List;

public class API {
    public static API instance;

    //Database Simulation
    List<IUser> usersInSystem;
    List<IPost> postsInSystem;
    List<IComment> commentsInSystem;
    List<IMessage> messagesInSystem;
    List<IGroup> groupsInSystem;
    List<IPage> pagesInSystem;
    List<IHashtag> hashtagsInSystem;

    private API() {
        usersInSystem = new ArrayList<>();
    }

    // Entry Point
    // Implemented user only
    public static void main(String[] args){
        while(true) {
            IUser currentUser = UserAccountView.showLoginRegisterForm();
            UserView currentUserView = new UserView(currentUser);
            while (currentUser == null) {
                currentUser = UserAccountView.showLoginRegisterForm();
                currentUserView = new UserView(currentUser);
            }
            currentUserView.showActionsMenu();
        }
    }
    public static API getInstance() {
        if (instance == null) instance = new API();
        return instance;
    }

    public void registerUser(IUser newUser) {
        usersInSystem.add(newUser);
    }

    public IUser getUserByUsername(String username) {
        for (IUser usr : usersInSystem) {
            if (usr.getUsername().equals(username))
                return usr;
        }
        return null;
    }

    public ArrayList<IPage> getPageByName(String name) {return null;}
    public ArrayList<IGroup> getGroupByName(String name) {return null;}
    public ArrayList<IHashtag> getPostsByHashtag(String name) {return null;}

}
