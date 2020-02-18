package chapter1_StrategyPattern_AdventureGame;

public class MiniAdventureSimulator {
    public static void main(String[] args) {
        Character king = new King();
        Character queen = new Queen();
        Character knight = new Knight();
        Character troll = new Troll();

        king.display();
        king.fight();

        queen.display();
        queen.fight();

        knight.display();
        knight.fight();

        troll.display();
        troll.fight();

        queen.setWeaponBehavior((new AxeBehavior()));
        queen.display();
        queen.fight();
    }
}
