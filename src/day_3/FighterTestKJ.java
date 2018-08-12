package day_3;

public class FighterTestKJ {
    public static void main(String[] args) {
        Fighter f = new Fighter();

        if(f instanceof  Unit)
            System.out.println("UNIT 의 자손");

        if(f instanceof  Fightable)
            System.out.println("Fightable 의 자손");

        if(f instanceof  Movable)
            System.out.println("Movable 의 자손");

        if(f instanceof  Attackable)
            System.out.println("Attackable 의 자손");

        if(f instanceof  Object)
            System.out.println("Object 의 자손");

    }
}

class Fighter extends Unit implements Fightable {
    public void move(int x, int y) {

    }

    @Override
    public void attack(Unit u) {

    }
}

class Unit {
    int currentHP;
    int x;
    int y;
}

interface Fightable extends Movable, Attackable {

}

interface Movable {
    void move(int x, int y);
}

interface Attackable {
    void attack(Unit u);
}
