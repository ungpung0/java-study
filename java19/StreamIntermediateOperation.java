package java19;

/*
    스트림의 중개 연산(Intermediate Operation)
    스트림 API에 의해 생성된 초기 스트림은 중개 연산을 통해서 다른 스트림으로 변환된다.
    스트림을 전달받아 또 다른 스트림을 반환하므로, 연속으로 연결해서 사용할 수 있다.
    필터-맵(filter-map) 기반의 API를 사용함으로 지연(lazy) 연산을 통해 최적화한다.

    중개 연산 메소드
    - 스트림 필터링, filter(), distinct():
        filter()는 해당 스트림의 조건에 맞는 요소만으로 구성된 새로운 스트림을 반환한다.
        distinct()는 중복된 요소가 제거된 새로운 스트림을 반환한다. 또한 내부적으로
        equals()로 요소의 중복을 비교한다.
    - 스트림 변환, map(), flatmap():
        map() 메소드는 해당 요소들을 주어진 함수에 전달하여 반환값들로 이루어진 새로운 스트림을,
        flatMap() 메소드는 해당 배열 스트림의 각 요소의 반환값을 하나로 합친 새로운 스트림을 반환한다.
    - 스트림 제한, limit(), skip():
        limit()은 해당 스트림의 첫 번째 요소부터 전달된 개수만큼의 요소로 이루어진 새로운 스트림을 반환한다.
        skip()은 해당 스트림의 첫 번째 요소부터 전달된 개수만큼의 요소를 제외한 새로운 스트림을 반환한다.
    - 스트림 정렬, sorted():
        sorted()는 해당 스트림을 주어진 비교자(comparator)를 이용하여 정렬한다.
        비교자를 전달하지 않으면 기본적인 사전 편찬 순(natural order)으로 정렬한다.
    - 스트림 결과 확인, peek():
        peek()은 결과 스트림으로부터 요소를 소모하여 추가로 명시된 동작을 수행한다.
        원본 스트림에서 요소를 소모하지 않으므로, 연산 사이의 결과를 확인할 때 사용한다.

*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamIntermediateOperation {

    public static void main(String[] args) {

        IntStream stream1 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
        IntStream stream2 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);

        // 스트림 필터링 예제.
        stream1.distinct().forEach(e -> System.out.print(e + " "));
        System.out.println("");
        // 스트림 홀수 제거 예제.
        stream2.filter(n -> n % 2 != 0).forEach(e -> System.out.print(e + " "));
        System.out.println("");

        // 스트림 변환의 예제. (map)
        Stream<String> stream = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
        stream.map(e -> e.length()).forEach(System.out::println); // 문자의 길이를 반환.
        // 스트림 변환의 예제. (flatmap)
        String[] array = {"i studying hard", "you studied java", "i am hungry"};
        Stream<String> stream3 = Arrays.stream(array);
        stream3.flatMap(e -> Stream.of(e.split(" +"))).forEach(System.out::println);

        // 스트림 제한 예제.
        IntStream stream4 = IntStream.range(0, 10);
        IntStream stream5 = IntStream.range(0, 10);
        IntStream stream6 = IntStream.range(0, 10);
        stream4.skip(4).forEach(e -> System.out.print(e + " "));
        System.out.println("");
        stream5.limit(5).forEach(e -> System.out.print(e + " "));
        System.out.println("");
        stream6.skip(3).limit(5).forEach(e -> System.out.print(e + " "));

        // 스트림 정렬 예제.
        Stream<String> stream7 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");
        Stream<String> stream8 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");
        stream7.sorted().forEach(e -> System.out.print(e + " "));
        System.out.println("");
        stream8.sorted(Comparator.reverseOrder()).forEach(e -> System.out.print(e + " "));

        // 스트림 결과 확인 예제.
        IntStream stream9 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
        stream9.peek(e -> System.out.println("원본 스트림: " + e))
                .skip(2)
                .peek(e -> System.out.println("skip(2) 실행 후: " + e))
                .limit(5)
                .peek(e -> System.out.println("limit(5) 실행 후: " + e))
                .sorted()
                .peek(e -> System.out.println("sorted() 실행 후: " + e))
                .forEach(e -> System.out.println(e));
    }

}
