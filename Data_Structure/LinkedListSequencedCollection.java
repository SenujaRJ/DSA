/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data_structures;

/**
 *
 * @author hp
 */
import java.util.LinkedList;

public class LinkedListSequencedCollection {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("Original list: " + list);

        list.addFirst("Mango");
        list.addLast("Orange");
        System.out.println("After adding first and last: " + list);

        list.removeFirst();
        list.removeLast();
        System.out.println("After removing first and last: " + list);
    }
}
