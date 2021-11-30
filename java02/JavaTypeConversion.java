package java02;

/*
    하나의 타입을 다른 타입으로 바꾸는 것을 타입 변환(Type Conversion)이라고 한다.
    자바에서는 boolean형을 제외한 나머지 타입 간의 변환을 자유롭게 수행할 수 있다.

    메모리 할당 크기가 작은 타입에서 큰 타입으로의 변환은 생략할 수 있지만,
    큰 타입에서 작은 타입으로 변환할 때 데이터의 손실이 발생할 수 있다.
*/

public class JavaTypeConversion {
    /*
        묵시적 타입 변환(자동 타입 변환, Implicit Conversion)
        대입 연산이나 산술 연산에서 컴파일러가 자동으로 수행해주는 타입 변환을 가리킨다.

        명시적 타입 변환(강제 타입 변환, Explicit Conversion)
        타입 캐스트 연산자"()"를 사용하여 강제로 수행하는 타입 변환을 가리킨다.
    */

    public static void main(String[] args) {
        // 묵시적 타입 변환의 예.
        double num1 = 10;
        double num2 = 7.0F + 3.14;
        System.out.println(num1); // 10.0  (int -> double)
        System.out.println(num2); // 10.14 (float -> double)

        // 명시적 타입 변환의 예.
        int num3 = 1;
        int num4 = 2;
        double result1 = num3 / num4;
        double result2 = (double) num3 / num4;
        System.out.println(result1);
        System.out.println(result2);
    }

}
