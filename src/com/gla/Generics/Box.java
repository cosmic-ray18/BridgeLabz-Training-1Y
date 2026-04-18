package com.gla.Generics;

class Box<T> {
    T value;

    void setBox(T value) {
        this.value = value;
    }

    T getBox(){
        return value;
    }
    public static void main (String[] args){
        Box<Integer> b1 = new Box<>();
        b1.setBox(27);
        System.out.println(b1.getBox());

        Box<Double> b2 = new Box<>();
        b2.setBox(3.9);
       System.out.println(b2.getBox());

       Box<String> b3 = new Box<>();
       b3.setBox("Rishi");
        System.out.println(b3.getBox());
    }
}
