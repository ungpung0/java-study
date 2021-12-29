package java16;

/*
    스트림(Stream)
    Java에서는 파일 및 콘솔의 입출력을 스트림이라는 흐름을 통해 다루고있다.
    스트림이란 실제의 입력, 출력이 표현된 데이터의 이상화된 흐름을 의미한다.
    즉, OS에 의해 생성되는 가상의 연결 고리를 의미하며 중간 매개자 역할을 한다.
    ※ 스트림 API(Stream API)와는 전혀 다른 개념이다.

    입출력 스트림
    스트림은 한 방향으로만 통신할 수 있으므로, 입출력을 동시에 철리할 수 없다.
    따라서 목적에따라 입력 스트림, 출력 스트림으로 구분된다.
    Java에서는 java.io 패키지 아래의 InputStream과 OutputStream 클래스를 별도로 제공한다.
    - InputStream:
        - read():
            해당 입력 스트림으로부터 다음 바이트를 읽어들인다.
        - read(byte[] b):
            해당 입력 스트림으로부터의 바이트를 배열 b에 저장한다.
        - read(byte[] b, int off, int len):
            해당 입력 스트림으로부터 len 바이트를 읽은 후, 배열 b에 off부터 저장한다.
    - OutputStream:
        - write(int b):
            해당 출력 스트림에 특정 바이트를 저장한다.
        - write(byte[] b):
            배열 b의 특정 바이트를 배열 b의 길이만큼 해당 출력 스트림에 저장한다.
        - write(byte[] b, int off, int len):
            배열 b[off] 부터 len 바이트를 해당 출력 스트림에 저장한다.
    ※ read()에서 더 이상 읽어들일 바이트가 없으면 -1을 반환하는데, byte형은 음수를 읽을 수 없기
       때문에, int형으로 선언한다.

    바이트 기반 스트림
    Java에서 스트림은 기본적으로 바이트 단위로 데이터를 전송한다.
    또한, 다양한 입출력 스트림을 제공하고 있다.
    - 파일: FileInputStream(입력), FileOutputStream(출력)
    - 메모리: ByteArrayInputStream(입력), ByteArrayOutputStream(출력)
    - 프로세스: PipedInputStream(입력), PipedOutputStream(출력)
    - 오디오: AudioInputStream(입력), AudioOutputStream(출력)

    보조 스트림
    Java에서 보조 스트림은 실제 데이터를 주고받을 수는 없지만, 다른 스트림의 기능을 향상시키거나
    새로운 기능을 추가해 주는 스트림이다. 다음과 같은 보조 스트림을 제공하고 있다.
    - 필터 입출력: FilterInputStream(입력), FilterOutputStream(출력)
    - 버퍼 입출력: BufferedInputStream(입력), BufferedOutputStream(출력)
    - 기본 타입 데이터 입출력: DataInputStream(입력), DataOutputStream(출력)
    - 객체 단위 입출력: ObjectInputStream(입력), ObjectOutputStream(출력)
    - 입력 스트림을 논리적으로 연결: SequenceInputStream(입력)
    - 입력 스트림에 버퍼를 이용하여 push back, unread 기능: PushBackInputStream(입력)
    - 출력 스트림에 버퍼를 이용하여 다양한 데이터 출력 기능: PrintStream(출력)

    문자 스트림
    바이트 기반이 아니라 문자 기반의 스트림 전송 기능을 제공한다.
    - 파일: FileReader(입력), FileWriter(출력)
    - 메모리: CharArrayReader(입력), CharArrayWriter(출력)
    - 프로세스: PipedReader(입력), PipedWriter(출력)
    - 문자열: StringReader(입력), StringWriter(출력)
    또한 보조 스트림 기능도 지원한다.
    - 필터: FilterReader(입력), FilterWriter(출력)
    - 버퍼: BufferedReader(입력), BufferedWriter(출력)
    - 입력 스트림에 버퍼를 이용하여 push back, unread 기능: PushbackReader(입력)
    - 출력 스틀림에 버퍼를 이용하여 다양한 데이터 출력 기능: PrintWriter(출력)
*/

public class WhatIsStream {
}
