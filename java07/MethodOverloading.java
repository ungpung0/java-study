package java07;

/*
    메소드 시그니처(Method Signature)
    메소드의 선언부에 명시되는 매개변수의 리스트이다. 만약 두 메소드의 매개변수 개수와 타입,
    순서까지 전부 같다면, 두 메소드의 시그니처는 일치한다.

    메소드 오버로딩(Method Overloading)
    같은 이름의 메소드를 중복하여 정의하는 것을 의미하며, 다른 시그니처를 갖는 여러 메소드를
    같은 이름으로 정의하는 것을 의미한다. 메소드를 호출할 때, 타입과 개수에 대해 신경쓰지 않고
    호출할 수 있게 만들어주며, 다형성(Polymorphism)을 상징한다.

    메소드 오버로딩의 조건
    - 메소드의 이름이 같아야만 한다.
    - 메소드의 시그니처가 달라야만 한다.

    메소드 오버로딩의 예제
    ex)
        void display(int num1)
        void display(int num1, num2)
        void display(int num1, double num2)
*/

class Test {

    static void display(int num1) { System.out.println(num1); }
    static void display(int num1, int num2) { System.out.println(num1 * num2); }
    static void display(int num1, double num2) { System.out.println(num1 + num2); }

}

public class MethodOverloading {

    public static void main(String[] args) {
        Test myFunction = new Test();

        myFunction.display(10);
        myFunction.display(10, 20);
        myFunction.display(10, 3.14);
        myFunction.display(10, 'a'); // 'a'는 아스키 코드값이 97이다.
    }

}
