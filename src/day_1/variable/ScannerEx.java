package day_1.variable;
import java.util.*;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("두자리 정수를 입력해주세요.>");

        // nextLine() 메서드를 호출하면, 입력대기 상태에 있다가 입력을 마치고 '엔터키'를 누르면
        // 입력한 내용이 문자열로 반환된다
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("입력내용 : "+input);
        System.out.printf("num=%d%n",num);

    }
}
