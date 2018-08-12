package day_2.object_oriented_1;

public class CardTest {
    /**
     * 공통적으로 같은 값을 유지해야할 떄 > 클래스 변수로 선언
     */
    static class Card {
        String kind;    // 카드의 무늬 - 인스턴스 변수
        int number;     // 카드의 숫자 - 인스턴스 변수
        static int width = 100;     // 카드의 폭 - 클래스 변수
        static int height = 250;    // 카드의 높이 - 클래스 변수
    }

    /**
     * 인스턴스변수는 인스턴스가 생성될 때 마다 생성되므로
     * 인스턴트마다 각기 다른 값을 유지할 수 있다
     *
     * 클래스 변수는 모든 인스턴스가 하나의 저장공간을 공유하므로, 항상 공통된 값을 갖는다.
     * @param args
     */
    public static void main(String args[]) {
        // 클래스 변수(static 변수) 는 객체생성없이 '클래스이름.클래스변수'로 직접 사용 가능하다
        System.out.println("Card.width = "+ Card.width);
        System.out.println("Card.height = "+ Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;          // 인스턴스 변수의 값을 변경

        c1.width = 50;
        c1.height = 80;         // 클래스 변수의 값을 변경

        // c1의 클래스변수의 값을 바꾸면,
        // 클래스 변수인 너비와 높이는 공유되기 떄문에
        // c2의 클래스변수의 값도 바뀐 것과 같은 결과를 얻는다
    }
}

