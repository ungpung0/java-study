package java06;

/*
    객체 지향 프로그래밍(OOP, Object-Oriented Programming)
    OOP에서 모든 데이터는 객체(Object)로 취급되며, 중심이 된다.

    클래스(Class)
    Java에서 클래스란 객체의 정의틀, 설계도와 같은 의미를 가진다.
    클래스는 필드(Field)와 메소드(Method)로 구성된다.
    - 필드(Field): 객체의 상태를 나타내는 것으로 클래스의 변수(Variable)를 의미한다.
    - 메소드(Method): 특정 작업을 수행하기 위한 명령문의 집합이다.

    인스턴스(Instance)
    Java에서 클래스를 사용하기 위해 객체를 선언하는 과정을 인스턴스화라고 한다.
    이렇게 생성된 인스턴스는 메모리 공간에 자신만의 필드를 가질 수 있다.
    해당 클래스의 모든 메소드들은 생성된 모든 인스턴스가 공유하게 된다.

    클래스의 예
    ex)
    클래스 = 자동차;
    필드 = {자동차.모델명, 자동차.생산일, 자동차.색상, 자동차.최고속력}
    메소드 = {자동차.엑셀밟기(), 자동차.브레이크()}
    인스턴스 = {내 자동차, 친구 자동차}

    메소드의 선언 방법.
    접근제어자 반환타입 메소드명(매개변수목록) {
        //선언부
        //구현부
    }

    ※ 기본적으로 Java에서는 둘 이상의 같은 이름의 메소드를 정의할 수 없으나,
      메소드 오버로딩(Method Overloading)을 사용하면 중복할 수 있다.
      메소드 오버로딩이란 매개변수 개수, 타입을 다르게 하여 같은 이름의 다른 메소드를 정의하는 것.
*/

class Car {                   // 클래스.
    private String modelName; // 필드.
    private int modelYear;

    Car(String modelName, int modelYear) { // 생성자.
        this.modelName = modelName;
        this.modelYear = modelYear;
    }

    public String getModel() { // 메소드.
        return this.modelYear + "년식 " + this.modelName;
    }
}

public class JavaClassBasics {

    public static void main(String[] args) {

        String model = "avante";
        int year = 2015;

        // 인스턴스의 생성.
        Car myCar; // 참조 변수 선언.
        // 최종 인스턴스 생성.
        // myCar = new Car();
        // Car myCar1 = new Car();
        // ※ 매개변수가 있는 생성자를 정의하였기에, 기본 생성자를 호출하면 오류가 발생할 것이다.
    }

}
