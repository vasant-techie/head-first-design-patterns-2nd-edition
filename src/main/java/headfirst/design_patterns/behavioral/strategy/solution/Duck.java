package headfirst.design_patterns.behavioral.strategy.solution;

public abstract class Duck {
    // Strategy Pattern: Encapsulated behaviors
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public void performFly() {
        flyBehavior.fly();  // Delegate to the FlyBehavior object
    }

    public void performQuack() {
        quackBehavior.quack();  // Delegate to the QuackBehavior object
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public abstract void display();// Abstract method for display (to be implemented by subclasses)

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}