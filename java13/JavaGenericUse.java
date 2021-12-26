package java13;

/*
    제네릭 메소드(Generic Method)
    제네릭 메소드란 메소드의 선언부에 타입 변수를 사용한 메소드를 의미한다.
    이때 타입 변수의 선언은 반환 타입 바로 앞에 위치한다.
    ex)
        public static <T> void sort() {}

    와일드 카드(Wild Card)
    와일드 카드란 이름에 제한을 두지 않음을 표현하는 데 사용하는 기호.
    Java의 제네릭에서 물음표(?) 기호를 사용하여 와일드 카드를 사용할 수 있다.
    ex)
        <?> // 타입 변수의 모든 타입을 사용할 수 있다.
        <? extends T> // T 타입과 T 타입을 상속받는 자손 클래스 타입만을 사용할 수 있다.
        <? super T> // T 타입과 T 타입이 상속받은 조상 클래스 타입만을 사용할 수 있다.
*/

import java.util.ArrayList;

interface WarmBlood {}

// 다형성 활용 예제.
class LandAnimals {public void crying() {
    System.out.println("육지동물!");
}}
class CatAnimals extends LandAnimals {public void crying() {
    System.out.println("냥냥!");
}}
class DogAnimals extends LandAnimals {public void crying() {
    System.out.println("멍멍!");
}}
class BirdAnimals {public void crying() {
    System.out.println("짹짹!");
}}
class AnimalsLists<A extends LandAnimals> {
    ArrayList<A> al = new ArrayList<>();
    public static void cryingAnimalList(AnimalsLists<? extends LandAnimals> al) {
        LandAnimals la = al.get(0);
        la.crying();

    }
    void add(A animal) {
        al.add(animal);
    }
    A get(int index) {
        return al.get(index);
    }
    boolean remove(A animal) {
        return al.remove(animal);
    }
    int size() {
        return al.size();
    }
}

public class JavaGenericUse {

    public static void main(String[] args) {
        // 제네릭은 T와 같은 타입 변수를 사용하여 타입을 제한한다.
        // 이때 extends 키워드를 사용하여 특정 타입만을 사용하도록 제한할 수 있다.
        class AnimalList<T extends LandAnimal> {}

        // 위와 같이 제한을 걸어놓으면 인터페이스를 구현할 때에도 implements가 아닌 extends 키워들를 사용해야만 한다.
        class AnimalList1<T extends WarmBlood> {}

        // 클래스와 인터페이스를 동시에 상속 및 구현하려면 엠퍼센트(&) 기호를 사용하면 된다.
        class AnimalList2<T extends LandAnimal & WarmBlood> {}

        // 다형성 예제 이어서...
        AnimalsLists<LandAnimals> landAnimals = new AnimalsLists<>();
        landAnimals.add(new LandAnimals());
        landAnimals.add(new CatAnimals());
        landAnimals.add(new DogAnimals());
        for(int i = 0; i < landAnimals.size(); i++)
            landAnimals.get(i).crying();

        AnimalsLists<CatAnimals> catList = new AnimalsLists<CatAnimals>();
        catList.add(new CatAnimals());
        AnimalsLists<DogAnimals> dogList = new AnimalsLists<DogAnimals>();
        dogList.add(new DogAnimals());
        AnimalsLists.cryingAnimalList(catList);
        AnimalsLists.cryingAnimalList(dogList);
    }

}
