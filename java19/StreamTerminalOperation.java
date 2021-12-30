package java19;

/*
    스트림 최종 연산(Terminal Operation)
    스트림 API의 중개 연산을 통해 변환된 스트림은 마지막 최종 연산으로 요소들을 소모하여 결과를 반환한다.
    즉, 지연(lazy)되었던 모든 중개 연산들이 최종 연산 시에 모두 수행되는 것이다.
    이후, 해당 스트림은 더는 사용할 수 없게 된다.

    최종 연산 메소드
    - 요소의 출력, forEach():
        forEach()는 스트림의 각 요소들을 소모하여 명시된 동작을 수행한다. 보통 출력 용도로 사용된다.
    - 요소의 소모, reduce():
        reduce()는 첫 째, 둘 째 요소를 가지고 연산을 수행후에, 결과와 셋 째 요소를 가지고 다시 연산을 수행한다.
        이런식으로 모든 요소를 소모하여 연산을 수행하고, 결과를 반환하게 된다.
    - 요소의 검색, findFirst(), findAny():
        findFirst(), findAny() 모두 해당 스트림의 첫 번째 요소를 참조하는 Optional 객체를 반환한다.
        비어있을 경우 비어있는 Optional 객체를 반환한다.
    - 요소의 검사, anyMatch(), allMatch(), noneMatch():
        해당 스트림 요소 중에 특정 조건을 만족하는 요소가 있는지, 아닌지를 검사할 수 있다.
        anyMatch()는 해당 스트림의 일부 요소가 조건을 만족할 경우 true를 반환한다.
        allMatch()는 해당 스트림의 모든 요소가 조건을 만족할 경우 true를 반환한다.
        noneMatch()는 해당 스트림의 모든 요소가 조건을 만족하지 않을 경우 true를 반환한다.
    - 요소의 통계, count(), min(), max():
        count()는 해당 스트림의 총 개수를 long 타입의 값으로 반환한다.
        max(), min()은 요소들 중 가장 큰 값과 작은 값을 Optional 객체로 반환한다.
    - 요소의 연산, sum(), average():
        IntStream, DoubleStream 같은 기본 타입 스트림에는 합과 평균을 구할 수 있는
        sum(), average()가 정의되어 있다.
        이때 average()는 각 기본 타입으로 래핑된 Optional 객체를 반환한다.
    - 요소의 수집, collect():
        collect()는 인수로 전달되는 Collectors 객체에 구현된 방법대로 스트림 요소를 수집한다.
        Collectors 클래스에는 미리 정의된 다양한 방법이 클래스 메소드로 정의되어 있다.
        또한, 사용자가 직접 Collector 인터페이스로 수집 방법을 정의할 수도 있다.
        - 스트림 배열, 컬렉션으로 변환: toArray(), toCollection(), toList(), toSet(), toMap()
        - 통계와 연산 같은 동작을 수행: counting(), maxBy(), summinglnt(), averginglnt()
        - 요소의 소모 같은 동작을 수행: reducing(), joining()
        - 요소의 그룹화와 분할: grouping(), partitioningBy()

*/

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTerminalOperation {

    public static void main(String[] args) {

        // 요소의 출력의 예제.
        Stream<String> stream = Stream.of("넷", "둘", "셋", "하나");
        stream.forEach(System.out::println);

        // 요소의 소모의 예제.
        Stream<String> stream1 = Stream.of("넷", "둘", "셋", "하나");
        Stream<String> stream2 = Stream.of("넷", "둘", "셋", "하나");
        Optional<String> result1 = stream1.reduce((e1, e2) -> e1 + "++" + e2);
        // Optional을 사용한 이유는 reduce 연산을 할 경우 초기값을 그대로 반환해야하기 때문이다.
        result1.ifPresent(System.out::println);
        String result2 = stream2.reduce("시작", (e1, e2) -> e1 + "++" + e2);
        System.out.println(result2);
        // 초기값을 설정했으므로 Optional을 사용할 필요 없다.

        // 요소의 검색의 예제.
        IntStream stream3 = IntStream.of(4, 2, 7, 3, 5, 1, 6);
        IntStream stream4 = IntStream.of(4, 2, 7, 3, 5, 1, 6);
        OptionalInt result3 = stream3.sorted().findFirst();
        System.out.println(result3.getAsInt());
        OptionalInt result4 = stream4.sorted().findAny();
        System.out.println(result4.getAsInt());

        // 요소의 검사의 예제.
        IntStream stream5 = IntStream.of(30, 90, 70, 10);
        IntStream stream6 = IntStream.of(30, 90, 70, 10);
        System.out.println(stream5.anyMatch(n -> n > 80));
        System.out.println(stream6.allMatch(n -> n > 80));

        // 요소의 통계의 예제.
        IntStream stream7 = IntStream.of(30, 90, 70, 10);
        IntStream stream8 = IntStream.of(30, 90, 70, 10);
        System.out.println(stream7.count());
        System.out.println(stream8.max().getAsInt());

        // 요소의 연산의 예제.
        IntStream stream9 = IntStream.of(30, 90, 70, 10);
        IntStream stream10 = IntStream.of(30, 90, 70, 10);
        System.out.println(stream9.sum());
        System.out.println(stream10.average().getAsDouble());

        // 요소의 수집의 예제. (스트림 -> 리스트)
        Stream<String> stream11 = Stream.of("넷", "둘", "셋", "하나");
        List<String> list = stream11.collect(Collectors.toList());
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");;
        }

        // 요소의 수집의 예제. (요소별 글자수 홀/짝)
        Stream<String> stream12 = Stream.of("HTML", "CSS", "JAVA", "PHP");
        Map<Boolean, List<String>> partition = stream12.collect(Collectors.partitioningBy(e -> (e.length() % 2) == 0));
        List<String> oddLengthList = partition.get(false);
        List<String> evenLengthList = partition.get(true);
        System.out.println(oddLengthList);
        System.out.println(evenLengthList);

    }
}
