package day_1.variable;

public class PrintfEx2 {
    public static void main(String[] args) {

        float f1 = .10f; // 0.10, 1.0e-1
        float f2 = 1e1f; // 10.0, 1.0e1, 1.0e+1
        float f3 = 3.14e3f;
        double d = 1.23456789;

        /**
         * 실수형 값의 출력에 사용되는 지시자
         * %f, %e (지수형태출력), %g (값을 간략히 표현)
         */

        System.out.printf("f1=%f, %e, %g%n", f1, f2, f3);
        System.out.printf("f2=%f, %e, %g%n", f1, f2, f3);
        System.out.printf("f3=%f, %e, %g%n", f1, f2, f3);

        // %f 는 기본적으로 소수점 이하 6자리까지만 출력됨, 소수점 이하 7자리에서는 반올림됨
        // 전체 자리수 14 > [  1.23456789]
        System.out.printf("d=%14.10f%n", d);


        String url = "www.naver.com";

        System.out.printf("[%20s]%n", url); // 우측정렬
        System.out.printf("[%-20s]%n", url); // 좌측정렬

        System.out.printf("[%.8s]%n", url); // 왼쪽에서 8글자만을 출력

    }
}
