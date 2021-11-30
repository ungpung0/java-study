package java02;
/*
    변수(Variable)
    변수는 데이터를 저장하기 위하여 프로그램에 이름을 할당받은 메모리 공간을 의미한다.
    즉, 변수값은 변경할 수 있다.
*/

/*
    변수명 생성 규칙
    자바의 변수 이름을 생성할 때 반드시 지켜야 하는 규칙은 다음과 같다.
        - 영문자, 숫자, 언더스코어(_), 달러($)로만 구성할 수 있다.
        - 변수명은 숫자로 시작할 수 없다.
        - 변수명 사이에는 공백을 넣을 수 없다.
        - 변수명으로 자바의 예약어는 사용할 수 없다.
*/

public class JavaVariable {
    /*
        변수의 종류는 둘로 나뉜다.
        1) 기본형 변수(Primitive Type Variable)
        실제 연산에 사용되는 변수로서, 8가지의 기본형을 제공한다.
            - 정수형(byte, short, int, long)
            - 실수형(float, double)
            - 문자형(char)
            - 논리형(boolean)
        2) 참조형 변수(Reference Type Variable)
        기본형 변수를 활용하여 사용자가 직접 만드는 변수.
    */

    public static void main(String[] args) {

        // 변수의 선언만 하는 방법.
        int num;
        //System.out.println(num); // 오류 발생. 값이 null.
        num = 20;
        System.out.println(num); // 초기화 완료. 값이 20.

        // 변수의 선언과 동시 초기화.
        int num1, num2; // 같은 타입의 변수 동시 선언.
        double num3 = 3.14; // 선언과 동시에 초기화.
        double num4 = 1.23, num5 = 4.56; // 같은 타입의 변수를 동시 선언 및 초기화.
        // num1 = 1.23, num2 = 2.34; // 오류 발생. 선언된 변수는 동시 초기화 안됨.
    }
}
