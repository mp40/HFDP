package chapter1_StrategyPattern_AdventureGame;

public class Troll extends Character {

    public Troll() {
        weaponBehavior = new AxeBehavior();
    }

    public void display() {
        System.out.println("Ug");
    }
}
