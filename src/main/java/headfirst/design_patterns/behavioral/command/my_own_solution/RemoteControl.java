package headfirst.design_patterns.behavioral.command.my_own_solution;

public interface RemoteControl {
    OnOffInterface firstSet = new Light();
    OnOffInterface secondSet = new CeilingLight();

    public static void undo() {
        StateManager.undo();
    }
}
