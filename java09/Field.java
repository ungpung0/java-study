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
    static int modelOutput; // 클래스 변수.
    String modelName; // 인스턴스 변수.

    void method() {
        int var = 10; // 지역 변수.
    }
    // 클래스 변수와 인스턴스 변수는 자동으로 초기화되고, 지역 변수는 반드시 초기화해야만 한다.
}

public class Field {
}
