package java15;

/*
    Exception 클래스
    모든 예외의 조상 클래스가 되는 Exception 클래스는 다음과 같이 구분될 수 있다.
    - RuntimeException 클래스:
        RuntimeException 클래스를 상속받는 자식 클래스들은 치명적인 예외 상황을 발생시키지
        않으므로, try / catch 문을 사용하지 않는 것이 좋다.
    - Exception 자식 클래스:
        그 외의 Exception 클래스에 속하는 자식 클래스들은 치명적인 예외 상황을 발생시키므로,
        반드시 try / catch 문을 사용해야만 한다. Java 컴파일러는 이러한 예외가 발생할 가능성이
        있는 구문들을 예외 처리하지 않았을 때 오류를 발생시킨다.

    Throwable 클래스
    Java에서 Throwable 클래스는 Exception 클래스와 Error 클래스의 부모 클래스이다.
    Throwable 타입과 이 클래스를 상속받은 서브 타입만이 JVM, throw 키워드에 의해 던져질 수 있다.
    - getMessage():
        throwable 객체에 대한 자세한 내용을 문자열로 반환한다.
    - printStackTrace():
        해당 throwable 객체와 표준 오류 스트림(standard error stream)에서 해당 객체의
        스택 트레이스(stack trace)를 출력한다.
    - toString():
        해당 throwable 객체의 간략한 내용을 문자열로 반환한다.

    자주 사용되는 예외 클래스
    - ClassCastException: 수행할 수 없는 타입 변환이 진행될 경우.
    - ArrayIndexOutOfBoundsException: 배열에 잘못된 인덱스로 접근할 경우.
    - NullPointerException: null 객체 인스턴스 메소드를 호출하는 경우.
    - ArithmeticException: 산술연산에서 0으로 나누는 연산을 수행할 수 없는 경우.
*/

import java.io.IOException;

public class ExceptionClass {

    public static void main(String[] args) {

        // 예외처리를 하지 않았을 때 오류 발생의 예.
        byte[] list = {'a', 'b', 'c'};
        // System.out.write(list); // IOException 에러 발생.

        // 에러 처리 예시.
        try {
            System.out.write(list);
        } catch (IOException e) { // Exception 클래스의 자식 IOException 처리.
            e.printStackTrace();
        } catch (Exception e) { // Exception 에러 처리.
            e.printStackTrace();
        }

        // 예외 동시 처리 예시.
        try {
            System.out.write(list);
        } catch (IOException | RuntimeException e) {
            // 동시 처리의 경우 객체는 final 제어자를 가지게 된다.
            e.printStackTrace();
        }

        // throwable 오류 출력 예시.
        try {
            System.out.print(5 / 0);
        }catch (ArithmeticException e) {
            System.out.println("현재 발생한 예외 정보: " + e.getMessage());
        }
    }

}
