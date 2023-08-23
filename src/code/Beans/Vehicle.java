package code.Beans;
import code.services.Vehicle_Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "VehicleBean")
public class Vehicle {
    private String name = "Honda";
    private final Vehicle_Services vehicleServices;
    @Autowired
    public  Vehicle(Vehicle_Services vehicleServices) {
        this.vehicleServices = vehicleServices;
    }
    public String getName(){
        return name;
    }

    public  void setName(String name){
        this.name = name;
    }
    public Vehicle_Services getVehicleServices() {
        return vehicleServices;
    }
    public void printHello(){
        System.out.println("HI");
    }
}
