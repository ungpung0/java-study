package java02;

/*
    실수의 표현 방식은 2진수로 표현해야 하기 때문에 복잡하다.
    1) 고정 소수점(Fixed Point):
        실수는 보통 정수부와 소수부로 나뉘는데, 소수부의 자릿수를 미리 정해서,
        고정된 자릿수의 소수를 표현한다. 범위가 매우 적다는 단점이 있다.
    2) 부동 소수점(Floating Point):
        정수부와 소수부가 아닌, 가수부와 지수부로 나누어 표현하는 방식이다.
        현재 대부분의 시스템에서 사용되고 있으며, 범위가 매우 넓지만, 오차가
        존재할 수 있다는 단점이 있다.
*/

public class JavaPoints {

    public static void main(String[] args) {

        // 부동소수점 방식의 오차.
        double num = 0.1;
        for(int i=0; i<1000; i++) {
            num += 0.1;
        }
        System.out.println(num); // 결과: 100.09999999999859, 오차값 발생.

        // float형과 double형의 정확도 차이.
        float num1 = 1.23456789F;
        double num2 = 1.23456789;
        System.out.println("float: " + num1 + " double: " + num2);
        // 소수 6자리 이상에서 float은 정확한 값을 보여주지 못한다.
    }

}
