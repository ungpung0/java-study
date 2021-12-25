package java12;

/*
    래퍼 클래스(Wrapper Class)
    프로그램에 따라서 기본 타입의 데이터를 객체로 취급해야 하는 경우가 있다.
    이 때, 데이터를 객체로 포장해 주는 클래스를 래퍼 클래스라고 한다.
    기본 타입에 대응하여 제공하고 있는 래퍼 클래스는 다음과 같다.
    - (기본타입) -> (래퍼클래스)
    - byte -> Byte
    - short -> Short
    - int -> Integer
    - long -> Long
    - float -> Float
    - double -> Double
    - char -> Character
    - boolean -> Boolean

    박싱(Boxing)과 언박싱(UnBoxing)
    래퍼 클래스는 산술 연산을 위한 클래스가 아니므로, 인스턴스의 값을 변경할 수 없다.
    값을 참조하기 위해 새로운 인스턴스를 생성하고, 생성된 인스턴스의 값을 참조할 수 있다.
    기본 타입의 데이터를 래퍼 클래스 인스턴스로 변환하는 과정을 박싱(Boxing).
    래퍼 클래스 인스턴스를 기본 타입의 데이터로 꺼내는 과정을 언박싱(UnBoxing)이라고 한다.

    오토 박싱(AutoBoxing)과 오토 언박싱(AutoUnBoxing)
    JDK 1.5부터는 자동으로 컴파일러가 처리해주는데 이를, 오토 박싱, 오토 언박싱이라고 한다.

*/

public class WrapperClass {

    public static void main(String[] args) {

        // 오토 박싱 / 오토 언박싱의 예제.
        Integer num = new Integer(17); // 박싱.
        int n = num.intValue(); // 언박싱.
        System.out.println(n);
        Character ch = 'X'; // Character ch = new Character('X'); 오토 박싱.
        char c = ch; // char c = ch.charValue(); // 오토 언박싱.
        System.out.println(c);

        Integer num1 = new Integer(10);
        Integer num2 = 20;
        System.out.println(num1.equals(num2)); // 래퍼 클래스를 비교하려면 equals() 메소드를 사용해야만 한다.

    }
}
