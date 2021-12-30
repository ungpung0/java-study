package java19;

/*
    스트림의 생성
    스트림 API는 다음과 같은 데이터 소스에서 생성할 수 있다.
    - 컬렉션:
        Java의 Collection 인터페이스에 stream() 메소드를 사용하여 생성할 수 있다.
        또한, parallelStream() 메소드로 병렬 처리가 가능한 스트림을 생성할 수 있다.
    - 배열:
        Arrays 클래스에는 다양한 형태의 stream() 메소드가 클래스 메소드로 정의되어 있다.
        또한 기본 타입인 int, long, double 형을 저장할 수 있는 배열에 관한 별도의 스트림도 있다.
        이는 IntStream, LongStream, DoubleStream 인터페이스로 제공된다.
    - 가변 매개변수:
        Stream 클래스의 of() 메소드를 사용하면 가변 매개변수를 전달받아 스트림을 생성할 수 있다.
    - 지정 범위의 연속 정수:
        지정된 범위의 연속 정수를 생성하기 위해 IntStream, LongStream 인터페이스에는
        시작 정수를 포함하고 마지막 정수를 포함하지 않는 range(),
        시작 정수와 마지막 정수까지도 포함하는 rangeClosed() 메소드가 정의되어 있다.
    - 특정 타입의 난수들:
        특정 난수의 스트림을 생성하기 위해 Random 클래스에는 ints(), longs(), doubles()와 같은 메소드가
        정의되어 있다. 매개변수로는 long 타입을 전달받을 수 있고, 매개변수를 전달하지 않으면 무한 스트림(Infinite Stream)을
        반환한다. 이때에는 반드시 limit() 메소드로 스트림의 크기를 제한해야만 한다.
    - 람다 표현식:
        람다 표현식을 매개변수로 전달받아 반환값을 요소로 하는 무한 스트림을 생성하기 위해 iterate()와 generate()메소드가
        정의되어 있다. iterate()는 시드(seed)로 명시된 값을 람다 표현식에 사용하여 반환값을 다시 시드로 사용하는 방식을,
        genearte()는 매개변수가 없는 람다 표현식을 사용하여 반환값으로 무한 스트림을 생성한다.
    - 파일:
        파일의 한 행(line)을 요소로 하는 스트림을 생성하기 위해 java.nio.file.Files 클래스에는 lines() 메소드가 정의되어 있다.
        또한, java.io.BufferedReader 클래스의 lines() 메소드를 사용하면 다른 입력으로부터의 데이터도 읽어올 수 있다.
    - 빈 스트림:
        빈 스트림은 Stream 클래스의 empty() 메소드로 생성할 수 있다.

*/

import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreation {

    public static void main(String[] args) {

        // 컬렉션의 ArrayList 스트림 생성 예제.
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(1);
        Stream<Integer> stream = list.stream(); // 스트림 생성.
        stream.forEach(System.out::println); // forEach()로 순차 접근.
        // forEach() 메소드는 요소를 하나씩 소모하며 순차적으로 요소에 접근하는 메소드.
        // 따라서, 한 번만 호출할 수 있으며, 원본 데이터는 변경되지 않기 때문에 다른 스트림을 생성하여 재사용 가능하다.

        // 배열의 스트림 생성 예제.
        String[] array = new String[]{"하나", "둘", "셋", "넷"};
        Stream<String> stream1 = Arrays.stream(array); // 스트림 생성.
        stream1.forEach(e -> System.out.print(e + " ")); // forEach()로 순차 접근.
        System.out.println("");
        Stream<String> stream2 = Arrays.stream(array, 1, 3); // 특정 부분 스트림 생성.
        stream2.forEach(e -> System.out.print(e + " "));

        // 가변 매개변수 생성 예제.
        Stream<Double> stream3 = Stream.of(4.2, 2.5, 3.1, 1.9);
        stream3.forEach(System.out::println);

        // 지정 범위 연속 정수 생성 예제.
        IntStream stream4 = IntStream.range(1, 4);
        stream4.forEach(e -> System.out.print(e + " "));
        System.out.println("");
        IntStream stream5 = IntStream.rangeClosed(1, 4);
        stream5.forEach(e -> System.out.print(e + " "));

        // 특정 타입 난수의 예제.
        IntStream stream6 = new Random().ints(4);
        stream6.forEach(System.out::println);

        // 람다 표현식의 예제.
        IntStream stream7 = IntStream.iterate(2, n -> n + 2);
        // stream7.forEach(System.out::println);

        // 파일의 예제.
        // String<String> stream8 = Files.lines(Path path);

        // 빈 스트림의 예제.
        Stream<Object> stream8 = Stream.empty();
        System.out.println(stream8.count()); // 0, 스트림의 개수는 0이다.

    }
}
