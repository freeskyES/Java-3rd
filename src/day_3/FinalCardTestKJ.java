package day_3;

class Card {
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    Card(String kind, int num) {
        KIND = kind;
        NUMBER = num;
    }

    Card() {
        this("HEART", 1);
    }

    public String toString() {
        return KIND + " " + NUMBER;
    }
}

public class FinalCardTestKJ {

    public static void main(String args[]) {
        Card card = new Card("HEART", 10);
//        card.NUMBER = 5; final 선언이므로 할당해줄수 없음.
        System.out.println(card.KIND);

    }


}
