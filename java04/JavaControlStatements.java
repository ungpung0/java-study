package java04;

/*
    제어문(Control Flow Statements)
    자바 프로그램의 결과를 얻기 위하여 순차적인 흐름을 제어해야만 할 경우가 있다.
    이때 사용하는 명령문을 제어문이라고 하며, 조건문, 반복문 등이 있다.
    명령문들을 중괄호{}로 둘러싸이며, 이 영역들을 블록(Block)이라고 한다.

    조건문(Conditional Statements)
    조건문은 조건식의 결과에 따른 별도의 명령을 수행하는 제어문이다.
    대표적인 조건문으로는 if문, if/else문, if/elseif/else문, switch문이 있다.
*/

public class JavaControlStatements {
    public static void main(String[] args) {

        /*
            if문: 조건식의 결과가 참(true)이면 명령문을 실행한다.
            ex) if(조건식) {명령문;}
        */
        char ch = 'a';
        if(ch >= 'a' && ch <= 'z')
            System.out.println("해당 문자는 소문지이다.");

        /*
            if/else문: if문의 조건식이 거짓(false)일 경우, else문의 명령문을 실행한다.
            ex)
            if(조건식) {
                명령문;
            }else {
                명령문;
            }
        */
        char ch1 = 'A';
        if(ch1 >= 'a' && ch1 <= 'z')
            System.out.println("해당 문자는 소문자이다.");
        else
            System.out.println("해당 문자는 소문자가 아니다.");

        /*
            if/elseif/else문: elseif문은 조건식을 여러 개 명시할 때 사용한다.
            ex)
            if(조건식) {
                명령문;
            }else if(조건식) {
                명령문;
            }else {
                명령문;
            }
        */
        if(ch1 >= 'a' && ch1 <= 'z')
            System.out.println("해당 문자는 소문자이다.");
        else if(ch1 >= 'A' && ch1 <= 'Z')
            System.out.println("해당 문자는 대문자이다.");
        else
            System.out.println("해당 문자는 영문자가 아니다.");

        /*
            switch문: if/else문과 같이 조건식을 여러 개 명시할 때 사용한다.
            특징:
                1) if/else문에 비해서 가독성, 속도가 빠르다.
                2) byte, short, char, int형의 integer promotion값만 사용할 수 있다.
                3) 위에 해당하는 래퍼 클래스(Wrapper class)와 enum과 String 객체를 사용할 수 있다.
            ※ 일반적으로 if/else문에 비해서 사용할 수 있는 상황이 적다.
            ex)
            switch(조건값) {
                case 값1:
                    명령문;
                    break; // 정지.
                case 값2:
                    명령문;
                    break;
                default: // 어떠한 case 절에도 해당하지 않을 때.
                    명령문;
                    break;
            }
        */
        ch = 'b';
        switch (ch) {
            case 'a':
                System.out.println("해당 문자는 a이다.");
                break;
            case 'b':
                System.out.println("해당 문자는 b이다.");
                break;
            case 'c':
            case 'd':
            case 'e':
                System.out.println("해당 문자는 영문자이다.");
                break;
            default:
                System.out.println("해당 문자는 영문자가 아니다.");
                break;
                // 만약 break문이 없다면 위에서부터 모든 case문을 실행할 것이다.
        }
    }

}
