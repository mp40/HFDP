package chapter1_StrategyPattern_AdventureGame;

public class Knight extends Character {

    public Knight() {
        weaponBehavior = new SwordBehavior();
    }

    public void display() {
        System.out.println("I'm not the knight who says 'Ni'");
    }
}
