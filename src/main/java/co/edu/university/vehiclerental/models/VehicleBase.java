package co.edu.university.vehiclerental.models;

import co.edu.university.vehiclerental.enums.GasType;
import co.edu.university.vehiclerental.enums.VehicleType;

public abstract class VehicleBase implements VehicleInterface {
    private String licensePlate;
    private String model;
    private int totalKm;
    private int year;
    private double priceByKm;
    private double priceByTime;
    private String vehicleStatus;
    private boolean available;
    private GasType gasType;
    private double price;
    private String color;
    private VehicleType vehicleType;

    public VehicleBase(String licensePlate, String model, int totalKm, int year, double priceByKm, double priceByTime, String vehicleStatus, boolean available, GasType gasType, double price, String color, VehicleType vehicleType) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.totalKm = totalKm;
        this.year = year;
        this.priceByKm = priceByKm;
        this.priceByTime = priceByTime;
        this.vehicleStatus = vehicleStatus;
        this.available = available;
        this.gasType = gasType;
        this.price = price;
        this.color = color;
        this.vehicleType = vehicleType;
    }

    public void rentVehicle() {
        this.available = false;
    }

    public void returnVehicle() {
        this.available = true;
    }

    public Double calcRentByKm(float km) {
        return km * this.getPriceByKm();
    }

    public Double calcRentByTime(int time) {
        return time * this.getPriceByTime();
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTotalKm() {
        return totalKm;
    }

    public void setTotalKm(int totalKm) {
        this.totalKm = totalKm;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPriceByKm() {
        return priceByKm;
    }

    public void setPriceByKm(double priceByKm) {
        this.priceByKm = priceByKm;
    }

    public double getPriceByTime() {
        return priceByTime;
    }

    public void setPriceByTime(double priceByTime) {
        this.priceByTime = priceByTime;
    }

    public String getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(String vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    public GasType getGasType() {
        return gasType;
    }
    public void setGasType(GasType gasType) {
        this.gasType = gasType;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public VehicleType getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
