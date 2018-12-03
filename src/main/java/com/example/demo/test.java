package com.example.demo;

public class test {
    public static void main(String[] args) {

        String aString = "123";
        String bString = new String("123");
        System.out.println(aString == bString);
        System.out.println(aString.equals(bString));

    }
}
