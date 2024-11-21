package co.edu.university.vehiclerental.services;

import co.edu.university.vehiclerental.enums.Role;
import co.edu.university.vehiclerental.models.UserEmployee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserEmployeeService {
    private ArrayList<UserEmployee> users;

    public UserEmployeeService() {
        users = new ArrayList<>();
    }


    public ArrayList<UserEmployee> getUsers() {
        return users;
    }

    public void addUser(UserEmployee user) {
        users.add(user);
    }

    public UserEmployee filerByUserName(String userName) {
        for (UserEmployee user : users) {
            if (user.getUserName().equals(userName)) {
                return user;
            }
        }
        return null;
    }

    public boolean loginValidate(String userName, String password) {
        UserEmployee userFilter = filerByUserName(userName);
        if(userFilter != null) {
            return userFilter.getPassword().equals(password);
        }
        return false;
    }

    public boolean loginValidateAdmin(String userName, String password) {
        UserEmployee userFilter = filerByUserName(userName);
        if(userFilter != null) {
            return userFilter.getPassword().equals(password) && userFilter.getRole().equals(Role.ADMIN);
        }
        return false;
    }
}
