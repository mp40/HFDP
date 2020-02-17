package chapter1_StrategyPattern_SimUDuck;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("chapter1_StrategyPattern_SimUDuck.Squeak");
    }
}
