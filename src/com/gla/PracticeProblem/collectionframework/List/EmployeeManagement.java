package com.gla.PracticeProblem.collectionframework.List;

import java.util.ArrayList;

class Employee {
    private String name;
    private int id;
    private String email;

    public Employee(String email, int id, String name) {
        this.email = email;
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "\tList.Employee name: " + name + "\tId: " + id + "\tEmail: " + email ;
    }
}
public class EmployeeManagement {
    public static void main (String [] args){
        Employee e1 = new Employee("Ashutosh",10001,"ashutosh108@gmail.com");
        Employee e2 = new Employee("Shyam",10002,"shyamashyam@gmail.com");
        Employee e3 = new Employee("Deepanshu",10003,"deepanshu449@gmail.com");
        ArrayList<Employee> al = new ArrayList<>();
        al.add(e1);
        al.add(e2);
        al.add(e3);
        System.out.println(al);
        for (Employee e : al){
            System.out.println(e);
        }
        Employee updateemp = new Employee("Aryan",10004,"aryanrajput445@gmail.com");
        al.set(2,updateemp);
        System.out.println(al);
    }
}
