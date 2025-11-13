package com.example.test;

import com.example.util.TextTools;

public class TestTextTools {
    public static void main(String[] args) {
        String text = "hello";
        String capitalized = TextTools.capitalize(text);
        String reversed = TextTools.reverse(text);

        System.out.println("Original: " + text);
        System.out.println("Capitalized: " + capitalized);
        System.out.println("Reversed: " + reversed);
    }
}
