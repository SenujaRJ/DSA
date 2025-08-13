/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data_structures;

/**
 *
 * @author hp
 */
import java.util.HashSet;

public class HashSetSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // duplicate, won't be added

        System.out.println("HashSet: " + set);

        set.remove("Banana");
        System.out.println("After removing Banana: " + set);

        System.out.println("Contains Cherry? " + set.contains("Cherry"));
    }
}

