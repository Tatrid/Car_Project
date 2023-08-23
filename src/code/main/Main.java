package code.main;

import code.Beans.Person;
import code.ProjectConfig.ProjectConfig;
import code.Beans.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        String[] persons = context.getBeanNamesForType(Person.class);
        Person person = context.getBean(Person.class);
        String[] names = context.getBeanNamesForType(Vehicle.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        vehicle.getVehicleServices().moveVehicle();
        vehicle.getVehicleServices().playMusic();
/*first Spring Project*/

    }
}
