package code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Person {
    public static Vehicle vehicle;
    @Autowired
    public static Vehicle getVehicle() {
        return vehicle;
    }

    public static void setVehicle(Vehicle vehicle) {
        Person.vehicle = vehicle;
    }
}
