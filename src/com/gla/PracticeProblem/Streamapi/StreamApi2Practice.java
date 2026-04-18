package com.gla.PracticeProblem.Streamapi;


    interface SumofTwoNumber{
        int sumofNumber(int a , int b);
    }

    public class StreamApi2Practice {
        public static void main(String[] args) {
            //Lambda expression for sumofTwoNumber
            SumofTwoNumber sum = (int a , int b )->(a+b);
            System.out.println(sum.sumofNumber(11,22));
        }
}
