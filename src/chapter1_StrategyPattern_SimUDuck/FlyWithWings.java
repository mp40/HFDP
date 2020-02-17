package chapter1_StrategyPattern_SimUDuck;

public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying!");
    }
}
