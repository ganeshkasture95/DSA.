package SimpleDSA.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {

    public static void main(String[] args) {

        Queue<String> mew = new LinkedList<String>();
        System.out.println();
        System.out.println("This is my first queue i made");

        System.out.println("This isEmpty method");
        System.out.println(mew.isEmpty());
        // will return true if the quew is empty and vise verssa

        System.out.println("Will add the element to the tail of the queue");
        mew.offer("ganesh");
        mew.offer("kasture");
        mew.offer("the");
        mew.offer("King");
        mew.offer("of");
        mew.offer("World");

        mew.poll();
        mew.poll();
        mew.poll();
        mew.poll();

        System.out.println(mew);

        System.out.println("This is peak method");
        System.out.println(mew.peek());
        // peekk nethod in queue will not czuse any exception

        System.out.println("This is the element method will returns exception if the queue is empty");
        System.out.println(mew.element());

        System.out.println("This is contains method used to check wether the object is present inside queue");
        System.out.println(mew.contains("World"));
        System.out.println(mew);

        // Queue Data structure is the data structure which uses
        // FIFO(first in first out)
        // way of treating its elements

        // It is a collection designed for holding elements prier to processing
        // Linnear data structure

        // enquew = offer()
        // dequeuw = poll()
    }

}