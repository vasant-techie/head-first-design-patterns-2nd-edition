package headfirst.design_patterns.behavioral.command.my_own_solution;

public class CeilingLight implements OnOffInterface {
    public void on() {
        System.out.println("CeilingLight is ON.");
        StateManager.setType(this);
        StateManager.setPreviousState(true);
    }
    
    public void off() {
        System.out.println("CeilingLight is OFF.");
        StateManager.setType(this);
        StateManager.setPreviousState(false);
    }

    public void dim() {
        System.out.println("CeilingLight is DIM.");
    }

}
