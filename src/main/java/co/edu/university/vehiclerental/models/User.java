package co.edu.university.vehiclerental.models;

import co.edu.university.vehiclerental.enums.Role;
import co.edu.university.vehiclerental.enums.VisionCondition;

public class User extends UserClient {
    public User(double documentNumber, Role role, VisionCondition visionCondition) {
        super(documentNumber, role, visionCondition);
    }
}
