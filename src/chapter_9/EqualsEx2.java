package chapter_9;

public class EqualsEx2 {
    public static void main(String[] args) {
        Person p1 = new Person(1010L);
        Person p2 = new Person(1010L);

        if (p1 == p2)
            System.out.println("p1과 p2는 같은 사람입니다.");
        else
            System.out.println("p1과 p2는 다른 사람입니다.");

        if (p1.equals(p2))
            System.out.println("p1과 p2 는 같은 사람입니다.");
        else
            System.out.println("p1과 p2는 다른 사람입니다.");
    }
}

class Person {
    long id;

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Person) { // 타입이 Person 인지 체크
            return id ==((Person)obj).id;
        }else {
            return false;
        }
    }

    Person(long id) {
        this.id = id;
    }
}