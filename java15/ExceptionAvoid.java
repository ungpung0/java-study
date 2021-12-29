package java15;

/*
    예외 발생시키기
    Java에서는 throw 키워드로 강제로 예외를 발생시킬 수 있다.
    ex)
        Exception e = new Exception("오류메시지");
        throw e;

    예외 회피하기
    throws 키워드를 사용하여 메소드를 사용할 때 발생하는 예외를 미리 명시할 수 있다.
    이렇게하면 해당 메소드를 사용할 때 예외를 사용자가 충분히 인지할 수 있다.

    사용자 정의 예외 클래스
    Java에서 Exception 클래스를 상속받아 새로운 예외 클래스를 정의하여 사용할 수 있다.
    이러한 클래스는 생성자 뿐만 아니라 필드, 메소드도 추가할 수 있다.

    try-with-resources 문
    Java SE 7부터 사용한 자원을 자동으로 해제해주는 try-with-resources 문을 사용할 수 있다.
    ex)
        try (자원 할당 명령문) {

        }
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// 사용자 정의 예외 클래스
class MyException extends RuntimeException { // 예외 처리를 강제하지 않는경우 RuntimeException 클래스를 상속.
    MyException(String errorMessage) {
        super(errorMessage);
    }
}



public class ExceptionAvoid {

    // 예외 처리 메소드 생성.
    static void handlingException() {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("호출된 메소드에서 예외가 처리되었다!");
        }
    }

    // 자원 할당 예제. (적용전)
    static String readFile(String filePath) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        try {
            return bufferedReader.readLine();
        } finally {
            if(bufferedReader != null)
                bufferedReader.close();
        }
    }

    // 자원 할당 예제. (적용후)
    static String readFileAfter(String filePath) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            return bufferedReader.readLine();
        }
    }

    public static void main(String[] args) {
        try {
            handlingException(); // 예외 처리 메소드 호출.
        } catch (Exception e) {
            System.out.println("main() 메소드에서 예외가 처리되었다!");
        }
    }

}
