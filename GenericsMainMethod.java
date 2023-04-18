package com.bridgelabz.genericsexample;

public class GenericsMainMethod {
    static void maxIntegerNumber(Integer a, Integer b, Integer c){
        Integer maximum = a;
        if(b.compareTo(maximum) > 0)
            maximum = b;
        if (c.compareTo(maximum) > 0) {
            maximum = c;
        }
        System.out.println(maximum + " is largest");
    }

    public static void main(String[] args) {
        System.out.println("Generics Example");

        int intA = 30, intB = 20, intC = 10;
        maxIntegerNumber(intA,intB,intC);
    }
}
