package com.lesson8;
import java.io.IOException;
import java.io.File;

public class MyHomework {

    public static void main(String[] args) {
        MyHomework homework = new MyHomework();
        homework.myHomework();
    }

    public static void readFile(String filePath) throws IOException {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new IOException("File not exist " + filePath);
        }

        if (!file.canRead()) {
            throw new IOException("Can't open the file " + filePath);
        }

        System.out.printf("File read successfully");
    }

    public void myHomework() {
        try {
            readFile("src/main/java/com/lesson8/users.txt");
        } catch (IOException e) {
            e.printStackTrace();

            throw new MyUncheckedException("An error occurred while reading the file", e);
        }
    }
}

class MyUncheckedException extends RuntimeException {

    public MyUncheckedException(String message, Throwable cause) {
        super(message, cause);
    }
}
