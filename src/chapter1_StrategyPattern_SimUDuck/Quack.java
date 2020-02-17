package chapter1_StrategyPattern_SimUDuck;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("chapter1_StrategyPattern_SimUDuck.Quack");
    }
}
