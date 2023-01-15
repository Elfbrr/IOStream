package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
      readFile("src/main/java/org/Files/data.txt");
    }
          //to read a file
    public static void readFile(String filePath1){
        try {
            FileInputStream fileInputStream= new FileInputStream(new File(filePath1));
            fileInputStream.skip(3);// Print etmeye length 3 den sonrakinden baslar.
            String content= "";
            int i;
            while((i=fileInputStream.read()) !=-1){
                content=content+(char) i;
            }
            System.out.println(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
