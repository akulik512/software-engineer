package org.akulik.interview.devexperts;

import java.util.*;

public class Devexperts {

    /*
     * There is an integer array that consists of 101 elements.
     * Each number from 1 to 100 is present in the array exactly onceexcept for some number (let's call it M)
     * which is present in the array twice. There are no guarantees for the order of
     * numbers within array. Your task is to find what M is (the value, not the indices).
     *
     * Examples (for 10 instead of 100):
     * _1_ 2 3 4 7 8 9 10 5 _1_ 6
     *
     * 2 5 _7_ _7_ 8 9 10 1 3 6 4
     *
     * 4 5 1 _3_ 2 6 8 9 10 7 _3_
     */
    //    Time space O(n^2)
    public int findM(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }

        return 0;
    }

    public int findM_2(int[] nums) {
        final Set<Integer> uniqueSet = new HashSet<>();
        for (int num : nums) {
            if (uniqueSet.contains(num)) {
                return num;
            } else {
                uniqueSet.add(num);
            }
        }

        return 0;
    }

    /*
     * Firm1
     * John 35
     * Bob 40
     *
     * Firm2
     * Jill 40
     * Brian 25
     *
     * Firm3
     * Jessy 35
     * Betty 25
     *
     * {J, 35} -> {John, Jessy}
     * {J, 40} -> {Jill}
     * {B, 40} -> {Bob}
     * {B, 25} -> {Betty, Brian} // younger than 30 so not returned
     * */
    public Map<String, List<String>> groupAndFilterEmployees(List<Firm> firms) {
        final Map<String, List<String>> map = new HashMap<>();
        for (var firm : firms) {
            final List<Person> persons = firm.getEmployees();

            for (var person : persons) {
                char[] nameAsArray = person.getName().toCharArray();
                String firstLetter = Character.toString(nameAsArray[0]);
                String uniqueKey = "%s%d".formatted(firstLetter, person.getAge());

                if (!map.containsKey(uniqueKey)) {
                    final ArrayList<String> namesByKey = new ArrayList<>();
                    namesByKey.add(person.getName());
                    map.put(uniqueKey, namesByKey);
                } else {
                    List<String> names = map.get(uniqueKey);
                    names.add(person.getName());
                }
            }
        }

        return map;
    }
}
