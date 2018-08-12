package day_1.variable;

public class PrintfEx1 {

    public static void main(String[] args) {

        int i = 3;

        // 출력 차이
        System.out.println(i); //값을 그대로 출력
        System.out.printf("%d%n", i); // 원하는 형식대로 출력 가능 / 줄바꿈 %n

        /**
         * %b boolean
         * %d 10진수, decimal integer
         * %o 8진수, octal integer
         * %x, %X 16진수, hexadecimal integer
         * %f 10진수, decimal float
         * %e, %E 지수형태표현 exponent
         * %c character
         * %s string
         */

        int finger = 10;

        // 출력될 값이 차지하는 공간을 숫자로 지정 가능
        // 여러 값을 여러 줄로 간격 맞춰 출력할 때 필요
        System.out.printf("finger = [%5d]%n", finger); //finger=[   10]
        System.out.printf("finger = [%-5d]%n", finger);//finger=[10   ]
        System.out.printf("finger = [%05d]%n", finger);//finger=[00010]


        Long hex = 0xFFFF_FFFF_FFFF_FFFFL; // 0xFFFFFFFFFFFFFFFFL

        // # 은 접두사  (16진수 0x, 8진수 0)
        System.out.printf("hex=%#x%n", hex); //0xffffffffffffffff

        short s = 2;
        int octNum = 010;  // 8진수 10, 10진수로 8
        int hexNum = 0x10; // 16진수 10, 10진수로 16
        int binNum = 0b10; // 2진수 10, 10진수로는 2

        System.out.printf("binNum = %s, %d%n", Integer.toBinaryString(binNum), binNum); // binNum=10, 2
    }
}
