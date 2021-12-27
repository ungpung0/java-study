package java14;

/*
    Set 컬렉션 클래스
    요소의 저장 순서를 유지하지 않고, 중복 저장을 허용하지 않는 Set 클래스이다.
    대표적인 Set 클래스로 HashSet<E>, TreeSet<E> 클래스가 있다.

    HashSet<E> 클래스
    JDK 1.2부터 제공된 HashSet 클래스는 해시 알고리즘(Hash Algorithm)을 적용하여 굉장히 빠르다.
    HashSet 클래스는 내부적으로 HashMap 인스턴스를 이용하여 요소를 저장한다.
    만약, 요소의 저장 순서를 유지해야 한다면 JDK 1.4부터 제공하는 LinkedHashSet 클래스를 사용한다.

    해시 알고리즘(Hash Algorithm)
    해시 알고리즘이란 해시 함수를 사용하여 데이터를 해시 테이블에 저장하고 검색하는 알고리즘이다.
    키값(Key) => 해시함수(Function) => 배열(Array) => 연결리스트(Linked List)

    HashSet의 add()
    HashSet은 중복을 허용하지 않는데, add()로 중복 요소를 추가하려고 하면, false를 반환한다.
    HashSet의 중복 요소 파악 과정은 다음과 같다.
        1) 해당 요소에서 hashCode() 메소드를 호출하여, 반환된 해시값으로 검색할 범위를 결정한다.
        2) 해당 범위 내의 요소들을 equals() 메소드로 비교한다.
    중복 없이 새로운 요소를 추가하기 위해서 hashCode()와 equals() 메소드를 적절히 사용해야만 한다.

    TreeSet<E> 클래스
    데이터가 정렬된 상태로 저장되는 이진 검색 트리(Binary Search Tree) 형태로 요소를 저장한다.
    이진 검색 트리는 데이터를 추가하거나 제거하는 등의 기본 동작 시간이 매우 빠르다.
    JDK 1.2부터 제공되는 TreeSet 클래스는 NavigableSet 인터페이스를 기존의 이진 검색 트리의 성능을
    향상시킨 레드-블랙 트리(Red-Black tree)로 구현한다.

*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

// 클래스를 HashSet에 저장하는 과정1.
class Animal {
    String species;
    String habitat;

    Animal(String species, String habitat) {
        this.habitat = habitat;
        this.species = species;
    }

    public int hashCode() {
        return(species + habitat).hashCode();
    }

    public boolean equals(Object object) {
        if(object instanceof Animal) {
            Animal temp = (Animal)object;
            return species.equals(temp.species) && habitat.equals(temp.habitat);
        }else {
            return false;
        }
    }
}

public class SetClass {

    public static void main(String[] args) {

        // HashSet의 선언.
        System.out.println(" == HashSet의 예제 == ");
        HashSet<String> hashSet1 = new HashSet<String>();
        HashSet<String> hashSet2 = new HashSet<String>();
        // 요소의 저장. add()
        hashSet1.add("홍길동");
        hashSet2.add("이순신");
        System.out.println(hashSet1.add("임꺽정"));
        System.out.println(hashSet1.add("임꺽정")); // 중복 요소 저장.
        // 요소의 출력. Enhanced for문, get()
        for(String e : hashSet1)
            System.out.print(e + " ");
        System.out.println("");
        // 추가적으로 요소의 저장.
        hashSet2.add("곽재우");
        hashSet2.add("원균");
        hashSet2.add("이순신");
        // 요소의 출력. iterator()
        Iterator<String> iterator = hashSet2.iterator();
        while(iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println("");
        // 요소의 개수. size()
        System.out.println("HashSet의 크기: " + hashSet2.size() + "\n");

        // 클래스를 HashSet에 저장하는 과정2.
        System.out.println(" == HashSet에 클래스를 저장하는 예제 == ");
        HashSet<Animal> hashSetAnimal = new HashSet<Animal>();
        hashSetAnimal.add(new Animal("고양이", "육지"));
        hashSetAnimal.add(new Animal("고양이", "육지"));
        hashSetAnimal.add(new Animal("고양이", "육지"));
        System.out.println(hashSetAnimal.size() + "\n");

        // TreeSet의 선언.
        System.out.println(" == TreeSet의 예제 == ");
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        // 요소의 저장. add()
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(20);
        treeSet.add(10);
        // 요소의 출력1. Enhanced for문, get()
        for(int e : treeSet)
            System.out.print(e + " ");
        System.out.println("");
        // 요소의 제거. remove()
        treeSet.remove(40);
        // 요소의 출력2. iterator()
        Iterator<Integer> iterator1 = treeSet.iterator();
        while(iterator1.hasNext())
            System.out.print(iterator1.next() + " ");
        System.out.println("");
        // 요소의 개수. size()
        System.out.println("TreeSet의 크기: " + treeSet.size());
        // 부분 집합의 출력. subSet()
        System.out.println(treeSet.subSet(10, 20)); // 첫 요소부터 두 번째 요소의 직전까지 반환한다.
        System.out.println(treeSet.subSet(10, true, 20, true));
        // 두 번째, 네 번째 요소는 검색 범위의 요소의 포함 여부를 명시한다.
    }
}
