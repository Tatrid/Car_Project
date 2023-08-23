package code;

import code.Speakers;
import org.springframework.stereotype.Component;

@Component
public class AnotherSpeaker implements Speakers{
    public String makeSound(){
        return "Music is played on another speaker";
    }
}
