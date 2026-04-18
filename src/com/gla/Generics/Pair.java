package com.gla.Generics;

class Pair<T,U> {
    T String1;
    U Integer1;

    Pair(T String1, U Integer1){
        this.String1 = String1;
        this.Integer1 = Integer1;
    }
    T getFirst(){
        return String1 ;
    }
    U getSecond(){
        return Integer1;
    }

    public static void main (String[] args){
        Pair<String, Integer> p1 = new Pair<>("Krishan" ,17);
        System.out.println(p1.getFirst());
        System.out.println(p1.getSecond());
    }

}
