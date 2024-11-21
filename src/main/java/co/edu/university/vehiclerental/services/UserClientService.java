package co.edu.university.vehiclerental.services;

import co.edu.university.vehiclerental.models.UserClient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserClientService {
    private ArrayList<UserClient> users;

    public UserClientService() {
        users = new ArrayList<>();
    }

    public ArrayList<UserClient> getUsers() {
        return users;
    }

    public void addUser(UserClient user) {
        users.add(user);
    }

    public UserClient getUserByDocument(String document) {
        for (UserClient user : users) {
            if (user.getDocumentNumber().equals(document)) {
                return user;
            }
        }
        return null;
    }
}
