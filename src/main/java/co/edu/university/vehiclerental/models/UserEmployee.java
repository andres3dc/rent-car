package co.edu.university.vehiclerental.models;

import co.edu.university.vehiclerental.enums.Role;

public class UserEmployee extends UserBase {
    private String userName;
    private String password;
    private double salary;

    public UserEmployee(String documentNumber, Role role, String userName, String password, double salary) {
        super(documentNumber, role);
        this.userName = userName;
        this.password = password;
        this.salary = salary;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
