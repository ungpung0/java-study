package java03;
/*
    산술 연산자(Arthmetic Operator)
    산술 연산자는 사칙연산을 다루는 연산자로서, 가장 많이 사용되는 연산자 중 하나이다.
    기본적으로 두 개의 피연산자를 가지는 이항 연산자이고, 결합 방향은 왼쪽에서 오른쪽이다.
    +: 왼쪽에 오른쪽을 더함.
    -: 왼쪽에서 오른쪽을 뺌.
    *: 왼쪽에 오른쪽을 곱함.
    /: 왼쪽을 오른쪽으로 나눔.
    %: 왼쪽을 오른쪽으로 나누고, 나머지를 반환함.
*/
public class JavaArithmeticOperator {
    public static void main(String[] args) {
        int num1 = 8, num2 = 4;
        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1 / num2 = " + (num1 / num2));
        System.out.println("num1 % num2 = " + (num1 % num2));
    }
}
