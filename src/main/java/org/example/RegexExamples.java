package org.example;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExamples {
    public static void main(String[] args) {

        // \w => [a-zA-Z_0_9]
        String myText="This is my small example string to use in my regex example";
        boolean result = myText.matches("\\w.*");
        System.out.println("result = " + result);

        String myText2= "Aa";
        System.out.println("myText2.matches(\"[a-zA-Z_0_9]\") = " + myText2.matches("[a-zA-Z_0_9]"));

        String value = "true";
        System.out.println(value.matches("true"));//true
        System.out.println(value.matches("True"));//false
        System.out.println(value.matches("[tT]rue"));//true
        System.out.println(value.matches("[tT]rue|[yY]es"));//true it means [] whatever inside this, it should be true

        String values = "I am trying to learn regex in Java";
        Pattern pattern = Pattern.compile("\\w+",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(values);

        while (matcher.find()){
            System.out.println("matcher.start() = " + matcher.start());
            System.out.println("matcher.end() = " + matcher.end());
            System.out.println("matcher.group() = " + matcher.group());
            System.out.println("=================");
        }

        /**String [] aaa= value.split("");
        System.out.println("Arrays.asList(aaa) = " + Arrays.asList(aaa));
        Pattern replace= Pattern.compile("\\s+");
        Matcher m= m.replaceAll(values);
        String*/


    }
}
