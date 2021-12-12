package java05;

/*
    배열(Array)
    배열은 같은 타입의 변수들로 이루어진 유한 집합으로 정의할 수 있다.
    배열을 구성하는 값을 배열 요소(Element)라고 하며, 위치를 인덱스(Index)라고 한다.
    Java에서 인덱스는 언제나 0부터 시작하며, 양의 정수만 가질 수 있다.
*/

public class Java1DimensionalArray {
    public static void main(String[] args) {

        /*
            1차원 배열: 가장 기본적인 배열이다. 배열을 선언하고 new 키워드로 실제 배열로 생성한다.
            ex) 타입[] 배열명 | 타입 배열명[] = new 타입[배열길이];
            ※ 첫 번째 방법을 추천한다고 한다.
        */
        int[] grade1 = new int[3]; // 길이 3의 int형 배열 선언 및 생성.
        int[] grade2 = new int[3];

        grade1[0] = 85; // 인덱스를 이용한 배열 초기화.
        grade1[1] = 65;
        grade1[2] = 90;
        grade2[0] = 85; // 배열 길이보다 적은 수의 배열 요소만 초기화.

        for(int i = 0; i < grade1.length; i++) // length는 배열 길이를 저장하고 있는 필드.
            System.out.print(grade1[i] + " "); // 인덱스를 이용한 배열로의 접근.
        for(int i = 0; i < grade2.length; i++)
            System.out.print(grade2[i] + " "); // 85 0 0 : 0으로 초기화 되었다.
        System.out.println("");

        /*
            배열은 괄호{}를 이용하여 선언과 동시에 초기화 할 수 있다.
            여기서 괄호로 나열된 값들을 초기화 블록(Intialization Block)이라고 한다.
            ex) 타입[] 배열명 = {배열요소1, 배열요소2, ...};
                타입[] 배열명 = new 타입[]{배열요소1, 배열요소2, ...};
        */
        int[] grade3 = {70, 90, 80}; // 배열 선언과 동시 초기화.
        int[] grade4 = new int[]{70, 90, 80};
        int[] grade5;
        // grade5 = {70, 90, 80}; // 이 방법으로 선언된 배열을 초기화하면 오류가 발생한다.
        grade5 = new int[]{70, 90, 80}; // 대신 이 방법으로 수행한다.

        for(int i = 0; i < grade4.length; i++) // 길이가 3으로 설정되었다.
            System.out.print(grade4[i] + " ");
        System.out.println("");

        // 사용 예시. (평균, 합계 프로그램)
        int[] grade = new int[]{85, 65, 90};
        int result = 0;

        for(int i = 0; i < grade.length; i++) {
            result += grade[i];
        }
        System.out.println("점수의 평균: " + (result / grade.length));
        System.out.println("점수의 합계: " + result);
    }


}
