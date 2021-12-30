package java19;

/*
    java.util.Optional<T> 클래스
    Optional<T> 클래스는 Integer | Double 클래스처럼 'T' 타입의 객체를 포장하는 래퍼 클래스(Wrapper Class)이다.
    Optional 객체는 모든 타입의 참조 변수를 저장할 수 있고, NullPointerException 예외를 방지할 수 있다.

    Optional 객체의 생성
    of(), ofNullable()을 사용하여 Optional 객체를 생성할 수 있는데,
    of() 메소드는 null이 아닌 명시된 값을 가지는 Optional 객체를 반환한다. 때문에 NullPointerException 예외가 발생할 수 있다.
    따라서 참조 변수의 값이 만약 null이 될 가능성이 있다면, ofNullable() 메소드를 사용하여 생성하는 것이 좋다.

    Optional 객체에 접근
    get() 메소드를 사용하면 Optional 객체의 저장값에 접근할 수 있다.
    Optional 객체에 저장된 값이 null이면, NoSuchElementException 예외가 발생한다.
    따라서 get() 호출전에 isPresent() 메소드로 저장값이 null인지 아닌지 확인하는 게 좋다.
    또한 다음과 같은 메소드로 null을 대체할 값을 지정할 수도 있다.
    - orElse(): 저장값이 존재하면 값을 반환하고, 없으면 인수로 전달된 값을 전달한다.
    - orElseGet(): 저장값이 존재하면 값을 반환하고, 없으면 인수로 전달된 람다 표현식의 결과값을 반환한다.
    - orElseThrow(): 저장값이 존재하면 값을 반환하고, 없으면 인수로 전달된 예외를 발생시킨다.

    기본 타입의 Optional 클래스
    Java에서는 IntStream 클래스와 같이 기본 타입 스트림을 위한 별도의 Optional 클래스를 제공하고 있다.
    - OptionalInt 클래스: 반환타입이 Int형, getAsInt()로 접근할 수 있다.
    - OptionalLong 클래스: 반환타입이 Long형, getAsLong()로 접근할 수 있다.
    - OptionalDouble 클래스: 반환타입이 Double형, getAsDouble()로 접근할 수 있다.
*/

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class OptionalClass {

    public static void main(String[] args) {

        // Optional 객체의 생성 예제.
        Optional<String> optional = Optional.ofNullable("자바 Optional 객체");
        System.out.println(optional.get());
        Optional<String> optionalNull = Optional.empty();

        // Optional 객체에 접근 예제.
        if(optional.isPresent())
            System.out.println(optional.get());
        System.out.println(optionalNull.orElse("빈 Option 객체"));
        System.out.println(optionalNull.orElseGet(String::new));

        // 기본타입 Optional 클래스 예제.
        IntStream stream = IntStream.of(4,2,1,3);
        OptionalInt result = stream.findFirst();
        System.out.println(result.getAsInt());
    }
}
