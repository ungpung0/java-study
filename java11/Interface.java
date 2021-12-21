package java11;

/*
    인터페이스(Interface)
    일반적으로 Java는 다중 상속을 지원하지 않는다. 하지만 인터페이스를 사용하면 다중 상속을 사용할 수 있다.
    인터페이스란 다른 클래스를 작성할 때 기본틀을 제공하며, 클래스 사이의 중간 매개체 역할을 담당하는 추상 클래스를 의미한다.
    추상 클래스와 달리 인터페이스는 오로지 추상 메소드와 상수만을 포함할 수 있다.
    ex)
        접근제어자 interface 인터페이스명 {
            public static final 타입 상수명 = 값;
            public abstract 메소드명(매개변수);
        }
    모든 필드는 public static final이고, 모든 메소드는 public abstract여야 한다.

    인터페이스 구현
    인터페이스는 추상 클래스와 마찬가지로 직접 인스턴스를 생성할 수 없으며,
    추상 메소드를 구현해 줄 클래스를 작성해야만 한다.
    ex)
        class 클래스명 implements 인터페이스명 {}
*/

interface AnimalInterface {
    public abstract void cry();
}

interface PetInterface {
    public abstract void play();
}

class CatInterface implements AnimalInterface {
    public void cry() {
        System.out.println("냐옹냐옹");
    }
}

class DogInterface implements AnimalInterface {
    public void cry() {
        System.out.println("멍멍");
    }
}

// 다중 상속 예제. (인터페이스)
class MultiInterface implements AnimalInterface,PetInterface {
    public void cry() {
        System.out.println("애완동물이 울었다.");
    }
    public void play() {
        System.out.println("산책가자~");
    }
}

public class Interface {
    public static void main(String[] args) {
        CatInterface catInterface = new CatInterface();
        DogInterface dogInterface = new DogInterface();
        MultiInterface multiInterface = new MultiInterface();

        catInterface.cry();
        dogInterface.cry();
        multiInterface.cry();
        multiInterface.play();
    }
}

/*
    인터페이스같이 클래스를 상속받으려고 하면 모호성의 문제가 발생하게 된다.
    예를들어, 두 부모 클래스에 cry()가 중첩 존재할 경우에, 어느 클래스의 cry()를 상속받을지 충돌이 발생하는 것이다.
    때문에 인터페이스를 사용해야만 하는 것이다.

    인터페이스의 장점
    1) 대규모 프로젝트 개발 시의 일관되고 정형화된 개발을 위하여 필요하다.
    2) 클래스 작성과 인터페이스 구현을 동시에 진행할 수 있기에, 개발 시간의 단축에 유리하다.
    3) 클래스와 클래스 간의 관계를 인터페이스로 연결하면, 클래스마다 독립적인 개발이 가능하다.
*/