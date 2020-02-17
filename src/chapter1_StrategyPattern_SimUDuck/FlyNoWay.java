package chapter1_StrategyPattern_SimUDuck;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
