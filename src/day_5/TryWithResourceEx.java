package day_5;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 *  Java SE 7 이후
 *  try-with-resources 문 지원
 *  하나 이상의 resource (프로그램이 사용후 close 해야하는 object) 를 선언하는 try statement
 *  끝나면 resource 는 자동으로 closed 된다.
 */

public class TryWithResourceEx {
    public static void main(String args[]) {
        try (CloseableResource cr = new CloseableResource()) { //resource 선언
            // cr..
        }catch (Exception e){
            //..
        }


        String text = "";
        try (BufferedReader br = new BufferedReader(new FileReader("path"))) { //resource 선언
             text = br.readLine();

        }catch (IOException e) {

        }
    }

}
class CloseableResource implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("close() 가 호출됨");
    }
}


/**
 * 이전 버전에서 finally block 을 사용 > close 해줌
 * 그러나, close 도 예외를 발생시키므로 / 코드 복잡 및
 * try 블록과 finally 블록 모두 예외가 발생하면 try 블럭의 예외는 무시됨
 */
class Example {
    public static void main(String args[]) {
        FileInputStream fis = null;
        DataInputStream dis = null;
        try {
            fis = new FileInputStream("score.dat");
            dis = new DataInputStream(fis);
            //...

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(dis != null)
                    dis.close();
            }catch (IOException ie) {
                ie.printStackTrace();
            }
        }
    }
}
