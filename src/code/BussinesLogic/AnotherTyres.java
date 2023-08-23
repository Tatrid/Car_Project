package code.BussinesLogic;

import code.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class AnotherTyres implements Tyres {

    public String rotate(){
        return "Vehicle is runing on AnotherTyres";
    }
}
