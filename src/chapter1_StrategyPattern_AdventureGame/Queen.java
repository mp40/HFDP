package chapter1_StrategyPattern_AdventureGame;

public class Queen extends Character {

    public Queen() {
        weaponBehavior = new KnifeBehavior();
    }

    public void display() {
        System.out.println("Hi, I'm Queenie");
    }
}
