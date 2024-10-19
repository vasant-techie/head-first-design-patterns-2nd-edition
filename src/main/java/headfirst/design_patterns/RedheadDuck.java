package headfirst.design_patterns;

public class RedheadDuck extends Duck implements Flyable, Quackable {

    @Override
    public void display() {
        System.out.println("Displaying RedheadDuck");
    }

    @Override
    public void fly() {
        System.out.println("RedheadDuck flying");
    }

    @Override
    public void quack() {
        System.out.println("RedheadDuck quacking");
    }
}