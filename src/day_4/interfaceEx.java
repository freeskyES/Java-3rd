package day_4;

import sun.tools.jconsole.Plotter;

/**
 * interface
 *
 * 모든 멤버변수는 public static final 이어야 하며, 이를 생략할 수 있다
 * 모든 메서드는 public abstract 이어야 하며, 이를 생략할 수 있다
 *
 * 단, static 메서드와 디폴트 메서드는 예외
 */
public interface interfaceEx {
    public static final int SPADE = 4;
    final int DIAMOND = 3;
    static int HEART = 2;
    int CLOVER = 1;

    public abstract String getCardNumber();
    String getCardKind();
}


/**
 * 인터페이스는 인터페이스로부터만 다중상속이 가능함
 */
interface Movable {
    void move(int x, int y);
}

interface Attackable {
    void attack(Plotter.Unit u);
}

interface Fightable extends Movable, Attackable { }

