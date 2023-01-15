package org.example;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamClass {
    public static void main(String[] args) {
        try {
        FileInputStream inputStream = new FileInputStream("src/main/java/org/Files/data.txt");
            int i= inputStream.read();
            String sentence = "";
            while (i!=-1){
                System.out.println((char)i);// okur ve cumleyi yukaridan asagiya siralar
                sentence+=(char)i;
                i=inputStream.read();
            }
            System.out.println("This is a String");
            System.out.println(sentence);//okur ve yan yana yazdirir

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
