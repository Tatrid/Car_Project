package code.ProjectConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = {"code.BussinesLogic", "code.services"})
@ComponentScan(basePackageClasses = {code.Beans.Vehicle.class, code.Beans.Person.class})
public class ProjectConfig {

}
