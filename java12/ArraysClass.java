package java12;

/*
    java.util 패키지
    java 프로그램을 개발하는 데 사용할 수 있는 유용한 유틸리티 클래스가 다수 포함되어 있다.
    java.lang 패키지와 달리 import 문을 사용해야만 한다.

    java.util.Arrays 클래스
    Arrays 클래스의 모든 메소드는 클래스 메소드(Static Method)이므로, 객체를 생성하지 않고 바로 사용할 수 있다.

    binarySearch() 메소드
    전달받은 배열에서 특정 객체의 위치를 이진 검색 알고리즘을 사용하여 검색한 후 위치를 반환한다.
    이진 검색 알고리즘을 사용하므로, sort() 메소드 등으로 정렬되어 있어야만 제대로 동작한다.
    ※ 이진 검색 알고리즘은 오름차순으로 정렬된 리스트에서 특정한 값의 위치를 검색하는 알고리즘으로
      중간값을 임의로 선택하여 값과 찾고자 하는 값의 대소를 비교하는 방식이다.

    copyOf() 메소드
    전달받은 배열의 특정 길이만큼을 새로운 배열로 복사하여 반환한다.
    첫 번째 매개변수로 원본 배열을 전달받고, 두 번째 매개변수로 복사할 요소의 개수를 전달받는다.
    그리고 원본 배열과 같은 타입의 복사된 새로운 배열을 반환한다.

    copyOfRange() 메소드
    copyOfRange() 메소드는 전달받은 배열의 특정 범위에 해당하는 요소만을 새로운 배열로 복사한다.
    첫 번째 매개변수로 원본 배열을, 두 번째 매개변수로 시작 인덱스, 세 번째 매개변수로 끝 인덱스를 전달받는다.
    이렇게 시작 인덱스에서 끝 인덱스까지의 배열 요소만을 복사한다.

    fill() 메소드
    fill() 메소드는 전달받은 배열의 모든 요소를 특정 값으로 초기화한다.
    첫 번째 매개변수로 초기화할 배열을 전달받고, 두 번째 매개변수로 초기값을 전달한다.

    sort() 메소드
    전달받은 배열의 모든 요소들을 오름차순으로 정렬한다.
    이 때 정렬된 배열은 원본 배열에 적용되어 변경된다.
*/

import java.util.Arrays;

public class ArraysClass {

    public static void main(String[] args) {

        // binarySearch() 메소드의 예제.
        int[] arr = new int[1000];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.binarySearch(arr, 437));

        // copyOf() 메소드의 예제.
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = Arrays.copyOf(arr1, 3);
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println("");
        int[] arr3 = Arrays.copyOf(arr1, 10); // 길이를 초과하였을 경우 0을 추가한다.
        for(int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println("");

        // copyOfRange() 메소드의 예제.
        int[] arrRange = Arrays.copyOfRange(arr1, 2, 4);
        for(int i = 0; i < arrRange.length; i++) {
            System.out.print(arrRange[i] + " ");
        }
        System.out.println("");

        // fill() 메소드의 예제.
        int[] arrFill = new int[10];
        Arrays.fill(arrFill, 10);
        for(int i = 0; i < arrFill.length; i++) {
            System.out.print(arrFill[i] + " ");
        }
        System.out.println("");

        // sort() 메소드의 예제.
        int[] arrSort = {5, 3, 2, 1, 4};
        Arrays.sort(arrSort);
        for(int i = 0; i < arrSort.length; i++) {
            System.out.print(arrSort[i] + " ");
        }
        System.out.println("");
    }
}
