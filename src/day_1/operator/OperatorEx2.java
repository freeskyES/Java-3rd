package day_1.operator;

public class OperatorEx2 {
    public static void main(String[] args) {
        Ex1();

        Ex2();
    }
    private static void Ex1() {
        int i=5;
        i++;
        System.out.println(i); // 6

        i=5;
        ++i;
        System.out.println(i); // 6

    }

    private static void Ex2() {
        int i=5, j=0;

        // 후위형은 변수의 값을 먼저 읽어온 후에 값을 증가시킨다.
        j = i++;
        System.out.println("j=i++; 실행 후, i=" +i +", j="+j); //i=6, j=5

        i = 5;
        j = 0;

        // 전위형은 피연산자의 값을 먼저 증가시킨 후에 변수의 값을 읽어온다
        j = ++i;
        System.out.println("j=++i; 실행 후, i=" +i +", j="+j); //i=6, j=6

    }

    private static void Ex3() {
        int i=5, j=5;
        System.out.println(i++);  // 5
        System.out.println(++j);  // 6
        System.out.println("i = "+i+"j ="+j); // 6 6

    }
}
