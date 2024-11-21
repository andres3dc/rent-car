package co.edu.university.vehiclerental.models;

public interface VehicleInterface {
    void rentVehicle();
    void returnVehicle();
    Double calcRentByKm(float km);
    Double calcRentByTime(int days);
}
