package java18;

/*
    람다 표현식(Lambda Expression)
    간단히 말해서 메소드를 통짜의 하나의 식으로 표현한 것이다.
    람다 표현식을 사용하면 클래스와 인스턴스를 생성하지 않아도 메소드를 사용할 수 있다.
    이는 익명 클래스와 개념이 같다고 볼 수 있다.
    람다 표현식은 매개변수, 결과값으로 이용될 수도 있다.

    람다 표현식 작성법법
   ex)
        (매개변수) -> {함수몸체}

*/

public class LambdaExpression {

    public static void main(String[] args) {

        // 스레드 생성 예제. (일반)
        new Thread(new Runnable() {
            public void run() {
                System.out.println("전통 방식 일회용 스레드");
            }
        }).start();

        // 스레드 생성 예제. (람다)
        new Thread(() -> {
            System.out.println("람다 표현식 일회용 스레드");
        }).start();

    }
}
