package headfirst.design_patterns.behavioral.strategy.solution;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeaking like a rubber duck!");
    }
}