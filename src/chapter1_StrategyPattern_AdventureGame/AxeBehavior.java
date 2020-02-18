package chapter1_StrategyPattern_AdventureGame;

public class AxeBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("chop with axe");
    }
}
