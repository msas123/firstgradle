package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var httplib = new okhttp();
        System.out.println(httplib.getExampleDotCom());
    }
}