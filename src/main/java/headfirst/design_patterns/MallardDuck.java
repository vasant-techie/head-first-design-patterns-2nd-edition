package headfirst.design_patterns;

public class MallardDuck extends Duck implements Flyable, Quackable {

    @Override
    public void display() {
        System.out.println("Displaying MallardDuck");
    }

    @Override
    public void fly() {
        System.out.println("MallardDuck flying");
    }

    @Override
    public void quack() {
        System.out.println("MallardDuck quacking");
    }
}