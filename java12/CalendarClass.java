package java12;

/*
    자바에서 날짜 처리 방법
    JDK 1.0에서는 Date 클래스를 사용한 간단한 날짜 처리만을 수행할 수 있었다.
    JDK 1.1부터는 새롭게 제공되는 Calendar 클래스로 날짜와 시간 처리를 수행한다.
    그러나 Calendar 클래스는 다음과 같은 문제점들을 갖고 있다.
        - Calendar 인스턴스는 불변 객체가 아니기 때문에 값이 수정될 수 있다.
        - 윤초(leap second)와 같은 특별 상황을 고려하지 않는다.
        - 월을 표현할 때 1월 ~ 12월을 0 ~ 11로 표현해야하는 불편함이 있다.
    따라서 Java SE 8 부터는 Joda-Time 라이브러리를 발전시킨 java.time 패키지를 사용한다.

    java.util.Calendar 클래스
    Calendar 클래스는 Java에서 날짜 및 시간의 데이터를 손쉽게 처리할 수 있도록 제공하는 추상 클래스이다.
    왜 추상 클래스로 선언됬는가? 국가마다 사용하는 달력 체계가 다르기 때문이다.
    Calendar 클래스의 모든 필드는 클래스 변수(Static Variable)이므로, 객체를 생성하지 않고 바로 사용할 수 있다.

    java.util.GregorianCalendar 클래스
    1582년 교황 그레고리오 13세가 개혁한 그레고리오 달력을 완전히 구현한 하위 클래스이다.

    add() 메소드
    Calendar 필드에서 일정 시간 만큼을 더하거나 빼준다. 즉, 특정 시간을 기준으로 전후의 날짜 및 시간을 확인할 수 있다.

    before() / after 메소드
    두 시간상의 전후 관계만을 알고 싶을 경우 before(), after() 메소드를 사용할 수 있다.

    get() 메소드
    전달된 Calendar 필드에 저장된 값을 반환한다.

    roll() 메소드
    전달된 Calendar 필드에서 일정 시간 만큼을 더하거나 빼준다.
    add()와 달리 다른 Calendar 필드에는 영향을 주지 않는다.

    set() 메소드
    전달된 Calendar 필드를 특정 값으로 설정한다.
*/

import java.util.Calendar;

public class CalendarClass {

    public static void main(String[] args) {

        // add() 메소드
        Calendar time = Calendar.getInstance(); // getInstance(): 최초로 할당된 하나의 메모리를 계속 사용하는 방식.
        System.out.println(time.getTime());
        time.add(Calendar.SECOND, 120); // 120초를 더한 예.
        System.out.println(time.getTime());

        // before() / after() 메소드
        Calendar time1 = Calendar.getInstance();
        Calendar time2 = Calendar.getInstance();
        Calendar time3 = Calendar.getInstance();
        time2.set(1982, 2, 19); // 1982.02.19로 설정한다.
        time3.set(2020, 2, 19); // 2020.02.19로 설정한다.
        System.out.println(time1.before(time2)); // 시간 전후 관계 파악.
        System.out.println(time1.after(time2));

        // get() 메소드
        System.out.println(time.getTime());
        System.out.println(time.get(Calendar.DAY_OF_WEEK));
        System.out.println(time.get(Calendar.MONTH) + 1);
        System.out.println(time.get(Calendar.DAY_OF_MONTH));
        System.out.println(time.get(Calendar.HOUR_OF_DAY));
        System.out.println(time.get(Calendar.MINUTE));
        System.out.println(time.get(Calendar.SECOND));
        System.out.println(time.get(Calendar.YEAR));

        // roll() 메소드
        System.out.println(time1.getTime());
        time1.add(Calendar.SECOND, 60);
        System.out.println(time1.getTime()); // MINUTE + 1.
        time1.roll(Calendar.SECOND, 120);
        System.out.println(time1.getTime()); // MINUTE이 증가하지 않는다.

        // set() 메소드
        System.out.println(time.getTime());
        time.set(Calendar.YEAR, 2020);
        System.out.println(time.getTime());
        time.set(1982, 1, 19); // 1은 2월을 의미한다.
        System.out.println(time.getTime());
        time.set(1982, 1, 19, 12, 34, 56);
        System.out.println(time.getTime());
    }
}
