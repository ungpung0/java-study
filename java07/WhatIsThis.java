package java07;

/*
    this 참조 변수
    this 참조 변수는 인스턴스가 자기 자신을 참조하는 데 사용하는 변수로서,
    해당 인스턴스의 주소를 가리키고 있다.
*/

class Car3 {

    private String modelName, color;
    private int modelYear, maxSpeeds;

    Car3(String modelName, String color, int modelYear, int maxSpeeds) {
        this.modelName = modelName; // 여기에서 this로 생성자의 인스턴스 변수에 접근한다.
        this.modelYear = modelYear; // this는 인스턴스 메소드에서만 사용할 수 있으며, 클래스 메소드에서 사용은 불가능하다.
        this.color = color;
        this.maxSpeeds = maxSpeeds;
    }

    Car3() {
        this("소나타", "빨강색", 2012, 150);
        // this()는 생성자 내부에서만 사용하며, 같은 클래스의 다른 생성자를 호출할 때 사용한다.
    }

    // 메소드 선언 예제.
    public String getModel() {
        return "차량: " + this.modelName + " 연식: " + this.modelYear + " 색상: " + this.color;
    }

}

public class WhatIsThis {

    public static void main(String[] args) {

        Car3 testCar = new Car3();
        System.out.println(testCar.getModel());

    }

}
