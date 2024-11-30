package headfirst.design_patterns.behavioral.command.problem;

public class Stereo {
    public void on() {
        System.out.println("Stereo is ON.");
    }
    
    public void off() {
        System.out.println("Stereo is OFF.");
    }
    public void setCd(String cdName) {
        System.out.println("CD set to " + cdName);
    }
    public void setDvd(String dvdName) {
        System.out.println("DVD set to " + dvdName);
    }
    public void setRadio(float radioStation) {
        System.out.println("Radio Station set to " + radioStation);
    }
    public void setVolume(int volumeLevel) {
        System.out.println("Stereo is OFF.");
    }
}
