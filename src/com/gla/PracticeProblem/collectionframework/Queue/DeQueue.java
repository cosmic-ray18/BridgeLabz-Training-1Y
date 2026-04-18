package com.gla.PracticeProblem.collectionframework.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class DeQueue {
    public static void main (String[] args ){
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addLast(56);
        dq.addFirst(78);
        dq.offerFirst(99);
        dq.offerLast(88);

        System.out.println(dq);

        dq.pollLast();
        System.out.println(dq);
        System.out.println(dq.peekFirst());

    }
}
