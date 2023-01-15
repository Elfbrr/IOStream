package org.example;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamClass {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("src/main/java/org/example/Files/data.txt");
            int i= inputStream.read();
            String sentence = "";
            while (i!=0){
                System.out.println((char)i);
                sentence+=(char)i;
                i=inputStream.read();
            }
            System.out.println("This is a String");
            System.out.println(sentence);

            sentence=sentence.replace("ASCII","AYSE");
            System.out.println(sentence);

            String[] string= sentence.split(" ");
            System.out.println(Arrays.toString(string));



        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);


        }
    }
}
