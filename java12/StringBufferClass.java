package java12;

/*
    java.lang.StringBuffer 클래스
    일반적으로 String 클래스 인스턴스는 한 번 생성되면 값을 변경할 수 없다.
    StringBuffer 클래스 인스턴스는 값을 변경할 수 있고, 추가할 수도 있다.
    이를 위하여 버퍼(Buffer)라는 기본값으로 16개의 문자를 저장할 수 있는 독립적인 공간을 가진다.
    이는 생성자를 이용하여 크길를 변경할 수 있다.

    String과의 차이점.
    String 인스턴스를 (+)를 이용하여 문자열을 결합하면 공간의 낭비 뿐만 아니라 속도가 느려지게 된다.
    StringBuffer 인스턴스를 사용하면 문자열을 바로 추가할 수 있으므로, 공간의 낭비를 없애고 속도도 증가시킬 수 있다.

    불변 클래스(Immutable Class)와 가변 클래스(Mutable Class)
    String 클래스와 같이 인스턴스가 한 번 생성되면 값을 변경할 수 없는 클래스를 불변 클래스,
    StringBuffer 클래스와 같이 인스턴스 값을 자유자재로 변경할 수 있는 클래스를 가변 클래스라 한다.

    불변 클래스를 사용하는 이유
    멀티 스레드 환경에서 객체가 변화할 때 불변 클래스를 사용하는 것이 신뢰도 높은 코드를 작성할 수 있기 때문이다.
    즉, 하나의 객체에 접근하면서 각각의 객체가 서로 영향을 주어서는 안될 경우 불변 인스턴스를 사용한다.

    append() 메소드
    인수로 전달된 값을 문자열로 변환한 후, 해당 문자열의 마지막에 추가한다.
    String의 concat()와 같은 결과이지만, 내부적인 처리 속도가 빠르다.

    capacity() 메소드
    StringBuffer 인스턴스의 현재 버퍼 크기를 반환한다.

    delete() 메소드
    전달된 인덱스에 해당하는 부분 문자열을 해당 문자열에서 제거한다.
    deleteCharAt() 메소드를 사용하면 특정 위치의 문자 한 개만을 제거할 수 있다.

    insert() 메소드
    전달된 값을 문자열로 변환한 후, 해당 문자열의 지정된 인덱스의 위치에 추가한다.
    전달된 인덱스가 해당 문자열의 길이와 같으면, append() 메소드와 같은 결과를 반환한다.

    reverse()
    해당 문자열의 인덱스를 역순으로 배치한다.
*/

public class StringBufferClass {

    public static void main(String[] args) {

        // append()의 예제.
        StringBuffer str = new StringBuffer("Java");
        System.out.println("원본 문자열: " + str);
        System.out.println(str.append("수업"));
        System.out.println("append() 메소드 호출 후의 문자열: " + str);

        // capacity()의 예제.
        StringBuffer str1 = new StringBuffer();
        StringBuffer str2 = new StringBuffer("Java");
        System.out.println(str1.capacity());
        System.out.println(str2.capacity());

        // delete()의 예제.
        StringBuffer str3 = new StringBuffer("Java Oracle");
        System.out.println("원본 문자열: " + str3);
        System.out.println(str3.delete(4, 8));
        System.out.println(str.deleteCharAt(1));
        System.out.println("deleteCharAt() 메소드 호출 후의 원본 문자열: " + str3);

        // insert()의 예제.
        StringBuffer str4 = new StringBuffer("Java 만세!");
        System.out.println("원본 문자열: " + str4);
        System.out.println(str4.insert(4, "Script"));
        System.out.println("insert() 메소드 호출 후의 원본 문자열: " + str4);

        // reverse()의 예제.
        System.out.println(str4.reverse());
    }

}
