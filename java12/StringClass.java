package java12;

/*
    java.lang.String 클래스
    C언어의 char형 배열과 달리 Java에서는 String 클래스를 별도로 제공한다.
    이러한 String 클래스는 java.lang 패키지에 포함되어 제공된다.
    String 인스턴스는 한 번 생성되면 값을 변경할 수 없고, 이를 불변 객체(Immutable Object)라고 한다.
    즉, 자바에서 덧셈 연산자를 이용하여 문자열을 결합하면 새로운 String 인스턴스가 생성되는 것이다.

    charAt() 메소드
    charAt() 메소드는 해당 문자열의 특정 인덱스에 해당하는 문자를 반환한다.
    해당 문자열보다 큰 인덱스, 음수를 전달하면 IndexOutOfBoundsException 오류가 발생한다.

    compareTo() 메소드
    compareTo() 메소드는 해당 문자열을 인수로 전달된 문자열을 대소문자를 구분하여 비교한다.
    문자열이 일치하면 0을, 인수보다 크면 양수값을 작으면 음수값을 반환한다.
    대소문자를 구분하지 않기를 원한다면 compareToIgnoreCase() 메소드를 사용한다.

    concat() 메소드
    concat() 메소드는 해당 문자열의 뒤에 인수로 전달된 문자열을 추가한 새로운 문자열을 반환한다.
    반환 후의 원본 String은 변경되지 않는다.

    indexOf() 메소드
    indexOf() 메소드는 문자열에서 특정 문자나 문자열이 처음으로 등장하는 인덱스의 위치를 반환한다.
    해당 문자열에 문자나 문자열이 포함되어 있지 않을 경우 -1을 반환한다.

    trim() 메소드
    해당 문자열의 맨 앞과 맨 뒤에 포함된 모든 공백 문자들을 제거한다.

    toLowerCase() / toUpperCase() 메소드
    toLowerCase()는 모든 문자들을 소문자로, toUpperCase()는 모든 문자들을 대문자로 변환한다.

*/
public class StringClass {

    public static void main(String[] args) {

        // charAt() 메소드 예제.
        String str = new String("Java");
        System.out.println("원본 문자열: " + str);
        for(int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println("\ncharAt() 메소드 호출 후의 문자열: " + str);

        // compareTo() 메소드 예제.
        String str1 = new String("abcd");
        System.out.println("원본 문자열: " + str1);
        System.out.println(str.compareTo("bcef"));
        System.out.println(str.compareTo("abcd") + "\n");
        System.out.println(str.compareTo("Abcd"));
        System.out.println(str.compareToIgnoreCase("Abcd"));
        System.out.println("compareTo() 메소드 호출 후의 문자열: " + str);

        // concat() 메소드 예제.
        System.out.println("원본 문자열: " + str);
        System.out.println(str.concat("수업"));
        System.out.println("concat() 메소드 호출 후의 문자열: " + str);

        // indexOf() 메소드 예제.
        System.out.println("원본문자열: " + str);
        System.out.println(str.indexOf("s"));
        System.out.println(str.indexOf("J"));
        System.out.println(str.indexOf("V"));
        System.out.println("indexOf() 메소드 호출 후의 문자열: " + str);

        // trim() 메소드 예제.
        String str2 = new String("   Java      ");
        System.out.println("원본문자열: " + str2);
        System.out.println(str2 + "\\");
        System.out.println(str2.trim() + '\\');
        System.out.println("trim() 메소드 호출 후의 문자열: " + str2);

        // toLowerCase() / toUpperCase() 메소드 예제.
        System.out.println("원본 문자열: " + str);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println("두 메소드 호출 후의 문자열: " + str);
    }
}
