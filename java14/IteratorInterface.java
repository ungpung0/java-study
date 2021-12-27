package java14;

/*
    Iterator<E> 인터페이스
    Java의 컬렉션 프레임워크는 컬렉션의 요소들을 읽어오는 방법을 Iterator 인터페이스로 표준화한다.
    Collection 인터페이스에서는 iterator() 메소드를 정의하여 각 요소의 접근을 방지하고 있다.
    현재 Java에서는 조회에는 Enhanced for문을, 제거나 대체 작업에 반복자(Iterator)를 권장하고 있다.

    Iterator의 메소드
    - hasNext():
        해당 이터레이션(Iteration)이 다음 요소를 가지고 있으면 true를 반환하고 없으면 false를 반환한다.
    - next():
        이터레이션의 다음 요소를 반환한다.
    - remove():
        해당 반복자로 반환되는 마지막 요소를 현재 컬렉션에서 제거한다.

    Enumeration<E> 인터페이스
    JDK 1.0부터 사용해온 Iterator 인터페이스와 동일 동작을 수행하는 인터페이스이다.
    Iterator의 하위 호환격으로 Iterator 인터페이스를 사용하는 것을 권장한다.

    ListIterator<E> 인터페이스
    ListIterator 인터페이스는 Iterator 인터페이스를 상속받아 여러 기능을 추가한 인터페이스이다.
    Iterator 인터페이스는 단일 방향으로만 이동할 수 있지만, ListIterator 인터페이스는 양방향을 지원한다.
    단, List 컬렉션 클래스의 listIterator()에서만 사용할 수 있다.
*/

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IteratorInterface {

    public static void main(String[] args) {

        // Iterator 순환 예제.
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(4);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(1);
        Iterator<Integer> iterator = linkedList.iterator();
        while(iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println("");

        // ListIterator의 예제.
        ListIterator<Integer> iterator1 = linkedList.listIterator();
        while(iterator1.hasNext())
            System.out.print(iterator1.next() + " ");
        System.out.println("");
        while(iterator1.hasPrevious())
            System.out.print(iterator1.previous() + " ");
    }

}
