package chapter_9;

/**
 * String s = ""  와 같은 표현
 * char[] chArr = new Char[0] 이다
 *
 * 하지만 char c는 반드시 하나의 문자를 지정해야한다
 *
 * c언어 는 문자열 끝에 널이 항상 붙지만, 자바에서는 널 문자를 사용하지 않는다. 대신 문자열 길이 정보를 따로 저장한다
 *
 * String s = null; ==> String s = ""; // 빈 문자열로 초기화
 * char c = '\u0000'; ==> char c = ' ';// 공백으로 초기화 를 하는 것이 보통
 *
 */
public class StringEx3 {
}
