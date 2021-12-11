package java03;

/*
    논리 연산자(Logical Operator)
    논리식을 판단하여 참(True) 또는 거짓(False)을 결정하는 연산자.
    AND, OR 연산자는 두 개의 피연산자를 갖는 이항 연산자이고,
    NOT 연산자는 하나의 피연산자를 갖는 단항 연산자이다.
    - "&&": 논리식이 모두 참이면 참을 반환한다. (AND 연산)
    - "||": 논리식이 하나라도 참이면 참을 반환한다. (OR 연산)
    - "!": 논리식의 결과가 참이면 거짓을, 거짓이면 참을 반환한다. (NOT 연산)
*/

public class JavaLogicalOperator {
    public static void main(String[] args) {
        char ch1 = 'b', ch2 = 'B';
        boolean result1, result2;

        result1 = (ch1 > 'a') && (ch1 < 'z');
        result2 = (ch2 < 'A') || (ch2 < 'Z');

        System.out.println("&& 연산자 결과: " + result1);
        System.out.println("|| 연산자 결과: " + result2);
        System.out.println("! 연산자 결과: " + !result2);
    }
}
