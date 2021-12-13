package java07;

/*
    재귀 호출(Recursive Call)
    특정 메소드 내부에서 해당 메소드를 다시 호출하는 것을 의미한다.
    끊임없이 자신을 호출하므로, 끝없이 반복될 수도 있다.
    때문에, 중단될 조건을 반드시 포함해야만 한다.
*/

public class RecursiveCall {

    // 재귀 호출의 예제.
    int Sum(int num) {
        if( num == 1) {
            return 1;
        }
        return num + Sum(num - 1);
    }

}
