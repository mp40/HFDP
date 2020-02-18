package chapter1_StrategyPattern_AdventureGame;

public class King extends Character {

    public King() {
        weaponBehavior = new BowAndArrowBehavior();
    }

    public void display() {
        System.out.println("I'm the King");
    }
}
