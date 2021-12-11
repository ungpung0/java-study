package java03;

/*
    비트 연산자(Bitwise Operator)
    논리 연산자와 비슷하지만, 비트 단위로 논리 연산을 할 때 사용한다.
    왼쪽, 오른쪽으로 전체 비트를 이동하거나, 1의 보수를 만들 때 사용한다.
    - "&": 대응 비트가 모두 1이면 1을 반환한다. (AND 연산)
    - "|": 대응 비트가 하나라도 1이면 1을 반환한다. (OR 연산)
    - "^": 대응 비트가 서로 다를경우 1을 반환한다. (XOR 연산)
    - "~": 비트가 1이면 0으로, 0이면 1로 반전한다. (NOT 연산, 1의 보수)
    - "<<": 비트들을 전부 왼쪽으로 이동시킨다. (왼쪽 Shift 연산)
    - ">>": 비트들을 전부 오른쪽으로 이동시킨다. 단 부호는 유지한다. (오른쪽 Shift 연산)
    - ">>>": 지정한 수 만큼 전부 오른쪽으로 이동하며, 새로운 비트는 0이 된다.
    ※ <<< 연산자는 존재하지 않다.
*/

public class JavaBitwiseOperator {
    public static void main(String[] args) {
        int num1 = 8, num2 = -8;
        System.out.println("~ 연산자의 결과: " + ~num1);
        System.out.println("<< 연산자의 결과: " + (num1 << 2));
        System.out.println(">> 연산자의 결과: " + (num1 >> 2));
        System.out.println(">>> 연산자의 결과: " + (num1 >>> 2));
        System.out.println(">>> 연산자의 결과: " + (num2 >>> 2));
    }

}
