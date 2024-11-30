package headfirst.design_patterns.behavioral.command.problem;

public class CeilingFan {

    public void on() {
        System.out.println("CeilingFan is ON.");
    }

    public void high() {
        System.out.println("CeilingFan set to HIGH.");
    }

    public void medium() {
        System.out.println("CeilingFan set to MEDIUM.");
    }

    public void low() {
        System.out.println("CeilingFan set to LOW.");
    }

    public void off() {
        System.out.println("CeilingFan is OFF.");
    }
}
