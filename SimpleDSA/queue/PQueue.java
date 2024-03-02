package SimpleDSA.queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PQueue {

    public static void main(String[] args) {
        // Priority Queue = A FIFO data structure that serves elements
        // with the highest priorities first
        // before elements with lower prir

        Queue<Double> mew = new PriorityQueue<>(Collections.reverseOrder());

        mew.offer(8.29);
        mew.offer(9.29);
        mew.offer(9.54);
        mew.offer(110.00);
        mew.offer(100.00);

        while (!mew.isEmpty()) {
            System.out.println(mew.poll());
        }

    }

}
