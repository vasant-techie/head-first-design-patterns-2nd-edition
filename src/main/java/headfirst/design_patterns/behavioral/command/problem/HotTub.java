package headfirst.design_patterns.behavioral.command.problem;

public class HotTub {

    public void circulate() {
        System.out.println("HotTub is circulating.");
    }
    public void jetsOn() {
        System.out.println("HotTub jets are ON.");
    }
    public void jetsOff() {
        System.out.println("HotTub jets are OFF.");
    }
    public void setTemperature(int temperature) {
        System.out.println("HotTub temperature set to " + temperature + " degrees.");
    }
}
