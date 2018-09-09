package chapter_9;

/**
 * 해싱(hashing)은 다량의 데이터를 저장하고 검색하는데 유용하다
 * 해시함수는 찾고자하는 값을 입력 > 그 값이 저장되는 위치를 알려주는 해쉬코드 반환
 *
 * hashCode()는 객체의 주소값을 이용해서 해시코드를 만들어 반환
 * 서로다른 두 객체는 결코 같은 해시코드를 가질 수 없다.
 */
public class hashCode {
    public static void main(String[] args) {
        //string 클라스는 문자열의 내용이 같으면, 동일한 해시코드를 반환
        //하도록 hashcode 메소드가 오버라이딩되어 있기에
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode()); //같게 나온다.

        // System.identityHashCode() 는 객체의 주소값으로 해시코드를 생성하기 떄문에
        //모든 객체에 대해 항상 다른 해시코드값을 반환
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2)); // 다르게 나온다.

    }
}
