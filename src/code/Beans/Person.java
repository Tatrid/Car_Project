package code.Beans;
import org.springframework.stereotype.Component;

@Component(value = "PersonBean")
public class Person {
    private String name = "Dana";
    private  final Vehicle vehicle;

    public Person(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public  String getName() {
        return name;
    }

    public  void setName(String name) {
        this.name = name;
    }
    public Vehicle getVehicle(){
        return vehicle;
    }
}
