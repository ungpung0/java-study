package java12;

/*
    java.lang.Math 클래스
    Math 클래스는 수학에서 자주 사용하는 상수들과 함수들을 구현해 놓은 클래스이다.

    Math.E와 Math.PI
    1) Math.E:
        오일러의 수라고 불리우며, 자연로그(Natural Logarithms), 밑(Base) 값으로
        약 2.718을 의미한다.
    2) Math.PI:
        원의 원주를 지름으로 나눈 원주율 값으로 약 3.14159를 의미한다.

    random() 메소드
    random() 메소드는 0.0 ~ 1.0 사이의 범위에서 임의의 double 값을 생성하여 반환한다.
    java.util 패키지의 Random 클래스를 사용하여 임의의 수를 생성한다.

    abs() 메소드
    abs() 메소드는 전달된 값이 음수이면 절대값을 반환하며, 양수이면 그대로 반환한다.

    floor() / ceil() / round() 메소드
    floor() 메소드는 인수로 전달받은 값과 같거나 작은 수 중에서 가장 큰 정수를 반환한다.
    ceil() 메소드는 반대로 전달받은 값과 같거나 큰 수 중에서 가장 작은 수를 반환한다.
    round() 메소드는 전달받은 실수를 소수점 첫 째 자리에서 반올림한 정수를 반환한다.

    max() / min() 메소드
    max() 메소드는 두 값을 비교하여 큰 값을 반환하고, min() 메소드는 작은 값을 반환한다.

    pow() / sqrt() 메소드
    pow() 메소드는 두 개의 double 형을 가지고 제곱 연산을 수행한다.
    sqrt() 메소드는 double 형의 제곱근 값을 반환한다.

    sin() / cos() / tan() 메소드
    삼각 함수와 관련된 삼각 함수 메소드로서, sin(), cos(), tan() 메소드는 각 각
    double 형의 사인, 코사인, 탄젠트 값을 반환한다.
*/

import java.util.Random;

public class MathClass {

    public static void main(String[] args) {

        // random() 메소드의 예제.
        System.out.println((int)(Math.random() * 100)); // 0 ~ 99.
        Random random = new Random();
        System.out.println(random.nextInt(100)); // 0 ~ 99.

        // abs() 메소드의 예제.
        System.out.println(Math.abs(10));    // 10.
        System.out.println(Math.abs(-10));   // 10.
        System.out.println(Math.abs(-3.14)); // 3.14.

        // floor() / ceil() / round() 메소드의 예제.
        System.out.println(Math.ceil(10.0)); // 올림의 예제.
        System.out.println(Math.ceil(10.1));
        System.out.println(Math.ceil(10.0001));
        System.out.println(Math.floor(10.0)); // 내림의 예제.
        System.out.println(Math.floor(10.9));
        System.out.println(Math.round(10.0)); // 반올림의 예제.
        System.out.println(Math.round(10.5));

        // max() / min() 메소드의 예제.
        System.out.println(Math.max(-10, -11)); // -10.
        System.out.println(Math.min(-10, -11)); // -11.

        // pow() / sqrt() 메소드의 예제.
        System.out.println((int)Math.pow(5,2)); // 5^2 = 25.
        System.out.println((int)Math.sqrt(25)); // 5.

        // sin() / cos() / tan() 메소드의 예제.
        System.out.println(Math.sin(Math.toRadians(30)));
        System.out.println(Math.tan(Math.toRadians(45)));
        System.out.println(Math.cos(Math.toRadians(60)));
        // 부동 소수점의 한계로 인하여 정확한 결과값을 얻지 못한다.

    }
}
