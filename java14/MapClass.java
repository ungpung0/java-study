package java14;

/*
    Map 컬렉션 클래스
    Map 인터페이스는 Collection 인터페이스와 다른 저장방식을 가진다.
    키와 데이터를 하나의 쌍으로 저장하는 key-value 방식을 사용한다.
    요소의 저장 순서를 유지하지 않고, 키는 중복하지 않지만 값은 허용한다.
    대표적인 Map 클래스로는 HashMap<K,V>, Hashtable<K,V>, TreeMap<K,V>가 있다.

    HashMap<K,V> 클래스
    HashMap은 Map 클래스 중 가장 많이 사용되는 클래스로 해시 알고리즘이 적용되었다.

    Hashtable<K,V> 클래스
    Hashtable 클래스는 HashMap 클래스와 동일 동작을 수행하는 클래스이다.
    따라서 Hashtable 클래스는 HashMap 클래스와 마찬가지로 Map 인터페이스를 상속받는다.
    Hashtable은 HashMap의 하위 호환 격으로 HashMap 클래스를 사용하는 게 좋다.

    TreeMap<K,V> 클래스
    TreeMap 클래스는 TreeSet과 마찬가지로 맵의 형태가 적용된 이진 검색 트리이다.
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class MapClass {

    public static void main(String[] args) {

        // HashMap의 선언.
        System.out.println(" == HashMap의 예제 == ");
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        // 요소의 저장. put()
        hashMap.put("삼십", 30);
        hashMap.put("일십", 10);
        hashMap.put("사십", 40);
        hashMap.put("이십", 20);
        // 요소의 출력. Enhanced for문과 get()
        System.out.println("맵의 키 집합: " + hashMap.keySet());
        for(String key : hashMap.keySet())
            System.out.print(String.format("(%s, %s) ", key, hashMap.get(key)));
        System.out.println("");
        // 요소의 제거. remove()
        hashMap.remove("사십");
        // 요소의 출력. iterator()
        Iterator<String> keys = hashMap.keySet().iterator();
        while(keys.hasNext()) {
            String key = keys.next();
            System.out.print(String.format("(%s, %s) ", key, hashMap.get(key)));
        }
        System.out.println("");
        // 요소의 변경. replace()
        hashMap.replace("이십", 200);
        for(String key : hashMap.keySet())
            System.out.print(String.format("(%s, %s) ", key, hashMap.get(key)));
        System.out.println("");
        // 요소의 개수. size()
        System.out.println("HashMap의 크기: " + hashMap.size());


        // TreeMap()의 선언.
        System.out.println(" == TreeMap의 예제 == ");
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        // 요소의 저장. put()
        treeMap.put(30, "삼십");
        treeMap.put(10, "일십");
        treeMap.put(40, "사십");
        treeMap.put(20, "이십");
        // 요소의 출력. Enhanced for문, get()
        System.out.println("맵의 키 집합: " + treeMap.keySet());
        for(int e : treeMap.keySet())
            System.out.print(String.format("(%s, %s) ", e, treeMap.get(e)));
        System.out.println("");
        // 요소의 제거. remove()
        treeMap.remove(40);
        // 요소의 출력. iterator(), get()
        Iterator<Integer> keys1 = treeMap.keySet().iterator();
        while(keys1.hasNext()) {
            Integer key = keys1.next();
            System.out.print(String.format("(%s, %s) ", key, treeMap.get(key)));
        }
        System.out.println("");
        // 요소의 변경. replace()
        treeMap.replace(20, "Twenty");
        for(Integer e : treeMap.keySet()) {
            System.out.print(String.format("(%s, %s) ", e, treeMap.get(e)));
        }
        System.out.println("");
        // 요소의 개수. size()
        System.out.println("TreeMap의 크기: " + treeMap.size());
    }

}
