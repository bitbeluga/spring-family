package com.example.demo;

public class DemoString {

    public static void main(String[] args) {

        // System.out.println("Hello String: " + 1.0);// 可将其他类型转换位数字
        // String hello = String.join("*", "H", "E", "L", "L", "O");//拼接
        // System.out.println(hello.equals("H*E*L*L*o"));
        // System.out.println(hello.equalsIgnoreCase("H*E*L*L*o"));
        // String string = "hello";
        // System.out.println(string.codePointAt(0));
        // System.out.println(string.length());

        //构建字符串
        StringBuilder builder=new StringBuilder();
        builder.append("LONG");
        builder.append("str");
        System.out.println(builder.toString());
    }

}
