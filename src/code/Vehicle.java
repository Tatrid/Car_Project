package code;

import org.springframework.beans.factory.annotation.Autowired;

public class Vehicle {
    public static Vehicle_Services vs;
    @Autowired
    public static Vehicle_Services getVs() {
        return vs;
    }

    public static void setVs(Vehicle_Services vs) {
        Vehicle.vs = vs;
    }
}
