package java05;

/*
    다차원 배열(Multi Dimensional Array)
    2차원 이상의 배열을 의미하며, 요소로 다른 배열을 가지는 배열을 의미한다.
    즉, 2차원 배열은 1차원 배열을 가지는 배열이다.
*/

public class JavaMultiDimensionalArray {
    public static void main(String[] args) {

        /*
            2차원 배열(2 Dimensional Array)
            2차원 배열은 배열의 요소로 1차원 배열을 갖는 배열으로서, 다음과 같이 선언한다.
            ex) 타입[][] 배열명; | 타입 배열명[][]; | 타입[] 배열명[];
        */
        int[][] arr = new int[2][3];

        int k = 10;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = k;
                k += 10;
            }
        }
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

        /*
            1차원 배열과 마찬가지로 2차원 배열도 선언과 동시에 초기화할 수 있다.
            ex)
            타입 배열명[열길이][행길이] = {
                {배열요소[0][0], 베열요소[0][1], ...},
                {배열요소[1][0], 배열요소[1][1], ...},
                {배열요소[2][0], 배열요소[2][1], ...}
            };
        */
        int[][] arr1 = {
                {10, 20, 30},
                {40, 50, 60}
        };

        /*
            가변 배열(Dynamic Array)
            Java에서 2차원 배열을 생성할 때, 열의 길이를 명시하지 않음으로써, 행마다 다른
            길이의 배열을 요소로 저장할 수 있다. 이를 가변 배열이라고 한다.
            ex)
            int[][] arr = new int[3][];
            arr[0] = new int[2];
            arr[1] = new int[4];
            arr[2] = new int[1];
        */
        int[][] arr2 = {
                {10, 20},
                {30, 40, 50},
                {60}
        };
    }

}
