package java17;

/*
    프로세스(Process)
    프로세스는 단순히 실행 중인 프로그램(Program)을로 OS에 의해 메모리 공간을 할당받고
    실행 중인 것을 말한다. 프로세스는 데이터, 메모리 등의 자원 그리고 스레드로 구성된다.

    스레드(Thread)
    스레드란 프로세스 내에서 실제로 작업을 수행하는 주체를 의미한다.
    따라서 모든 프로세스에는 한 개 이상의 스레드가 존재하여 작업을 수행한다.
    두 개 이상의 스레드를 갖는 프로세스를 멀티스레드 프로세스(multi-threaded proccess)라고 한다.

    스레드 생성 및 실행
    스레드를 생성하는 방법으로 두 가지가 있다.
    - Runnable 인터페이스를 구현하는 방법.
    - Thread 클래스를 상속받는 방법.
    두 방법 모두 작업하고 싶은 내용을 run() 메소드에 저장하면 된다.
    ※ Runnable 인터페이스는 몸통이 없는 run() 하나만을 갖는 간단한 인터페이스.

    스레드의 우선순위
    우선순위에 따라서 특정 스레드가 더 많은 작업을 할 수 있도록 설정할 수 있다.
    - MAX_PRIORITY: 스레드가 가질 수 있는 최대 우선순위를 명시한다.
    - MIN_PRIORITY: 스레드가 가질 수 있는 최소 우선순위를 명시한다.
    - NORM_PRIORITY: 스레드가 생성될 때 기본 우선순위를 명시한다.
    또한 getPriority()와 setPriority() 메소드로 우선순위를 반환하거나 변경할 수 있다.
    스레드의 우선순위는 상대값이고, 속도의 차이가 아닌 할당 시간의 차이이다.
*/

// 스레드 생성 예제1. (Thread 클래스 상속)
class ThreadWithClass extends Thread {
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println(getName()); // 현재 실행 중인 스레드의 이름을 반환한다.
            try {
                Thread.sleep(10); // 0.01초 스레드를 멈춘다.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// 스레드 생성 예제. (Runnable 인터페이스 구현)
class ThreadWithRunnable implements Runnable {
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()); // 현재 실행중 스레드 반환.
            try {
                Thread.sleep(10);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class WhatIsThread {

    public static void main(String[] args) {
        // 스레드 인스턴스 생성.
        ThreadWithClass thread1 = new ThreadWithClass();
        Thread thread2 = new Thread(new ThreadWithRunnable());

        // 스레드 우선순위 변경 예제.
        thread2.setPriority(10); // 우선순위를 10으로 변경.

        // 스레드 실행.
        thread1.start();
        thread2.start();

        System.out.println(thread1.getPriority()); // main() 기본 우선순위는 5.
        System.out.println(thread2.getPriority()); // 10으로 변경된 우선순위.
    }
}
