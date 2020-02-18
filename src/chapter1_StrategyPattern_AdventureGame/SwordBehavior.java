package chapter1_StrategyPattern_AdventureGame;

public class SwordBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("swing sword");
    }
}
