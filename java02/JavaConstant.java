package java02;

/*
    상수(Constant)
    상수란 변수와 마찬가지로 데이터를 저장할 수 있는 메모리 공간을 의미한다.
    그러나, 메모리에 저장된 데이터를 변경할 수 없다.
*/

public class JavaConstant {
    // 상수는 반드시 선언과 동시에 초기화해야 하며, final 키워드를 사용한다.
    final int AGES = 30; // 상수는 대문자를 사용한다.

    // 리터럴(literal)은 값 자체를 의미한다.
    int var = 30; // 30이 리터럴.

    /*
        리터럴은 타입에 따라 다음과 같이 구분한다.
        정수형 리터럴(Integer Literals) : 123, -456
        실수형 리터럴(Floating-point Literals) : 3.14, -45.6
        논리형 리터럴(Boolean Literals) : true, false
        문자형 리터럴(Character Literals) : 'a', 'Z'
        문자열 리터럴(String Literals) : "자바", "홍길동"
        null 리터럴(null Literals) : null
    */

    /*
        리터럴 타입 접미사(Literal Type Suffix)
        3.14와 같은 일반적은 실수형 리터럴은 double 형으로 인식되는데,
        뒤에 F,f를 추가하면 float 형으로 인식될 것이다.
        - long형 : 123456789L, 123456789l
        - float형 : 1.2345678F, 1.2345678f
        - double형 : 1.23456789D, 1.23456789d
    */
}
