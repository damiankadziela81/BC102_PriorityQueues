import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args){
        //Priority Queue = A FIFO data structure that serves elements
        //                             with the highest priorities first
        //				  before elements with lower priority

        Queue<Double> queue = new LinkedList<>();

        queue.offer(3.0);
        queue.offer(2.0);
        queue.offer(4.5);
        queue.offer(1.5);
        queue.offer(2.5);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        System.out.println("----------PRIORITY QUEUE WITH REVESE ORDER----------------------");

        Queue<Double> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        priorityQueue.offer(3.0);
        priorityQueue.offer(2.0);
        priorityQueue.offer(4.5);
        priorityQueue.offer(1.5);
        priorityQueue.offer(2.5);

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }

        System.out.println("----------PRIORITY QUEUE WITH STRING OBJECTS----------------------");

        Queue<String> priorityQueue2 = new PriorityQueue<>();

        priorityQueue2.offer("A");
        priorityQueue2.offer("C");
        priorityQueue2.offer("B");
        priorityQueue2.offer("E");
        priorityQueue2.offer("D");

        while (!priorityQueue2.isEmpty()) {
            System.out.println(priorityQueue2.poll());
        }
    }
}
