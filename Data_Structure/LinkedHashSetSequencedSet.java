/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data_structures;

/**
 *
 * @author hp
 */
import java.util.LinkedHashSet;

public class LinkedHashSetSequencedSet {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        System.out.println("LinkedHashSet: " + set);

        set.remove("Banana");
        System.out.println("After removing Banana: " + set);
    }
}

