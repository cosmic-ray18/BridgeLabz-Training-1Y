package com.gla.PracticeProblem.Streamapi;

interface StringLength{
    int length(String s);
}
public class StreamApi3Practice {
    public static void main(String[] args){
        //Lambda expression for String length
        StringLength result = (s-> s.length());
        System.out.println(result.length("Radhe"));
    }
}
