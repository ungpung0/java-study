package java05;

import java.util.Arrays;

public class JavaHowToUseArray {

    public static void main(String[] args) {

        /*
            배열의 복사
            배열은 한 번 생성하면 길이를 변경할 수 없는데, 길이를 변경하기 위해서는
            새로운 배열을 생성하여 복사하여야 한다. 여기에는 다음과 같은 방법들이 있다.
            1) System 클래스의 arraycopy() 메소드. (좋은 성능)
            2) Arrays 클래스의 copyOf() 메소드. (유연성)
            3) Object 클래스의 clone() 메소드.
            4) for문과 인덱스를 이용한 복사.
        */
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int newLength = 10;

        // 1. System 클래스, arraycopy() 메소드.
        int[] arrCopy = new int[newLength];
        System.arraycopy(arr, 0, arrCopy, 0, arr.length);

        // 2. Arrays 클래스, copyOf() 메소드.
        int[] arrCopyOf = Arrays.copyOf(arr, 10);

        // 3. Object 클래스, clone() 메소드.
        int[] arrClone = (int[])arr.clone();

        // 4. for 문과 인덱스를 이용한 복사.
        int[] arrFor = new int[newLength];
        for(int i = 0; i < arr.length; i++) {
            arrFor[i] = arr[i];
        }

        /*
            ※ JavaIterationStatements에서 이어서...
            Enhanced for 문
            JDK 1.5부터 배열과 컬렉션의 모든 요소들을 참조하기 위한 반복문이 추가되었다.
            ex) for(타입 변수명: 배열명) {명령문;}
        */
        for(int e : arr) {
            System.out.print(e + " ");
        }

        // 참조할 때는 편한 방법이지만, 변경할 때는 사용할 수 없다.
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        for(int e : arr1) {
            e += 10;
        }
        // Enhanced for 문 내부의 배열 요소 e는 복사본일 뿐이므로, 원본에는 영향을 주지 않는다.

    }
}
