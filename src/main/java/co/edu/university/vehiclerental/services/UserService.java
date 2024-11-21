package co.edu.university.vehiclerental.services;

import co.edu.university.vehiclerental.models.UserBase;
import co.edu.university.vehiclerental.models.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
    private UserClientService userClientService;

    private ArrayList<UserBase> users;

    public UserService() {
        users = new ArrayList<>();
    }

    public ArrayList<UserBase> getAllUsers() {
        ArrayList<UserClient> userClients = userClientService.getUsers();
        ArrayList<UserBase> userBases = new ArrayList<>();

        for (UserClient userClient : userClients) {
            users.add(userClient);
        }
        return users;
    }
}
