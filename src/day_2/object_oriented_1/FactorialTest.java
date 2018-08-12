package day_2.object_oriented_1;

public class FactorialTest {
    public static void main(String[] args) {
        int result = factorial(4);

        System.out.println(result);
    }
    static int factorial (int n) {
        int result = 0;

        if (n == 0) {
            result = 1;
        } else {
            result = n * factorial(n-1);   // 다시 메서드 자신을 호출한다.
        }
        return result;
    }
}