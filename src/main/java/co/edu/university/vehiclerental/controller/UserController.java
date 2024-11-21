package co.edu.university.vehiclerental.controller;

import co.edu.university.vehiclerental.enums.Role;
import co.edu.university.vehiclerental.models.UserBase;
import co.edu.university.vehiclerental.models.UserClient;
import co.edu.university.vehiclerental.models.UserEmployee;
import co.edu.university.vehiclerental.services.UserClientService;
import co.edu.university.vehiclerental.services.UserEmployeeService;
import co.edu.university.vehiclerental.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserClientService userClientService;

    @Autowired
    private UserService userService;

    @Autowired
    private UserEmployeeService userEmployeeService;

    @PostMapping("/add/client/{userName}/{password}")
    public String addUserService(@RequestBody UserClient user, @PathVariable String userName, @PathVariable String password) {
        try {
            boolean loginValidate  = userEmployeeService.loginValidate(userName, password);
            if(loginValidate) {
                userClientService.addUser(user);
                return "Se agrego el usuario con exito";
            }else {
                return "Usuario o contraseña invalida";
            }
        } catch (Exception e) {
            return "No se pudo agregar el usuario" + e.getMessage();
        }
    }

    @PostMapping("/add/employee/{userName}/{password}")
    public String addUserService(@RequestBody UserEmployee user, @PathVariable String userName, @PathVariable String password) {
        try {
            boolean loginValidate  = userEmployeeService.loginValidateAdmin(userName, password);
            if(loginValidate) {
                userEmployeeService.addUser(user);
                return "Se agrego el empleado con exito";
            }else {
                return "Usuario o contraseña invalida";
            }
        } catch (Exception e) {
            return "No se pudo agregar el empleado" + e.getMessage();
        }
    }

    @GetMapping("/get")
    public List<UserBase> getUserService() {
        return userService.getAllUsers();
    }
}
