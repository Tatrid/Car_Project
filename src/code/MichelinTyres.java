package code;

import code.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyres implements Tyres {

    public String rotate(){
        return "Vehicle is runing on MichelinTyres";
    }
}
