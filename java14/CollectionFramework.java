package java14;

/*
    컬렉션 프레임워크(Collection Framework)
    Java에서 컬렉션 프레임워크란 다수의 데이터를 쉽고 효과적으로 처리할 수 있는
    표준화된 방법을 제공하는 클래스들의 집합을 의미한다. 데이터를 저장하는 자료 구조와
    데이터를 처리하는 알고리즘을 구조화하여 클래스로 구현해 놓았다.
    Java의 인터페이스(Interface)를 사용하여 구현된다.

    컬렉션 프레임워크 주요 인터페이스
    컬렉션 프레임워크의 주요 인터페이스로 List, Set, Map 인터페이스를 들 수 있다.
    이 중에서 List, Set은 모두 Collection 인터페이스를 상속받지만, Map 인터페이스는
    별도로 정의된다.

    컬렉션 프레임워크 주요 인터페이스의 특징
    - List<E>:
        순서가 있는 집합으로 데이터의 중복을 허용한다.
        ex) Vector, ArrayList, LinkedList, Stack, Queue.
    - Set<E>:
        순서가 없는 집합으로 데이터의 중복을 허용하지 않는다.
        ex) HashSet, TreeSet.
    - Map<K, V>:
        키와 값의 한 쌍을 이루는 데이터 집합으로 순서가 존재하지 않는다.
        키의 중복을 허용하지는 않지만, 값의 중복은 허용한다.
        ex) HashMap, TreeMap, Hashtable, Properties

    컬렉션 클래스(Collection Class)
    컬렉션 프레임워크에 속하는 인터페이스를 구현한 클래스를 컬렉션 클래스라 한다.
    따라서 컬렉션 프레임워크의 모든 클래스들은 List, Set, Map 중 하나를 구현한다.

    컬렉션 인터페이스의 주요 메소드
    List, Set 인터페이스의 공통 부분을 Collection 인터페이스에서 정의하고,
    두 인터페이스
    - add(E e): 해당 컬렉션에 전달된 요소를 추가한다.
    - clear(): 해당 컬렉션의 모든 요소를 제거한다.
    - contains(Object o): 해당 컬렉션이 전달된 객체를 포함하는지 여부를 검사한다.
    - equals(Obejct o): 해당 컬렉션과 전달된 객체가 같은지를 확인한다.
    - isEmpty(): 해당 컬렉션이 비어있는지 여부를 확인한다.
    - Iterator<E> iterator(): 해당 컬렉션의 반복자를 반환한다.
    - remove(Object o): 해당 컬렉션에 전달된 객체를 제거한다.
    - size(): 해당 컬렉션의 요소의 총 개수를 반환한다.
    - toArray(): 해당 컬렉션의 모든 요소들을 Object 타입 배열로 반환한다.
*/


import java.util.ArrayList;

public class CollectionFramework {

    public static void main(String[] args) {

        // 리스트의 생성. (ArrayList)
        ArrayList<String> arrayList = new ArrayList<>();

        // 리스트의 요소 저장.
        arrayList.add("넷");
        arrayList.add("둘");
        arrayList.add("셋");
        arrayList.add("하나");

        // 리스트 요소 출력.
        for(int i = 0; i < arrayList.size(); i++)
            System.out.println(arrayList.get(i));
    }
}
