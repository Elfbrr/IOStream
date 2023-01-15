package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsClass {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[^abc]def");
        Matcher matcher = pattern.matcher("asdef");
        Matcher matcher1=pattern.matcher("ddef");

        System.out.println(matcher.matches()); //false
        System.out.println(matcher1.matches()); ///true



        String regex= "yes|no|exit";
        System.out.println("yes".matches(regex));
        System.out.println("no".matches(regex));
        System.out.println("exit".matches(regex));

        //^ caret

    }
}
