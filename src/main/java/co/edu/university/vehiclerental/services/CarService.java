package co.edu.university.vehiclerental.services;

import co.edu.university.vehiclerental.dto.ResponseFilter;
import co.edu.university.vehiclerental.enums.VehicleType;
import co.edu.university.vehiclerental.models.VehicleBase;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CarService {
    private ArrayList<VehicleBase> carsList;

    public CarService() {
        carsList = new ArrayList<>();
    }

    public ArrayList<VehicleBase> getCarsList() {
        return carsList;
    }

    public void addCar(VehicleBase car) {
        carsList.add(car);
    }

    public VehicleBase findCar(String id) {
        for (VehicleBase car : carsList) {
            if(car.getLicensePlate() == id) {
                return car;
            }
        }
        return null;
    }

    public String rentVehicle(String id) {
        VehicleBase findCar = findCar(id);
        if(findCar != null) {
            if (findCar.isAvailable()) {
                findCar.rentVehicle();
                return "El vehiculo se ha rentado correctamente";
            } else {
                return "El vehiculo se encuntra alquilado";
            }
        } else {
            return "No se encontro el carro";
        }
    }

    public ArrayList<ResponseFilter> filterByColor(String color) {
        ArrayList<ResponseFilter> filtersList = new ArrayList<>();
        filtersList.add(new ResponseFilter(VehicleType.CAR, 0));
        filtersList.add(new ResponseFilter(VehicleType.MOTORCYCLE, 0));
        filtersList.add(new ResponseFilter(VehicleType.VAN, 0));

        for (VehicleBase car : carsList) {
            if (car.getColor().equals(color)) {
                if( car.getVehicleType().equals(VehicleType.CAR)) {
                    ResponseFilter filter = filtersList.get(0);
                    filter.setCount(filter.getCount() + 1);
                } else if (car.getVehicleType().equals(VehicleType.MOTORCYCLE)) {
                    ResponseFilter filter = filtersList.get(1);
                    filter.setCount(filter.getCount() + 1);
                } else {
                    ResponseFilter filter = filtersList.get(2);
                    filter.setCount(filter.getCount() + 1);
                }
            }
        }
        return filtersList;
    }
}
