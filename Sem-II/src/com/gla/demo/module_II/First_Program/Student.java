package com.gla.demo.program;

class Student {
    int age;
    int classx;
    int year;

    Student(int age, int classx, int speed) {
        this.age = age;
        this.classx = classx;
        this.year = speed;
    }

    void Show() {
        System.out.println("age:" + age);
        System.out.println("classx:" + classx);
        System.out.println("year:" + year);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1,2,3);
        s1.Show();
    }
}
