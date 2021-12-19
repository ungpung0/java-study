package java11;

/*
    다형성(Polymorphism)
    다형성이란 하나의 객체가 여러 타입을 가질 수 있는 것을 의미한다.
    부모 클래스 타입의 참조 변수로 클래스 타입의 인스턴스를 참조할 수 있다.

    참조 변수의 타입 변환
    1) 서로 상속 관계의 클래스 사이에만 타입 변환을 할 수 있다.
    2) 자식 클래스 타입에서 부모 클래스 타입으로 변환을 생략할 수 있다.
    3) 부모 클래스 타입에서 자식 클래스 타입으로 변환은 반드시 명시해야 한다.
    ex) (타입클래스명) 변환참조변수

    instanceof 연산자
    이러한 다형성의 특징으로 인해서, 실제 참조하고 있는 인스턴스의 타입을 확인해야만 한다.
    instanceof 연산자를 사용하여 실제 타입을 확인할 수 있다.
    ex) 참조변수 instanceof 클래스명
    왼쪽의 참조변수가 오른쪽의 클래스의 타입과 일치하면 true를 아니면 flase를 반환한다.
*/

// 참조 변수 다형성의 예제.
class ParentPoly {}
class ChildPoly extends ParentPoly {}
class  BroPoly extends ParentPoly {}

public class Polymorphism {

    public static void main(String[] args) {

        ParentPoly pa = new ParentPoly();
        ChildPoly ca = new ChildPoly();
        ParentPoly pc = new ChildPoly(); // 부모 클래스는 자식 클래스를 참조할 수 있다.
        // ChildPoly cp = new ParentPoly(); // 오류 발생. (자식 멤버의 수 > 부모 멤버의 수)

        ParentPoly pa1 = null;
        ChildPoly ch1 = new ChildPoly();
        ParentPoly pa2 = new ParentPoly();
        BroPoly br = null;

        pa1 = ch1; // pa1 = (ParentPoly)ch1; 과 같으며, 타입 변환을 생략할 수 있다.
        // br = (BroPoly)pa2; // 타입 변환을 생략할 수 없다.
        // br = (BroPoly)ch1; // 직접적인 상속관계가 아니므로 오류가 발생한다.

        // instanceof 사용 예제.
        System.out.println(pa instanceof Object);
        System.out.println(pa instanceof ParentPoly);
        System.out.println(pa instanceof ChildPoly);
        System.out.println(pc instanceof Object);
        System.out.println(pc instanceof ParentPoly);
        System.out.println(pc instanceof ChildPoly);

    }
}
