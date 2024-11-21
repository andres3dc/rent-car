package co.edu.university.vehiclerental.dto;

import co.edu.university.vehiclerental.enums.VehicleType;

public class ResponseFilter {
    private VehicleType type;
    private int count;

    public ResponseFilter(VehicleType type, int count) {
        this.type = type;
        this.count = count;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
