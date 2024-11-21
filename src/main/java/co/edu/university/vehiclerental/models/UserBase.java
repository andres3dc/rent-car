package co.edu.university.vehiclerental.models;

import co.edu.university.vehiclerental.enums.Role;

public abstract class UserBase implements UserInterface {
    public static final int CURRENT_YEAR = 2024;
    private String documentNumber;
    private Role role;

    public UserBase(String documentNumber, Role role) {
        this.documentNumber = documentNumber;
        this.role = role;
    }

    public int getAge(int yearOfBirth) {
        return CURRENT_YEAR - yearOfBirth;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }
    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }
}
