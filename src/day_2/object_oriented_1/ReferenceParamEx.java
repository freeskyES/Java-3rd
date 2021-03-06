package day_2.object_oriented_1;

/**
 * 기본형 매개변수 - 변수의 값을 읽기만 할 수 있다 (Read Only)
 * 참조형 매개변수 - 변수의 갑승ㄹ 읽고 변경할 수 있다 (Read & Write)
 */
public class ReferenceParamEx {
    public static void main(String[] args) {
        Date d = new Date();
        d.x = 10;
        System.out.println(""+d.x);

        change(d);
        System.out.println(""+d.x);
    }

    static void change(Date d) { // 참조형 매개변수
        d.x = 1000;
        System.out.println("change() : x ="+ d.x);
    }

    static class Date { int x;}
}
