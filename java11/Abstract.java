package java11;

/*
    추상 메소드(Abstract Method)
    추상 메소드란 자식 클래스에서 반드시 오버라이딩해야만 사용할 수 있는 메소드를 의미한다.
    선언부만 존재하며, 구현부는 상속하여 직접 작성하여 사용한다. (오버라이딩)
    ex) abstract 타입 메소드명();

    추상 클래스(Abstract Class)
    Java에서 하나 이상의 추상 메소드를 포함하는 클래스를 추상 클래스라고 한다.
    OOP에서 다형성을 가지는 메소드의 집합을 정의할 수 있게 도와준다.
    메소드와 마찬가지로 상속받은 모든 클래스는 반드시 재정의하여야 한다.
    ex)
        abstract class 클래스명 {
            abstract 타입 메소드명();
        }
    추상 클래스는 인스턴스를 생성할 수 없고, 추상 메소드를 제외하면 생성자, 필드, 일반 메소드를 포함할 수 있다.

*/

abstract class Animal {
    abstract void cry();
}

class Cat extends Animal {
    void cry() {
        System.out.println("냐옹냐용");
    }
}

class Dog extends Animal {
    void cry() {
        System.out.println("멍멍");
    }
}

public class Abstract {

    public static void main(String[] args) {
        // Animal animal = new Animal(); // 추상 클래스는 인스턴스를 생성할 수 없다.

        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.cry();
        dog.cry();
    }

}

/*
    추상 메소드를 선언하여 사용하는 목적은 자식 클래스가 반드시 추상 메소드를 구현하기 위함이다.
    일반 메소드로 구현하면 해당 메소드를 구현할 수도 있고, 안할 수도 있는다.
    하지만, 추상 메소드는 반드시 구현하여야만 인스턴스를 생성할 수 있기 때문이다.
*/
