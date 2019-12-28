package Sys;

import UserPackage.IUser;

import java.util.ArrayList;
import java.util.List;

public class API {
    public static API instance;
    List<IUser> usersInSystem;

    private API() {
        usersInSystem = new ArrayList<>();
    }

    public static API getInstance() {
        if (instance == null) instance = new API();
        return instance;
    }

    public void registerUser(IUser newuser) {
        usersInSystem.add(newuser);
    }

    public IUser getUserByUsername(String username) {
        for (IUser usr : usersInSystem) {
            if (usr.getUsername().equals(username))
                return usr;
        }
        return null;
    }

}
