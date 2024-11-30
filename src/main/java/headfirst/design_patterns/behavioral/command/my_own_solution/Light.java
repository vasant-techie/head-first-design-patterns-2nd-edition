package headfirst.design_patterns.behavioral.command.my_own_solution;

public class Light implements OnOffInterface {
    public void on() {
        System.out.println("Light is ON.");
        StateManager.setType(this);
        StateManager.setPreviousState(true);
    }
    
    public void off() {
        System.out.println("Light is OFF.");
        StateManager.setType(this);
        StateManager.setPreviousState(false);
    }
}
