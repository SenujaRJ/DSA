/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data_structures;

/**
 *
 * @author hp
 */
import java.util.PriorityQueue;

public class PriorityQueueQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(30);
        queue.add(10);
        queue.add(20);

        System.out.println("PriorityQueue: " + queue);

        System.out.println("Removed: " + queue.poll());
        System.out.println("Queue after removal: " + queue);
    }
}

