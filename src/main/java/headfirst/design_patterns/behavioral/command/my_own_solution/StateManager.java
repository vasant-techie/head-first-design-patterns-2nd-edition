package headfirst.design_patterns.behavioral.command.my_own_solution;

public class StateManager {
    private static OnOffInterface type;
    private static boolean previousState;

    public static void setType(OnOffInterface onOffInterfaceType) {
        type = onOffInterfaceType;
    }

    public static void setPreviousState(boolean state) {
        previousState = state;
    }

    public static void undo() {
        if(previousState) {
            type.off();
        } else {
            type.on();
        }
    }
}
