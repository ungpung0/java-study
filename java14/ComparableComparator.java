package java14;

/*
    Comparable<T> 인터페이스
    Comparable 인터페이스는 객체를 정렬하는데 사용하는 메소드 compareTo()를 정의하고 있다.
    Java에서는 같은 타입의 인스턴스를 비교하는 클래스들을 Comparable 인터페이스로 구현하고 있다.
    즉, Boolean을 제외한 래퍼 클래스, String, Time, Date와 같은 클래스 인스턴스는 정렬이 가능하다.
    기본값은 오름차순 이다.

    Comparator<T> 인터페이스
    Comparator 인터페이스는 Comparable 인터페이스와 같이 객체를 정렬할 때 사용되는 인터페이스이다.
    오름차순으로 정렬되는 Comparable 인터페이스와 달리 Comparator 인터페이스는 내림차순이나 다른
    기준으로 정렬할 수 있다.
*/

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

// 클래스의 Comparable 인터페이스 구현 예제1.
class CarComparable implements Comparable<CarComparable> {
    private String modelName;
    private int modelYear;
    private String modelColor;

    CarComparable(String modelName, int modelYear, String modelColor) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.modelColor = modelColor;
    }

    public String getModel() {
        return this.modelYear + "식 " + this.modelName + " " + this.modelColor;
    }

    public int compareTo(CarComparable object) {
        if(this.modelYear == object.modelYear)
            return 0;
        else if(this.modelYear < object.modelYear)
            return -1;
        else
            return 1;
    }
}

// Comparator 인터페이스로 내림차순 정렬.
class DescendingOrder implements Comparator<Integer> {

    public int compare(Integer o1, Integer o2) {
        if(o1 instanceof Comparable && o2 instanceof Comparable) {
            Integer c1 = (Integer)o1;
            Integer c2 = (Integer)o2;
            return c2.compareTo(c1);
        }
        return -1;
    }
}

public class ComparableComparator {

    public static void main(String[] args) {

        // 클래스의 Comparable 인터페이스 구현 예제2.
        CarComparable car1 = new CarComparable("아반떼", 2016, "황색");
        CarComparable car2 = new CarComparable("소나타", 2010, "흰색");
        System.out.println(car1.compareTo(car2)); // 두 인스턴스를 비교.

        // 내림차순 테스트.
        TreeSet<Integer> treeSet = new TreeSet<Integer>(new DescendingOrder());
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(20);
        treeSet.add(10);
        Iterator<Integer> iterator = treeSet.iterator();
        while(iterator.hasNext())
            System.out.print(iterator.next() + " ");
    }
}
