package java09;

/*
    메소드(Method)
    클래스의 메소드는 작업을 수행하기 위한 명령문의 집합이다.
    - 클래스 메소드(Static Method)
        Static 키워드를 갖는 메소드를 클래스 메소드이다. 클래스 변수와 마찬가지로
        인스턴스를 생성하지 않고 바로 사용할 수 있다. 따라서, 메소드 내부에서 인스턴스
        변수를 사용할 수 없다.
    - 인스턴스 메소드(Instance Method)
        Static 키워드를 갖지 않는 메소드를 인스턴스 메소드라고 한다.
*/

class MethodEx {
    int a = 10, b = 20; // 인스턴스 변수.
    int add() { return a + b; } // 인스턴스 메소드.
    static int add(int x, int y) { return x + y; } // 클래스 메소드.
}

public class Method {

    public static void main(String[] args) {
        System.out.println(MethodEx.add(20, 30)); // 클래스 메소드 호출.
        MethodEx methodEx = new MethodEx(); // 인스턴스 생성.
        System.out.println(methodEx.add()); // 인스턴스 메소드 호출.
    }
}
