package com.bridgelabz.genericsexample;

public class GenericsMainMethod {
    //Generic method for Integer,Float,String data type to find maximum of 3 values.
    public static <T extends Comparable<T>>void maximumValue(T data1, T data2, T data3){
        T maximum = data1;

        if(data2.compareTo(maximum) > 0)
            maximum = data2;
        if (data3.compareTo(maximum) > 0) {
            maximum = data3;
        }
        System.out.println(maximum + " is largest");
    }

    public static void main(String[] args) {
        System.out.println("Generics Example");

        //int,float,string variables
        int intA = 30, intB = 20, intC = 10;
        float floatA = 10.1f, floatB = 10.8f, floatC = 20.1f;
        String value1 = "Apple", value2 = "Peach", value3 =  "Banana";

        System.out.println();
        System.out.println("Generic method started....");
        maximumValue(intA,intB,intC);
        maximumValue(floatA,floatB,floatC);
        maximumValue(value1,value2,value3);
        System.out.println("....Generic method ended....");
        System.out.println();
    }
}
