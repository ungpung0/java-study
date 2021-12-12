package java04;

/*
    반복문(Iteration Statements)
    반복문은 프로그램에서 똑같은 명령을 일정 횟수만큼 반복하여 수행하는 명령문이다.
    대표적인 반복문으로 while문, do/while문, for문, Enhanced for문이 있다.
*/

public class JavaIterationStatements {
    public static void main(String[] args) {

        /*
            while문: 특정 조건을 만족할 때까지 계속해서 명령문을 반복한다.
            ex) while(조건식) {명령문;}
            ※ 조건식의 검사를 통해 반복하는 반복문을 루프(Loop)라고 한다.
        */
        int i = 0;
        while(i < 5) {
            System.out.println("while문 반복 " + (i + 1));
            i++; // 이 부분을 제거하면 무한 루프.
        }

        /*
            do/while문: 루프를 한 번 실행하고나서 조건식을 검사한다.
            ex) do{명령문;} while(조건식);
        */
        i = 0;
        do {
            System.out.println("do/while문 반복 " + (i + 1));
            i++;
        }while(i < 5);

        /*
            for문: 자체적으로 초기식, 조건식, 증감식을 포함한 반복문이다.
            ex) for(초기식; 조건식; 증감식) {명령문;}
        */
        for(i = 0; i < 5; i++)
            System.out.println("for문 반복 " + (i + 1));

        /*
            Enhanced for문: JDK 1.5부터 추가된 반복문이다. 자세한 것은
            배열 파트에서 활용할 것이다.
        */
    }
}
