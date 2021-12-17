package java10;

/*
    super 키워드
    부모 클래스로부터 상속받은 필드, 메소드를 자식 클래스에서 참조할 때 사용하는 참조 변수이다.
    인스턴스 변수와 지역 변수의 이름이 같을 경우 this 키워드를 사용하듯이,
    부모 클래스의 멤버와 자식 클래스의 멤버 이름이 같을 경우 super 키워드를 사용할 수 있다.
    this와 마찬가지로 super를 적용할 수 있는 대상도 인스턴스 메소드뿐이며, 클래스 메소드는 사용이 불가능 하다.

    super() 메소드
    this() 메소드가 같은 클래스의 다른 생성자를 호출할 때 사용한다면,
    super() 메소드는 부모 클래스의 생성자를 호출할 때 사용한다.
    자식 클래스의 부모 멤버들을 초기화하기 위해서는 부모 클래스의 생성자를 호출해야 하기 때문이다.
*/

class Parent1 {
    int a = 10;
}

class Parent2 {
    int a;
    Parent2() { a = 10; } // 자식 클래스를 위하여 기본 생성자를 생성하는 게 좋다.
    Parent2(int num) { a = num; }
}

class Child1 extends Parent1 {
    void display() {
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a); // Child1에 a가 선언되어있지 않기 때문에, this와 super 모드 같은 값을 출력한다.
    }
}

class Child2 extends Parent1 {
    int a = 20;

    void display() {
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a); // super 만이 부모 클래스의 값을 출력한다.
    }
}

class Child3 extends Parent2 {
    int b;

    Child3() {
        super(40); // 주석처리 하였을 경우, 부모 클래스의 기본 생성자를 사용한다.
        b = 20;
    }

    void display() {
        System.out.println(a);
        System.out.println(b);
    }
}

public class SuperKeyword {

    public static void main(String[] args) {
        Child1 ch1 = new Child1();
        ch1.display();
        System.out.println("");

        Child2 ch2 = new Child2();
        ch2.display();
        System.out.println("");

        Child3 ch3 = new Child3();
        ch3.display();
    }

}
