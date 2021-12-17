package java09;

/*
    필드(Field)
    클래스에 포함된 변수(Variable)를 의미하며, 선언 위치에 따라서 다음과 같이 구분된다.
    - 클래스 변수(static variable)
        클래스가 메모리에 올라갈 때 생성되며, 프로그램이 종료될 때 사라진다.
        메모리의 메소드 영역에 저장된다.
    - 인스턴스 변수(instance variable)
        인스턴스가 생성될 때 생성되며, 인스턴스가 소멸할 때 사라진다.
        메모리의 힙 영역에 저장된다.
    - 지역 변수(local variable)
        블록 내의 변수가 선언될 때 생성되며, 블록을 벗어날 때 사라진다.
        메모리의 스택 영역에 저장된다.
*/

class Car {
    static int modelOutput = 10; // 클래스 변수.
    String modelName = "20"; // 인스턴스 변수.

    void method() {
        int var = 10; // 지역 변수.
    }
    // 클래스 변수와 인스턴스 변수는 자동으로 초기화되고, 지역 변수는 반드시 초기화해야만 한다.
}

public class Field {

    public static void main(String[] args) {

        int var = 30; // 지역 변수.
        System.out.println("지역변수: " + var + "\n");

        Car myField1 = new Car(); // 인스턴스 생성.
        Car myField2 = new Car(); // 인스턴스 생성.

        System.out.println(Car.modelOutput);    // 클래스 변수 참조.
        System.out.println(myField1.modelOutput);
        System.out.println(myField2.modelOutput);

        myField1.modelOutput = 100; // 클래스 변수의 값을 변경할 수 있다.

        System.out.println(myField1.modelName); // 인스턴스 변수 참조.
        System.out.println(myField2.modelName);

        myField1.modelName = "200"; // 인스턴스 변수의 값을 변경할 수 있다.

        System.out.println(myField1.modelName);
        System.out.println(myField2.modelName);


    }
}
