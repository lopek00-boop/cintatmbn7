/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoriw9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class ArrayList2 {
    public static void main(DemoString[] args) {
        List<DemoString> list = new ArrayList<>();
        list.add("Sari"); 
        list.add("Budi"); 
        list.add("Rina");
        list.remove("Budi");
        System.out.println(list + " size=" + list.size());

        Set<DemoString> set = new HashSet<>(List.of("A", "B"));
        System.out.println(set.add("A") + " " + set.add("C"));

        Map<DemoString, Integer> nilai = new HashMap<>();
        nilai.put("Sari", 90); 
        nilai.put("Budi", 80);
        nilai.put("Sari", 95);
        System.out.println(nilai.get("Sari") + " " + nilai.size());
    }
}
