package java09;

/*
    필드의 초기화
    Java에서 필드는 초기화하지 않아도 자동으로 초기화되지만, 지역변수와 마찬가지로
    사용자가 원하는 적잘한 값으로 초기화한 후에 사용하는 것이 좋다.
    초기화 방법들은 아래와 같다.
    1) 명시적 초기화
        명시적 초기화는 지역 변수를 초기화하는 방법과 같이 선언과 동시에 초기화하는 방법이다.
    2) 생성자를 이용한 초기화
        생성자를 이용한 초기화는 인스턴스를 생성할 때까지 필드를 초기화할 수 없다.
    3) 초기화 블록을 이용한 초기화
        초기화 블록이란 초기화만을 담당하는 중괄호({})로 둘러싸인 블록을 의미하며 생성자보다
        먼저 호출되며, static 유무에 따라서 다음과 같이 구분할 수 있다.
            - 인스턴스 초기화 블록
                단순하게 중괄호({})만 사용하여 정의할 수 있는데, 인스턴스가 생성될 때마다
                생성자보다 먼저 실행된다. 생성자와 인스턴스 초기화 블록은 차이가 없기 때문에
                중복된 부분을 처리할 때를 제외하고는 거의 사용되지 않는다.
            - 클래스 초기화 블록
                인스턴스 초기화 블록에 static 키워드를ㄹ 추가하여 정의하며, 생성자와 인스턴스
                초기화 블록으로 수행할 수 없는 클래스 변수의 초기화를 수행할 때 사용된다.
*/

// 명시적 초기화의 예제.
class Example {
    static int classVar = 10; // 클래스 변수의 명시적 초기화.
    int instanceVar = 20; // 인스턴스 변수의 명시적 초기화.

}

class CarEx {

    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;
    private int currentSpeed;

    // 인스턴스 초기화 블록, 생성자 위에서 선언된다.
    {
        this.currentSpeed = 10;
    }

    // 생성자.
    CarEx() {}
    CarEx(String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public int getSpeed() {
        return currentSpeed;
    }

}

class CarEx1 {
    static int classVar; // 클래스 변수.
    int instatnceVar; // 인스턴스 변수.

    static {
        classVar = 10; // 클래스 초기화 블록을 이용한 초기화.
    }
}

public class InitialBlock {

    public static void main(String[] args)  {
        CarEx myCar = new CarEx(); // 인스턴스의 생성.
        System.out.println(myCar.getSpeed()); // 인스턴스 메소드 호출.
        System.out.println(CarEx1.classVar); // 클래스 변수에 접근.
    }

}

/*
    정리하자면 필드의 초기화 순서는 아래와 같다.
    클래스 변수: 기본값 -> 명시적 초기화 -> 클래스 초기화 블록.
    인스턴스 변수: 기본값 -> 인스턴스 초기화 블록 -> 생성자
*/
