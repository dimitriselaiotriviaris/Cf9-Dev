package gr.aueb.cf.cf9.ch6;

import java.util.Arrays;

/**
 * Queues are FIFO (First In First Out) logic.
 * Implemented with:
 * enqueue()
 * dequeue()
 */

public class QueueApp {
    static int[] queue = new int[10];
    static int top = -1;

    public static void main(String[] args) {

    }

    public static void enqueue(int val){
        if (isFull()){
            throw new RuntimeException("Queue is full!");
        }
        queue[++top] = val;
    }

    public static int dequeue(){
        int num = queue[0];

        if (isEmpty()){
            throw new RuntimeException("Queue is empty!");
        }
        queue = Arrays.copyOfRange(queue, 1, queue.length + 1);
        top--;
        return num;
    }

    public static boolean isEmpty(){
        return top == -1;
    }

    public static boolean isFull(){
        return top == queue.length - 1;
    }

    public static void printQueue() {
        if (isEmpty()){
            throw new RuntimeException("Queue is empty!");
        }

        for (int i = 0; i <= top; i++){
            System.out.println(queue[i]);
        }
    }
}
