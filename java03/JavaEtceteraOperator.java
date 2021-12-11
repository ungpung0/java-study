package java03;

public class JavaEtceteraOperator {
    public static void main(String[] args) {
        /*
            삼항 연산자(Tenary Operator)
            자바에서 유일하게 피연산자를 세 개 가지는 조건 연산자이다.
            ex) 조건식 ? 반환값1(참) : 반환값2(거짓)
        */
        int num1 = 5, num2 = 7;
        int result;
        result = (num1 - num2 > 0) ? num1 : num2;
        System.out.println("두 정수 중 큰 수는 " + result);

        /*
            instanceof 연산자
            참조 변수가 참조하고 있는 인스턴스의 실제 타입을 반환한다.
            인스턴스(Instance): 설계도를 바탕으로 소프트웨어에 구현된 구체적인 실체.
            ex) 인스턴스명 instanceof 클래스명|인터페이스명
        */
        class A {}
        class B extends A {}
        A a = new A();
        B b = new B();
        System.out.println(a instanceof A); // a는 A 객체. true
        System.out.println(b instanceof A); // b는 A 상속객체. true
        System.out.println(a instanceof B); // a는 B 객체아님. false
        System.out.println(b instanceof B); // b는 B 객체. true
    }
}
