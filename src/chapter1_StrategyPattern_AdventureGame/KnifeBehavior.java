package chapter1_StrategyPattern_AdventureGame;

public class KnifeBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("cut with knife");
    }
}
