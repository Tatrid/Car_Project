package code.services;

import code.interfaces.Tyres;
import code.interfaces.Speakers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle_Services {
    @Autowired
    private Speakers speakers;
    private Tyres tyres;

    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }
@Autowired
    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    public void playMusic(){
        String music = speakers.makeSound();
        System.out.println(music);
    }
    public  void  moveVehicle(){
        String status = tyres.rotate();
        System.out.println(status);
    }

}
