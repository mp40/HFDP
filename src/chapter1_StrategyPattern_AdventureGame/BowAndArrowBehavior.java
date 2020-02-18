package chapter1_StrategyPattern_AdventureGame;

public class BowAndArrowBehavior implements  WeaponBehavior {
    public void useWeapon() {
        System.out.println("shoot arrow");
    }
}
