package java10;

/*
    메소드 오버라이딩(Method Overriding)
    오버로딩이란 다른 시그니처를 갖는 여러 메소드를 하나의 이름으로 정의하는 것이었다.
    오버라이딩이란 부모 클래스의 메소드를 자식 클래스에서 다시 정의하는 것을 말한다.

    오버라이딩의 조건
    1) 메소드의 동작만을 재정의하는 것으로, 선언부는 기존과 완전히 같아야만 한다. 단, 반환 타입은 호환가능하다면 변경할 수 있다.
    2) 부모 클래스의 메소드보다 접근 제어자를 좁은 범위로 변경할 수 없다.
    3) 부모 클래스의 메소드보다 큰 범위의 예외를 선언할 수 없다.

    오버라이딩과 오버로딩의 차이점
    오버로딩(Overloading)은 새로운 메소드를 정의하는 것이고,
    오버라이딩(Overriding)은 상속받은 기존의 메소드를 재정의하는 것이다.
*/

class ParentOverridingEx {
    void display() {
        System.out.println("부모 클래스의 display() 메소드.");
    }
}

class ChildOverridingEx extends ParentOverridingEx {
    void display() {
        System.out.println("자식 클래스의 display() 메소드.");
    }
}

public class MethodOverriding {

    public static void main(String[] args) {
        ParentOverridingEx pa = new ParentOverridingEx();
        pa.display();
        ChildOverridingEx ch = new ChildOverridingEx();
        ch.display();
        ParentOverridingEx pc = new ChildOverridingEx();
        pc.display(); // 반대도 같다. 자식 클래스가 덮어쓴다. (다형성의 예)
    }
}
