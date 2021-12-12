package java04;

/*
    일반적으로 조건식의 검사를 통하여 루프로 진입하면, 조건식의 검사가 끝이 날 때까지
    루프 안의 모든 명령문을 실행한다. continue와 break문을 사용하여 사용자가 직접 제어
    할 수 있다.
*/

public class JavaEtceteraStatements {
    public static void main(String[] args) {

        /*
            continue문: 루프의 나머지 부분을 건너뛰고, 다음 조건식의 판단으로 넘어간다.
            주로, 특정 조건에서 예외 처리를 할 때 자주 사용한다.
        */
        for(int i = 1; i < 100; i++) {
            if(i % 5 == 0 || i % 7 == 0) {
                System.out.println("5 또는 7의 배수: " + i);
            }else {
                continue;
            }
        }

        /*
            break문: 루프의 해당 반복문을 종료하고, 다음 위치의 명령문을 실행한다.
            즉, 조건식의 판단과 관계없이 반복문을 빠져나갈 때 사용한다.
        */
        int num = 1, sum = 0;

        while(true) {
            sum += num;
            if(num == 100)
                break;
            num++;
        }
        System.out.println(sum);

        /*
            break with label문: break문을 사용하여 특정 반복문까지 빠져나가고 싶을 때
            사용한다. 반복문에 이름(label)을 부여하여 break문에 해당 이름을 명시하면 된다.
            ※ C, C++언어의 goto문과 비슷하다.
        */
        Looping:
        for(int i = 2; i < 10; i++) {
            for(int j = 2; j < 10; j++) {
                if(i == 5) {
                    break Looping;
                }
                System.out.println(i + " 곱하기 " + j + " 는 " + (i * j));
            }
        }

    }
}
