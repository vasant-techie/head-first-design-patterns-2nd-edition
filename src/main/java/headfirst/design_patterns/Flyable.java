package headfirst.design_patterns;

public interface Flyable {
    public default void fly() {
        System.out.println("I'm flying");
    }
}