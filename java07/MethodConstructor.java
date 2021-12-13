package java07;

/*
    클래스로 객체를 생성하면, 메모리에 즉시 생성된다.
    이렇게 생성된 객체는 인스턴스 변수가 초기화되지 않은 상태이다.
    인스턴스 변수 중에는 private 변수도 있기 때문에, 초기화만을 위한
    public 메소드가 반드시 필요하다.

    생성자(Constructor)
    Java에서 객체의 생성과 동시에 원하는 값으로 초기화할 수 있는 생성자를 제공한다.
    특징
        - 생성자는 반환값이 없지만, 반환 타입을 void 형으로 선언하지 않는다.
        - 생성자는 초기화를 위한 데이터를 인수로 전달받을 수 있다.
        - 초기화 방법이 여러 가지 존재할 경우에는 여러 개의 생성자를 가질 수 있다. (메소드 오버로딩)
    예
        Car(String modelName) {}
        Car(String modelName, int modelYear) {}
        Car(String modelName, int modelYear, String color) {}
        Car(String modelName, int modelYear, String color, int maxSpeeds) {}

    기본 생성자(Default Constructor)
    특별하게 생성자를 정의하지 않고 인스턴스를 생성할 수 있다.
    자바 컴파일러가 기본 생성자를 제공하여 주기 때문인데, 어떠한 매개변수와 명령어를 포함하고 있지 않다.
    ex
        Car() {}
*/

class Car1 {

    private String modelName, color;
    private int modelYear, maxSpeeds;

    // 생성자 선언 예제.
    Car1(String modelName, String color, int modelYear, int maxSpeeds) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeeds = maxSpeeds;
    }

    // 메소드 선언 예제.
    public String getModel() {
        return "차량: " + this.modelName + " 연식: " + this.modelYear + " 색상: " + this.color;
    }

}

// 생성자가 없는 클래스.
class Car2 {

    private String modelName =  "소나타", color = "파랑색";
    private int modelYear = 2001, maxSpeeds = 150;

    public String getModel() {
        return "차량: " + this.modelName + " 연식: " + this.modelYear + " 색상: " + this.color;
    }

}


public class MethodConstructor {

    public static void main(String[] args) {

        Car1 myCar1 = new Car1("아반떼", "초록색", 2015, 250);
        System.out.println(myCar1.getModel());

        Car2 myCar2 = new Car2();
        System.out.println(myCar2.getModel());
    }
}
