package java08;

/*
    제어자(Modifier)
    제어자란 클래스와 클래스 멤버의 선언 시에 부가적인 의미를 부여하는 키워드를 의미한다.
    Java에서 제어자는 접근 제어자(Access Modifier)와 기타 제어자로 구분할 수 있다.
    접근 제어자는 하나만 사용할 수 있고, 기타 제어자는 여러 개를 사용할 수 있다.
    또한, 둘은 조합하여 사용할 수도 있다.

    접근 제어자(Access Modifier)
    객체 지향에서 정보 은닉이란 사용자가 알 필요 없는 정보들을 숨겨야한다는 개념이다.
    Java에서 이런 정보 은닉을 위하여 접근 제어자 기능을 사용한다.
    - private:
        private로 선언된 클래스의 멤버는 외부에 공개되지 않으며, 외부에서 접근하는
        것이 불가능하다. private 멤버에 접근하기 위해서는 public 메소드를 통하여야
        만 한다. 즉, private 멤버는 클래스 내부의 세부적인 동작만을 구현하는 데 사용
        된다.
    - public:
        public로 선언된 클래스의 멤버는 외부에 공개되며, 해당 객체를 사용하는 프로그램이
        어디에서나 접근할 수 있다. public 메소드는 private 멤버와 프로그램 사이의 인터페이스
        역할을 수행한다.
    - default:
        default를 위한 접근 제어자는 따로 존재하지 않으며, 접근 제어자를 설정하지 않으면
        자동으로 default를 가지게 된다. 같은 클래스의 멤버와 같은 패키지의 멤버에서만
        접근할 수 있다.
    - protected:
        protected로 선언된 클래스의 멤버는 부모 클래스에 대해서 public 멤버처럼 취급되며,
        그 밖에서는 private 멤버처럼 취급된다.

    기타 제어자
    - final:
        final 제어자는 변경할 수 없다는 의미로 사용되며, 필드에 사용되면 상수(Constant)가
        되고, 클래스에 사용되면 다른 클래스가 상속받을 수 없게 되고, 메소드에 사용되면
        오버라이딩(Overriding)을 통한 재정의가 불가능하게 된다.
        ※ 메소드 오버라이딩(Method Overriding): 상속받은 부모 클래스의 메소드를 재정의하여 사용.
    - static:
        static 제어자는 공통적인 의미로 사용되며, 변수에 적용하면 클래스 변수로, 메소드에 적용하면
        클래스 메소드로 만들어준다. 또한, 초기화 블록으로 사용할 수 있다.
        특징:
            - 최초의 한 번만 생성되고 초기화된다.
            - 인스턴스를 생성하지 않고도 바로 사용할 수 있다.
            - 해당 클래스의 모든 인스턴스가 공유한다.
    - abstract:
        선언부만 있고 구현부가 존재하지 않는 메소드를 추상 메소드라고 한다. 또한, 하나 이상의 추상 메소드
        를 포함하고 있는 경우에도 반드시 abstract 제어자를 붙여야만 한다.

    접근 제어자와 기타 제어자는 함께 사용할 수 있는데, 몇몇 제어자는 불가능하다.
    - final + abstract: final은 상속을 금지하고, abstract는 상속을 받아야만 사용할 수 있기 때문이다.
    - static + abstract: static은 인스턴스를 생성하지 않고 바로 사용이 가능한데, abstract는 구현부가 없기 때문이다.
    - private + abstract: abstract는 오버라이딩을 필요로하고, private는 자식 클래스에서 접근할 수 없기 때문이다.
    - private + final: 둘 다 오버라이딩을 통한 재정의를 할 수 없다는 의미를 가지며, 의미가 중첩된다.
*/

// private 클래스의 예제.
class IntenalClass {
    private String var = "같은 클래스만 허용한다."; // private 필드.
    private String getVar() {
        return this.var;
    }
}

// public 클래스의 예제.
class ExtenalClass {
    public String var = "다른 클래스도 허용한다."; // public 필드.
    public String getVar() { return this.var; }
}

// final 클래스의 예제.
final class FinalClass { // 상속을 통한 서브 클래스를 생성할 수 없다.
    final int VAR = 1; // 상수화되어 값을 변경할 수 없다.
    final void func() { // 재정의 할 수 없다.
        final double MAX_NUM;
    }
}

// abstract 클래스의 예제.
abstract class AbstractClass {
    abstract void funcAb();
}

// static 예제.
class StaticExample {
    static int var; // 클래스 필드.(Static 변수)
    static { // 클래스 필드의 초기화 블록.
        // 주로 클래스 필드의 초기화를 진행한다.
    }
    static void func() {
        // 클래스 메소드.
    }
}

public class Modifier {

    String var = "다른 패키지는 접근할 수 없다."; // default 필드.
    protected String varProtected = "다른 패키지의 자식 클래스에서 접근할 수 있다."; // protected 필드.

    public static void main(String[] args) {
        Modifier mf = new Modifier();
        System.out.println(mf.var); // 같은 패키지는 허용된다.
    }

}
