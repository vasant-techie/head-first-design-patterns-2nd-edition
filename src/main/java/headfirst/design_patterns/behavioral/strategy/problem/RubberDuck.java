package headfirst.design_patterns.behavioral.strategy.problem;

public class RubberDuck extends Duck implements Quackable {

    @Override
    public void display() {
        System.out.println("Displaying RubberDuck");
    }

    @Override
    public void quack() {
        System.out.println("RubberDuck squeaking");
    }
}