package headfirst.design_patterns.behavioral.strategy.solution;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}