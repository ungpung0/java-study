package java12;

/*
    java.lang 패키지
    Java에서 가장 기본적은 동작을 수행하는 클래스들의 집합으로서
    import 문을 사용하지 않아도 클래스명으로 바로 사용할 수 있다.

    java.lang.Object 클래스
    Object 클래스는 모든 Java 클래스의 최고 조상 클래스가 되며,
    모든 Java 클래스들은 모든 메소드를 바로 사용할 수 있다.
        1) toString() 메소드:
            해당 인스턴스의 정보를 문자열로 반환된다. 반환되는 문자열은
            구분자로 '@' + '16진수 해시코드(인스턴스 주소)'로 구성된다.
        2) equals() 메소드:
            해당 인스턴스의 매개변수로 전달받는 참조 변수와 비교하여 결과를 반환한다.
            참조 변수가 가리키는 값을 비교하므로, 다른 객체는 언제나 false를 반환한다.
        3) clone() 메소드:
            해당 인스턴스를 복제하여 새로운 인스턴스를 생성하여 반환한다.
            하지만 필드의 값이 배열이나 인스턴스일 경우 제대로 복사할 수 없다.
            이런 경우에는 clone() 메소드를 오버라이딩하여, 복제가 이루어지도록 재정의해야 한다.

*/

import java.util.ArrayList;

class CarTest {

    private String modelName, color;
    private int modelYear, maxSpeeds;
    private ArrayList<String> owners = new ArrayList<>();

    // 생성자 선언 예제.
    CarTest(String modelName, String color, int modelYear, int maxSpeeds) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeeds = maxSpeeds;
    }

    CarTest(){}

    // Getter / Setter
    public String getModelName() { return this.modelName; }
    public void setModelName(String modelName) {this.modelName = modelName; }

}



public class Object {
    public static void main(String[] args) {

        // toString() 메소드의 예제.
        CarTest car1 = new CarTest();
        CarTest car2 = new CarTest();
        System.out.println(car1.toString());
        System.out.println(car2.toString());

        // equals() 메소드의 예제.
        System.out.println(car1.equals(car2));
        car1 = car2;
        System.out.println(car1.equals(car2));
    }
}
