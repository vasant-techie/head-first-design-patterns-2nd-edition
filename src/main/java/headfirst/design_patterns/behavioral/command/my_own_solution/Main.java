package headfirst.design_patterns.behavioral.command.my_own_solution;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Main main = new Main();
        main.run();

    }

    private void run() throws InterruptedException {
        RemoteControl.firstSet.on();
        Thread.sleep(1000);
        RemoteControl.secondSet.on();
        RemoteControl.undo();
    }
}
