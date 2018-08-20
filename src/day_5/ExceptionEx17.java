package day_5;

/**
 * 예외 되던지기 (exception re-throwing)
 */
public class ExceptionEx17 {
    public static void main(String[] args) {
        try {
            method1();
        }catch (Exception e) {
            System.out.println("main 메서드에서 예외에 처리되었습니다.");
        }
    }
    static void method1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1 메서드에서 예외에 처리되었습니다.");
            throw e;
        }
    }
}
