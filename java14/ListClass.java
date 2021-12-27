package java14;

/*
    List 컬렉션 클래스
    요소의 중복 저장을 허용하고 저장 순서가 유지되는 특징을 가졌다.
    대표적인 List 클래스로 ArrayList, LinkedList, Vector, Stack이 있다.

    ArrayList<E> 클래스
    JDK 1.2부터 제공된 ArrayList 클래스는 내부적으로 배열을 이용하여 요소를 저장한다.
    배열은 인덱스로 접근할 수 있다는 장점이 있지만, 크기를 변경할 수 없는 인스턴스이므로,
    크기를 늘리려면 새로운 배열을 생성해야 한다는 단점이 있다.

    LinkedList<E> 클래스
    JDK 1.2부터 제공된 LinkedList는 ArrayList의 배열의 단점을 극복하기 위하여 고안되었다.
    배열은 저장된 요소가 순차적으로 저장되지만, 연결리스트는 비순차적으로 분포되며 요소 사이사이
    링크(Link)로 연결되어 구성된다.
    - 단일 연결 리스트(Singly Linked List):
        헤더 -> 요소(데이터,Next) -> 요소(데이터,Next).
        단일 연결 리스트는 요소의 저장 및 삭제 작업에서 다음 요소를 가리키는 참조만 변경하면 되므로,
        아주 빠르게 처리될 수 있으나, 이전 요소로 접근하기가 매우 어렵다.
    - 이중 연결 리스트(Doubly Linked List):
        헤더 -> (Null,데이터,Next) <-> (Prev,데이터,Next) <-> (Prev,데이터,Next).
        이전 요소의 접근이 가능한 연결리스트 이다.

    Vector<E> 클래스
    JDK 1.0부터 사용해온 ArrayList 클래스와 동일 동작을 수행하는 클래스이다.
    ArrayList의 하위 호환 격으로 거의 사용되지 않는다.

    Stack<E> 클래스
    Stack 클래스는 Vector 클래스를 상속받아 전형적인 스택 메모리 구조의 클래스를 제공한다.
    스택 메모리 구조는 선형의 메모리 공간에 데이터를 저장하며 LIFO(후입선출)을 따르는 구조이다.

    Stack에서 사용하는 Vector 메소드
    Stack 클래스는 스택 메모리 구조를 위하여 Vector 클래스 메소드를 상속받아 사용한다.
    - empty():
        해당 스택이 비어있으면 true를, 비어있지 않으면 false를 반환한다.
    - peek():
        해당 스택의 최상단의 요소를 반환한다. 즉, 가장 마지막에 저장된 요소를 반환한다.
    - pop(E item):
        해당 스택의 최상단에 전달된 요소를 삽입한다.
    - search(Object o):
        해당 스택에서 전달된 객체가 존재하는 위치의 인덱스를 반환한다.
        이때 인덱스는 최상단의 요소부터 1로 시작한다.
    ※ 복잡하고 빠른 스택을 구현하려면 Deque 인터페이스를 구현한 ArrayDeque 클래스를 사용한다.
        ex) Deque<Integer> st = new ArrayDeque<Integer>();

    Queue<E> 인터페이스.
    Java에서 클래스로 구현된 스택과 달리 큐 메모리 구조는 인터페이스 형태로 제공된다.
    Queue 인터페이스를 상속받는 하위 인터페이스는 Deque<E>, BlockingDeque<E>, BlockingQueue<E>, TransferQueue<E>가 있다.
    보통 Deque 인터페이스를 구현한 LinkedList 클래스가 큐 메모리 구조를 구현하는 데 사용된다.
    큐 메모리 구조는 선형 메모리 공간에 데이터를 저장하며 FIFO(선입선출)을 따르는 구조이다.

    Queue에서 사용하는 Collection 인터페이스 메소드
    Queue 인터페이스는 큐 메모리 구조를 표현하기 위해, 다음과 같은 Collection 인터페이스 메소드를 상속한다.
    - add(E e):
        해당 큐의 맨 뒤에 전달된 요소를 삽입한다. 성공하면 true를, 실패하면 Exception을 반환한다.
    - offer(E e):
        해당 큐의 맨 뒤에 전달된 요소를 삽입한다.
    - element():
        해당 큐의 맨 앞의 요소를 반환한다.
    - peek():
        해당 큐의 맨 앞의 요소를 반환한다. 큐가 비어있으면 null를 반환한다.
    - poll():
        해당 큐의 맨 앞의 요소를 반환하고, 해당 요소를 큐에서 제거한다. 큐가 비어있으면 null를 반환한다.
    - remove():
        해당 큐의 맨 앞의 요소를 제거한다.
    ※ 마찬가지로 빠른 큐을 구현하려면 Deque 인터페이스를 구현한 ArrayDeque 클래스를 사용한다.
        ex) Deque<Integer> qu = new ArrayDeque<Integer>();
*/

import java.util.*;

public class ListClass {

    public static void main(String[] args) {

        // ArrayList 선언.
        System.out.println(" == 배열리스트 예제 == ");
        ArrayList<Integer> arrayList = new ArrayList<>();
        // 요소의 저장. add()
        arrayList.add(40);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(10);
        // 요소의 변경. set()
        arrayList.set(0, 20);
        // 요소의 제거. remove()
        arrayList.remove(1);
        // 요소의 정렬. Collections.sort()
        Collections.sort(arrayList);
        // 요소의 출력1. for문, get()
        for(int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println("");
        // 요소의 출력2. Enhanced for문, get()
        for(int e : arrayList) {
            System.out.print(e + " ");
        }
        System.out.println("");
        // 요소의 출력3. iterator(), get()
        Iterator<Integer> iterator = arrayList.iterator();
        while(iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println("");
        // 요소의 총 개수. size()
        System.out.println("ArrayList의 크기: " + arrayList.size() + "\n");



        // LinkedList 선언.
        System.out.println(" == 연결리스트 예제 == ");
        LinkedList<String> linkedList = new LinkedList<String>();
        // 요소의 저장. add()
        linkedList.add("넷");
        linkedList.add("둘");
        linkedList.add("셋");
        linkedList.add("하나");
        // 요소의 변경. set()
        linkedList.set(2, "둘");
        // 요소의 제거. remove()
        linkedList.remove(1);
        // 요소의 출력1. for문, get()
        for(int i = 0; i < linkedList.size(); i++)
            System.out.print(linkedList.get(i) + " ");
        System.out.println("");
        // 요소의 출력2. Enhanced for문, get()
        for(String e : linkedList)
            System.out.print(e + " ");
        System.out.println("");
        // 요소의 출력3. Iterator, get()
        Iterator<String> iterator1 = linkedList.iterator();
        while(iterator1.hasNext())
            System.out.print(iterator1.next() + " ");
        System.out.println("");
        // 요소의 총 개수. size()
        System.out.println("LinkedList의 크기: " + linkedList.size() + "\n");



        // Stack의 선언.
        System.out.println(" == 스택의 예제 == ");
        Stack<Integer> stack = new Stack<Integer>();
        // Deque<Integer> stack = new ArrayDeque<Integer>();
        // 요소의 저장. push()
        stack.push(4);
        stack.push(2);
        stack.push(3);
        stack.push(1);
        // 요소의 반환1. peek()
        System.out.println(stack.peek());
        System.out.println(stack);
        // 요소의 반환2 및 제거. pop()
        System.out.println(stack.pop());
        System.out.println(stack); // peek은 요소를 출력, pop은 출력 후 제거한다.
        // 인덱스의 반환. search()
        System.out.println(stack.search(4));
        System.out.println(stack.search(3) + "\n");
        // 단 ArrayDeque 클래스는 search() 메소드를 지원하지 않는다.



        // Queue의 선언.
        System.out.println(" == 큐의 예제 == ");
        LinkedList<String> queue = new LinkedList<String>();
        // 요소의 저장 add()
        queue.add("넷");
        queue.add("둘");
        queue.add("셋");
        queue.add("하나");
        // 요소의 반환1. peek()
        System.out.println(queue.peek());
        System.out.println(queue);
        // 요소의 반환2 및 제거. poll()
        System.out.println(queue.poll());
        System.out.println(queue);
        // 요소의 제거. remove()
        queue.remove("하나");
        System.out.println(queue);
    }
}
