package java10;

/*
    상속(inheritance)
    상속이란 기존의 클래스에 기능을 추가 및 재정의하여 새로운 클래스를 정의하는 것을 의미한다.
    상속은 캡슐화, 추상화와 더불어서 객체 지향 프로그래밍을 구성하는 중요한 특징 중 하나이다.
    기존의 클래스를 부모 클래스(Parent Class) | 상위 클래스(Super Class) | 기초 클래스(Base Class),
    새로운 클래스를 자식 클래스(Child Class) | 하위 클래스(Sub Class) | 파생 클래스(Derived Class)라고 한다.

    상속의 장점
    1) 기존의 클래스를 재활용할 수 있다.
    2) 자식 클래스 설계 시에 중복되는 멤버들을 부모 클래스에 작성해 놓으면, 해당 멤버를 작성하지 않아도 된다.
    3) 클래스 간에 계층적 관계를 구성하여 다형성의 문법적 토대를 마련할 수 있다.

    자식 클래스(Child Class)
    부모 클래스의 모든 특성들을 물려받아 새롭게 작성된 클래스를 의미한다.
    ex) class 클래스명 extend 부모클래스명 {}
    자식 클래스에는 부모 클래스의 필드 및 메소드 만이 상속되며, 생성자와 초기화 블록은 상속되지 않는다.
    또한, private나 default로 설정된 멤버는 상속받지만 접근할 수 없다.

    Object 클래스
    Java에서 Object 클래스는 모든 클래스의 부모 클래스가 되는 클래스이다.
    때문에 모든 클래스는 자동으로 Object 클래스의 모든 필드와 메소드를 상속받게 된다.
    즉, 모든 클래스들은 extends 키워드를 사용하지 않아도 Object 클래스의 멤버들을 사용할 수 있다.
*/

class Parent {
    private int a = 10; // private 필드.
    public int b = 20; // public 필드.
}

class Child extends Parent { // 자바에서 클래스는 단일 상속만이 가능하다.
    public int c = 30;
    void display() {
        // System.out.println(a); // private 필드 참조.
        System.out.println(b); // 상속받은 public 필드 참조.
        System.out.println(c); // 자식 클래스의 public 필드 참조.
    }
}

public class Inheritance {

    public static void main(String[] args) {
        Child ch = new Child();
        ch.display();

    }
}
