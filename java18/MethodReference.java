package java18;

/*
    메소드 참조(Method Reference)
    메소드 참조는 람다 표현식이 단 하나의 메소드만을 호출하는 경우
    불필요한 매개변수를 제거하고 사용할 수 있게 만들어준다.
    메소드 참조는 다음과 같이 '::' 기호를 사용해서 표현한다.
    ex)
        클래스명::메소드명 || 참조변수명::메소드명
        Function<String, Boolean> func = (a) -> object.equals(a); // 람다 표현식.
        Function<String, Boolean> func = object::equals; // 메소드 참조.

    생성자 참조
    생성자를 호출하는 람다 표현식도 앞선 메소드 참조를 사용할 수 있다.
    ex)
        // 단순 객체 생성 & 반환 예제.
        (a) -> { return new Object(a); } // 람다의 경우
        Object::new; // 메소드 참조의 경우.

        // 배열 예제.
        Function<Integer, double[]> func1 = a -> new double[a];
        Function<Integer, double[]> func2 = double[]::new;

*/

import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;

public class MethodReference {

    public static void main(String[] args) {

        DoubleUnaryOperator operator;
        // DoubleUnaryOperator 인터페이스는 한 개의 double 형 매개변수를 받아 한 개의
        // double 형 값을 반환하는 함수형 인터페이스이다.

        // 람다 표현식 예제.
        operator = (n) -> Math.abs(n);
        System.out.println(operator.applyAsDouble(-5));

        // 메소드 참조 예제.
        operator = Math::abs;
        System.out.println(operator.applyAsDouble(-5));

    }

}
