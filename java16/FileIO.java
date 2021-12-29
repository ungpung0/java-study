package java16;

/*
    표준 입출력
    콘솔과 같은 표준 입출력 장치를 위해 System이라는 표준 입출력 클래스를 정의한다.
    java.lang 패키지에서는 다음과 같은 클래스 변수를 제공한다.
    - System.in(클래스 변수) / InputStream(스트림):
        콘솔로부터 데이터를 입력받는다.
    - System.out(클래스 변수) / PrintStream(스트림):
        콘솔로부터 데이터를 출력한다.
    - System.err(클래스 변수) / PrintStream(스트림):
        콘솔로부터 데이터를 출력한다.
    ※ 표준 입출력 스트림은 Java가 자동 생성하므로 별도로 스트림을 생성하지 않아도 된다.

    표준 입출력 대상 변경
    스트림에 다음 System 메소드를 사용하면 대상을 다른 입출력 장치로 변경할 수 있다.
    - static void setIn(InputStream in):
        입력 스트림의 대상을 전달 입력 스트림으로 변경한다.
    - static void setOut(PrintStream out):
        출력 스트림의 대상을 전달 출력 스트림으로 변경한다.
    - static void setErr(PrintStream err):
        출력 스트림의 대상을 전달 출력 스트림으로 변경한다.

    RandomAccessFile 클래스
    순차적인 접근이 아닌 임의의 지점에 접근하여 작업을 수행하려면 RandomAccessFile 클래스를 사용한다.
    이 클래스는 파일만을 대상으로 하며, 임의의 지점에서 입출력을 동시에 수행할 수 있다.
    RandomAccessFile은 아래와 같은 파일 모드까지 함께 전달해야만 한다.
    - 'r': 파일을 오로지 읽는 것이 가능한 모드.
    - 'rw': 파일을 읽고 쓰는 것이 가능한 모드. 파일이 없을 경우 새 파일 생성.

    File 클래스
    파일을 통한 입출력은 스트림으로 수행할 수 있으나, 파일 및 디렉터리에 관한 작업은 입출력으로 수행할 수 없다.
    Java에서는 이를 File 클래스를 통해 처리하도록 하고 있다. 아래는 작업을 위한 메소드의 예시이다.
    - canRead(): 해당 파일이 읽을 수 있는 파일인지 검사한다.
    - canWrite(): 해당 파일이 쓸 수 있는 파일인지 검사한다.
    - delete(): 파일 또는 디렉터리를 제거한다.
    - exists(): 해당 파일의 존재 유무를 검사한다.
    - getPath(): 해당 파일의 경로명을 문자열로 반환한다.
    - isAbsolute(): 해당 파일의 경로명이 절대 경로인지 검사한다.
    - isDirectory(): 해당 파일이 디렉터리인지 검사한다.
    - isFile(): 해당 파일이 파일인지를 검사한다.
    - length(): 해당 파일의 크기를 반환한다.
    - mkdir(): 지정 경로에 디렉터리를 생성한다.
    - mkdirs(): 지정 경로에 상위 디렉터리까지 포함한 디렉터리를 생성한다.
    - renameTo(File dest): 파일의 이름을 전달된 이름으로 변경한다.
    - setExecutable(boolean), setReadable(), setWritable(), setReadOnly():
        해당 파일의 쓰기, 읽기 속성을 변경한다.
*/

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileIO {


    public static void main(String[] args) {
        // RandomAccessFille의 예제.
        try {
            RandomAccessFile file = new RandomAccessFile("Data.txt", "rw");
            System.out.println(file.getFilePointer()); // 파일 포인터의 현 위치 반환.
            file.writeInt(10); // 정수를 저장.
            System.out.println(file.getFilePointer()); // 4
            file.seek(20); // 파일 포인터를 20으로 이동.
            System.out.println(file.getFilePointer()); // 20
        } catch (IOException e) {
            e.printStackTrace();
        }

        // File 클래스 사용 예제.
        File dir = new File("C:\\data"); // 디렉터리 생성.
        File file = new File(dir, "data.txt");
        if(!file.exists()) {
            System.out.println("파일이 존재하지 않는다.");
            System.exit(0);
        }
        System.out.println(file.getPath()); // 파일의 경로 반환.
        System.out.println(file.length()); // 파일의 크기 변환.

    }

}
