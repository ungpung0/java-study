package java07;

/*
    메소드(Method)
    자바에서 클래스는 멤버(Member)로 속성을 표현하는 필드와 기능을 표현하는 메소드로 이루어진다.
    메소드는 어떠한 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.

    메소드의 사용 목적
    중복되는 코드의 반복적이고 비효율적인 프로그래밍을 피할 수 있기 때문이다. 또한,
    모듈화로 인하여 코드의 가독성과 유지보수의 측면에서 유리하다.
*/

class Car {

    private int currentSpeed;
    private int accelerationTime;

    // 메소드 생성.
    public void accelerate(int speed, int second) {
        System.out.println(second + "초 당 " + speed + "속도.");
    }

}

public class WhatIsMethod {

    public static void main(String[] args) {
        Car myCar = new Car();                // 객체 생성.
        myCar.accelerate(60, 3); // 메소드 호출.
    }

}
