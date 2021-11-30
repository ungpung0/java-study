package java03;

/*
    증감 연산자(Increment and Decrement Operators)
    피연산자를 1씩 증가 혹은 감소시킬 때 사용하는 연산자이다.
    이 연산자는 피연산자가 단 하나뿐인 단항 연산자이다.

    - "++x": 먼저 피연산자의 값을 1 증가시킨 후 연산을 진행한다.
    - "x++": 먼저 해당 연산을 수행하고 값을 1 증가시킨다.
    - "--x": 먼저 피연산자의 값을 1 감소시킨 후 연산을 진행한다.
    - "x--": 먼저 해당 연산을 수행하고 값을 1 감소시킨다.

*/

public class JavaIncreamentDecrementOperator {
    public static void main(String[] args) {
        int num1 = 7, num2 = 7;
        int result1, result2;

        result1 = --num1 + 4;
        result2 = num2-- + 4;

        System.out.println("전위 감소 연산자 결과: " + result1 + ", 변수의 값:" + num1);
        System.out.println("후위 감소 연산자 결과: " + result2 + ", 변수의 값:" + num2);
    }
}
