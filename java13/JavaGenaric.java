package java13;

/*
    제네릭(Generic)
    Java에서 제네릭(Generic)이란 데이터 아비(data type)을 일반화(generalize)하는 것을 의미한다.
    제네릭은 클래스나 메소드에서 사용할 내부 데이터 타입을 컴파일 시에 미리 지정하는 방법이다.

    제네릭의 장점
    - 클래스나 메소드 내부에서 사용되는 객체의 타입 안정성을 높일 수 있다.
    - 반환값에 대한 타입 변환 및 타입 검사에 들어가는 노력을 줄일 수 있다.
    ※ JDK 1.5 이전에서는 여러 타입을 사용하는 대부분의 클래스, 메소드에서 인수나 반환값으로
      Object 타입을 사용해야만 했다. 이 경우 Object 객체를 원하는 타입으로 다시 변환해야만 하기에
      오류 발생 가능성이 있었다. 제네릭을 사용하면 미리 타입을 정해지므로 타입 검사나 변환을 생략할 수 있다.

    제네릭의 제거 시기
    Java 코드에서 선언되고 사용된 제네릭 타입은 컴파일 시에 자동으로 검사되어 변환되며, 바로 모든 제네릭
    타입은 제거된다. 왜? 코드와의 호환성을 유지하기 위함이다.
*/

import java.util.ArrayList;

// 제네릭의 선언.
class MyArray<T> { // T는 타입 변수(Type Variable)이라고 하며, 참조형 타입을 의미한다. 어떤 문자를 사용해도 상관없다.
    T element;

    void setElement(T element) {
        this.element = element;
    }

    T getElement() {
        return element;
    }
}

// 제네릭의 다형성 예제.
class LandAnimal {
    public void crying() {
        System.out.println("육지동물");
    }
}
class Cat extends LandAnimal {
    public void crying() {
        System.out.println("냐옹냐옹");
    }

}
class Dog extends LandAnimal {
    public void crying() {
        System.out.println("멍멍");
    }
}
class Sparrow {
    public void crying() {
        System.out.println("짹짹");
    }
}
class AnimalList<T> {
    ArrayList<T> animalList = new ArrayList<>();

    void add(T animal) {
        animalList.add(animal);
    }
    T get(int index) {
        return animalList.get(index);
    }
    boolean remove(T animal) {
        return animalList.remove(animal);
    }
    int size() {
        return animalList.size();
    }
}

public class JavaGenaric {

    public static void main(String[] args) {

        // 제네릭 클래스(Generic Class) 생성.
        MyArray<Integer> myArray = new MyArray<Integer>(); // 타입 변수로 Integer 타입을 사용하였다.
        // 기본 타입을 바로 사용할 수 없기에 래퍼 클래스를 사용해야만 한다.
        MyArray<Integer> myArray1 = new MyArray<>(); // 타입 추정이 가능한 경우 타입을 생략할 수 있다.

        // 제네릭 다형성 예제 이어서...
        AnimalList<LandAnimal> landAnimal = new AnimalList<>();
        landAnimal.add(new LandAnimal());
        landAnimal.add(new Cat());
        landAnimal.add(new Dog());
        // landAnimal.add(new Sparrow()); // 오류 발생. LandAnimal 클래스를 상속받는 자식 클래스가 아니므로.
        for(int i = 0; i < landAnimal.size(); i++) {
            landAnimal.get(i).crying();
        }
    }

}
