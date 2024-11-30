package headfirst.design_patterns.behavioral.command.problem;

public class TV {
    public void on() {
        System.out.println("TV is ON.");
    }
    
    public void off() {
        System.out.println("TV is OFF.");
    }

    public void setInputChannel(int channelNum) {
        System.out.println("Channel set to " + channelNum);
    }

    public void setVolume(int volumeLevel) {
        System.out.println("Volume set to " + volumeLevel);
    }
}
