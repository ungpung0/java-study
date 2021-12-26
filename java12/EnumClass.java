package java12;

/*
    열거체(Enumeration Type)
    C, C++와 다르게 JDK 1.5 이전 버전에서는 열거체를 사용할 수 없었다.
    JDK 1.5 부터는 C언어의 열거체보다 향상된 Enum 클래스를 사용할 수 있다.

    Java 열거체의 장점
    1) 열거체를 비교할 때 실제 값과 타입까지 체크한다.
    2) 열거체의 상수값이 재정의되더라도 다시 컴파일할 필요가 없다.

    java.lang.Enum 클래스
    Enum 클래스는 모든 자바 열거체의 공통 조상 클래스로서 다양한 메소드가 포함되어 있다.

    values() 메소드
    values() 메소드는 해당 열거체의 모든 상수를 저장한 배열을 생성하여 반환한다.
    이 메소드는 자바의 모든 열거체에 컴파일러가 자동으로 추가해주는 메소드이다.

    valueOf() 메소드
    valueOf() 메소드는 전달된 문자열과 일치하는 열거체의 상수를 반환한다.

    ordinal() 메소드
    ordinal() 메소드는 열거체 상수가 열거체 정의에서 정의된 순서를 반환한다. (0부터 시작한다.)
    반환된 값은 열거체 상수가 정의된 순서이며, 상수값 자체가 아님을 주의해야만 한다.

*/

// 열거체의 정의 예제.
enum Rainbow {RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET}

// 열거체의 사용 예제.
// Rainbow.RED;

// 열거체 상수값 정의 및 추가 예제.
enum Rainbow1 {
    RED(3), ORANGE(10), YELLOW(21), GREEN(5), BLUE(1), INDIGO(-1), VIOLET(-11);

    private final int value;
    Rainbow1(int value) { this.value = value; }
    public int getValue() { return value; }
}

public class EnumClass {

    public static void main(String[] args) {

        // values() 메소드의 예제.
        Rainbow[] arr = Rainbow.values();
        for(Rainbow rb : arr) {
            System.out.println(rb);
        }

        // valueOf() 메소드의 예제.
        Rainbow arr1 = Rainbow.valueOf("GREEN");
        System.out.println(arr1);

        // ordinal() 메소드의 예제.
        int idx = Rainbow.YELLOW.ordinal();
        System.out.println(idx);
        int idx1 = Rainbow1.YELLOW.ordinal();
        System.out.println(idx1);
        // 순서를 의미하므로 불규칙 적인 상수값을 가지는 Rainbow1을 정렬해도 2가 나오는 것을 볼 수 있다.

    }
}
