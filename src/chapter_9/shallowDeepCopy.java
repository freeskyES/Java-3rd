package chapter_9;

/**
 * shallowCopy => 원본이랑 주소가 같음 / 원본 값이 바뀌면 같이 바뀜
 * deepCopy => 원본과 다른 주소
 */
public class shallowDeepCopy {
    public static void main(String[] args) {
        Circle c1 = new Circle(new Point(1,1), 2.0);
        Circle c2 = c1.shallowCopy();
        Circle c3 = c1.deepCopy();

        System.out.println("c1 = "+c1);
        System.out.println("c2 = "+c2);
        System.out.println("c3 = "+c3);

        c1.p.x = 9;
        c1.p.y = 9;
        System.out.println("c1 변경 후 ");
        System.out.println("c1 = "+c1);
        System.out.println("c2 = "+c2);
        System.out.println("c3 = "+c3);

    }

}

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
class Circle implements Cloneable {
    Point p;
    double r;

    Circle(Point p, double r) {
        this.p = p;
        this.r = r;
    }

    public Circle shallowCopy() { // 앝은 복사
        Object obj = null;

        try {
            obj = super.clone();
        }catch (CloneNotSupportedException e) {}

        return (Circle) obj;
    }
    public Circle deepCopy() { // 깊은 복사
        Object obj = null;

        try {
            obj = super.clone();
        }catch (CloneNotSupportedException e){}

        Circle c = (Circle)obj;
        c.p = new Point(this.p.x, this.p.y);

        return c;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "p=" + p +
                ", r=" + r +
                '}';
    }
}
