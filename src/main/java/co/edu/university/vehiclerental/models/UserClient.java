package co.edu.university.vehiclerental.models;

import co.edu.university.vehiclerental.enums.Role;
import co.edu.university.vehiclerental.enums.VisionCondition;

public class UserClient extends UserBase {
    private VisionCondition visionCondition;

    public UserClient(String documentNumber, Role role, VisionCondition visionCondition) {
        super(documentNumber, role);
        this.visionCondition = visionCondition;
    }
    public VisionCondition getVisionCondition() {
        return visionCondition;
    }
    public void setVisionCondition(VisionCondition visionCondition) {
        this.visionCondition = visionCondition;
    }
}
