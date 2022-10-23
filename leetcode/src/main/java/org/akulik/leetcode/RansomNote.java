package org.akulik.leetcode;

import java.util.HashMap;

// 383. Ransom Note
public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> counts = new HashMap<>();

        for (var c : magazine.toCharArray()) {
            Integer addNewElement = counts.getOrDefault(c, 0) + 1;
            counts.put(c, addNewElement);
        }

        for (var c : ransomNote.toCharArray()) {
            if (!counts.containsKey(c) || counts.get(c) <= 0) {
                return false;
            }
            Integer removeUsedElement = counts.get(c) - 1;
            counts.put(c, removeUsedElement);
        }

        return true;
    }

}
