package headfirst.design_patterns.behavioral.strategy.solution;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quacking!");
    }
}