package co.edu.university.vehiclerental.controller;

import co.edu.university.vehiclerental.dto.RentVehicle;
import co.edu.university.vehiclerental.dto.ResponseFilter;
import co.edu.university.vehiclerental.models.VehicleBase;
import co.edu.university.vehiclerental.services.CarService;
import co.edu.university.vehiclerental.services.UserEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/vehicle/car")
public class CarController {
    @Autowired
    private CarService carService;
    @Autowired
    private UserEmployeeService userEmployeeService;

    @PostMapping("/add/{userName}/{password}")
    public String addCarService(@RequestBody VehicleBase car, @PathVariable String userName, @PathVariable String password) {
        try {
            boolean userValidation = userEmployeeService.loginValidateAdmin(userName, password);
            if (userValidation) {
                carService.addCar(car);
                return "Se agrego correctamente el carro";
            }else {
                return "No tienes permiso para agregar un carro";
            }
        } catch (Exception e) {
            return "No se pudo agregar el carro" + e.getMessage();
        }
    }

    @PostMapping("/rent-vehicle/{userName}/{password}")
    public String rentVehicle(@RequestBody RentVehicle dataRent, @PathVariable String userName, @PathVariable String password) {
        try {
            boolean userValidation = userEmployeeService.loginValidate(userName, password);
            if (userValidation) {
                return carService.rentVehicle(dataRent.getDocumentNumber());
            }else {
                return "No tienes permiso para rentar un carro";
            }
        } catch (Exception e) {
            return "No se pudo rentar el carro" + e.getMessage();
        }
    }

    @GetMapping("/filter-color/{color}")
    public ArrayList<ResponseFilter> filterColor(@PathVariable String color) {
        try {
            return carService.filterByColor(color);
        } catch (Exception e) {
            return null;
        }
    }
}
