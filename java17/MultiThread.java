package java17;

/*
    멀티 스레드(Multi Thread)
    일반적으로 하나의 프로세스는 하나의 스레드를 가지고 작업을 수행하게 된다.
    여기서 멀티 스레드란 하나의 프로세스에서 둘 이상의 스레드가 동시에 작업을 수행하는 것이다.
    또한 멀티 프로세스(Multi Process)는 여러 개의 CPU를 이용하여 여러 프로세스를 동시에 수행하는 것이다.

    멀티 프로세스와 멀티 스레드의 특징
    - 멀티 스레드와 멀티 프로세스 모두 여러 흐름을 동시에 수행한다.
    - 멀티 프로세스는 각 프로세스가 독립적인 메모리를 가지고 별도로 실행된다.
    - 멀티 스레드는 각 스레드가 자신의 프로세스의 메모리를 공유한다.
    - 멀티 스레드는 프로세스 메모리를 공유하므로, 시스템 자원의 낭비가 적다.

    문맥 교환(Context Switching)
    만약, CPU 코어 수보다 많은 스레드가 실행되면 코어들은 여러 작업들을 번갈아가며 수행한다.
    이때 스레드 간에 작업 상태 및 다음 작업의 데이터를 저장 및 불러오기하는 것을 문맥교환이라고 한다.
    문맥 교환 시간이 커질수록, 멀티 스레딩의 효율은 저하하게 된다.
    따라서 많은 양의 단순한 계산은 싱글 스레드로 동작하는 것이 효율적일 수 있다.

    스레드 그룹(Thread Group)
    서로 관련있는 스레드를 하나의 그룹으로 묶어 다루기 위한 장치로서, ThreadGroup란 클래스를
    제공한다. 스레드 그룹은 트리 형태로 연결되며, 다른 스레드 그룹끼리는 접근할 수 없기 때문에
    보안상으로 중요한 역할을 할 수 있다.

    데몬 스레드(Daemon Thread)
    데몬 스레드는 다른 일반 스레드의 작업을 돕는 보조적인 역할을 하는 스레드를 가리킨다.
    일반 스레드가 종료되면 데몬 스레드 역시 자동으로 종료된다.
    데몬 스레드는 일반 스레드같이 생성하며, 실행 전에 setDaemon()으로 설정하기만 하면 된다.
    데몬 스레드는 주로 자동으로 수행되는 저장 및 화면 갱신 등에 이용된다.

    가비지 컬렉터(Garbage Collector)
    데몬 스레드를 사용하는 대표적인 예로서, 프로그래머가 동적으로 할당한 메모리 중 사용되지 않는
    영역을 자동으로 해제해 주는 데몬 스레드이다. 가비지 컬렉터를 이용하면 메모리 관련 버그가
    발생할 확률이 낮아진다. 다만, 약간의 성능 하락이 있을 수 있다.
*/

// 스레드 인터페이스 구현.
class ThreadWithRunnable1 implements Runnable {
    public void run() {
        try {
            Thread.sleep(10);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class MultiThread {

    public static void main(String[] args) {

        // 스레드 인스턴스 생성 및 실행.
        Thread thread0 = new Thread(new ThreadWithRunnable1());
        thread0.start();
        System.out.println(thread0.getThreadGroup());

        // 스레드 그룹 생성.
        ThreadGroup group = new ThreadGroup("myThread"); // 그룹 생성.
        group.setMaxPriority(7); // 스레드 그룹 최대 우선순위 설정.

        // 슬레드 생성 시 포함 그룹 전달 가능.
        Thread thread1 = new Thread(group, new ThreadWithRunnable1());
        thread1.start();
        System.out.println(thread1.getThreadGroup());
    }
}
