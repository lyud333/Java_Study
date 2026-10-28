package stream.inputStream;

import java.io.IOException;

public class SystemInTest {
    public static void main(String[] args) throws IOException {
        int alpa;

        alpa = System.in.read();
        System.out.printf("입력된 문자: %c", alpa);
    }
}
