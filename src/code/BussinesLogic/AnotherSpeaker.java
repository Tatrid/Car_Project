package code.BussinesLogic;

import code.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class AnotherSpeaker implements Speakers{
    public String makeSound(){
        return "Music is played on another speaker";
    }
}
