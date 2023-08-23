package code.BussinesLogic;
import code.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PionerSpeaker implements Speakers{
    public String makeSound(){
        return "Music is played on Pioner Speaker";
    }
}
