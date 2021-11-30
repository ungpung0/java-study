package java01;

/*
    2014년 기준 최신 버전의 JAVA SE 8에는 많은 사항들이 변경되고 추가되었다.
    변경 사항 중의 주목할 만한 특징은 다음과 같다.
    1) 람다 표현식(Lambda Expression).
    2) 스트림 API(Stream API).
    3) java.time 패키지(java.time API)
    4) 나즈혼(Nashorn).
*/

import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Stream;

public class Java8Changes {

    public static void main(String[] args) {

        // 전통적인 방식.
        new Thread(new Runnable() {
            public void run() {
                System.out.println("Disposable Thread by Traditional Method.");
            }
        }).start();

        /*
            람다 표현식(Lambda Expression) = 익명 함수(Anonymous Function)
            메소드를 하나의 식으로 표현하여, 식별자 없이 실행할 수 있는 함수 표현식.
        */
        new Thread(()->{
            System.out.println("Disposable Thread by Lambda Method.");
        }).start();


        /*
            스트림 API(Stream API)
            데이터를 처리하기 위하여 배열이나 컬렉션에 매번 반복문 | 반복자(iterator)를
            사용하여 작성해왔었다. 코드의 길이, 가독성, 재사용 등의 문제점을 해결하기 위해
            데이터를 추상화하여 데이터를 읽고 쓰기 위한 공통된 방법을 제공한다.
        */
        // 기존 배열 생성.
        String[] arr = new String[]{"넷", "둘", "셋", "하나"};
        // 배열에서 스트림 생성.
        Stream<String> stream1 = Arrays.stream(arr);
        stream1.forEach(e -> System.out.println(e + " "));
        System.out.println();
        // 배열 특정 부분에서 스트림 생성.
        Stream<String> stream2 = Arrays.stream(arr, 1, 3); // 범위 파라미터 추가.
        stream2.forEach(e -> System.out.println(e + " "));

        /*
            기존 JDK 1.0에서는 날짜 처리를 Date 클래스를 사용하였다. 그러나 현재에는
            사용을 권장하지 않고 Deprecated(중요도가 떨어져서 앞으로 사라지게 될)되었다.

            JDK 1.1부터 추가된 Calendar 클래스는 날짜 및 시간에 관련한 정보를 얻을 수
            있지만, 다음과 같은 문제들을 갖고 있다.
            - Calendar 인스턴스는 불변 객체(Immutable Object)가 아니라서 수정될 수 있다.
            - 윤초(leap second)와 같은 특별한 상황을 고려하지 않다.
            - Calendar 클래스는 월을 나타낼 때 1월~12월을 0~11로 표현해야만 한다.

            Java SE 8부터는 Joda-Time 라이브러리를 발전시킨 java.time 패키지를 제공한다.
        */
        LocalDate today = LocalDate.now(); // 현재 시간.
        System.out.println("올해는 " + today.getYear() + "년 입니다.");
        LocalDate otherDay = today.withYear(1982);
        System.out.println("올해는 " + otherDay.getYear() + "년 입니다.");


        /*
            나즈혼(Nashorn)
            기존에는 모질라의 리노(Rhino)엔진이 사용되었으나, 최신 개선 사항을 제대로 활용
            하지 못하는 노후화된 모습을 보여주게 된다.
            따라서 Java SE 8 부터는 오라클의 나즈혼(Nashorn)을 도입하게 되었다.
        */
    }

}
