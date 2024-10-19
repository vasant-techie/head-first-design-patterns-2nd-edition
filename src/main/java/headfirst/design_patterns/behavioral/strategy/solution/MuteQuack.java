package headfirst.design_patterns.behavioral.strategy.solution;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can't quack!");
    }
}