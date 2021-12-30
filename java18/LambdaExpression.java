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

    함수형 인터페이스(Functional Interface)
    람다 표현식을 사용할 때는 람다 표현식을 저장하기 위한 참조 변수의 타입을 결정해야 한다.
    ex)
        참조변수타입 참조변수명 = 람다표현식
    어노테이션을 인터페이스 앞에 붙여서 함수형 인터페이스로 인식시킬 수 있다.
    ex)
        @FunctionalInterface
        interface 인터페이스명 {
            // 함수형 인터페이스 선언.
        }
    ※ 이렇게 명시된 함수형 인터페이스에는 단 하나의 메소드만 사용될 수 있다.
*/

public class LambdaExpression {

    // 함수형 인터페이스 예제. (선언)
    @FunctionalInterface
    interface Calculator {
        public int min(int x, int y);
    }

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

        // 함수형 인터페이스 예제. (사용)
        Calculator minNumber = (x, y) -> x < y ? x : y;
        System.out.println(minNumber.min(3,4));
    }
}
