package org.Homework;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.io.IOException;
import java.io.BufferedInputStream;

public class Question1 {

    /**Write a Java program that takes a list of strings as input and writes them to a file,
     * one string per line. The program should also have the ability to append new strings to the file
     *, rather than overwriting the existing content*/

    public static void main(String[] args) {
        List<String> newStrings= List.of("This","is","a","test","for","new","String", "list");

        String aList= "src/main/java/org/Files/data.txt";

        writeFile(newStrings,aList,true);
    }

    public static void writeFile( List<String> newStrings,String aList, boolean append){
        try {
            BufferedWriter bufferedWriter=new BufferedWriter((new FileWriter(aList,append)));
            for(String s: newStrings){
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }

            System.out.println(newStrings);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
