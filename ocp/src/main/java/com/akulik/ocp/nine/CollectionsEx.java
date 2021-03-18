package com.akulik.ocp.nine;

import java.util.Arrays;
import java.util.List;

/**
 * 9: Collections
 */
public class CollectionsEx {

    public static void main(String[] args) {
        // 1
        CreateListObject createListObject = new CreateListObject();
        createListObject.result();
    }

    private static class CreateListObject {
        private void result() {
            // Read only List! Check Google Docs or javadoc
            List<String> readOnly = List.of("string");
            // readOnly.add("new string");
            // System.out.println(readOnly); // EXCEPTION!
            System.out.println("The original item of the read-only collection: " + readOnly.get(0));
            System.out.println("After modification: " + readOnly.get(0).toUpperCase());

            // Fixed sized!
            List<String> stringList = Arrays.asList("string");
            // stringList.add("new string");
            // System.out.println(stringList);// EXCEPTION!

            // Difference between List.of and Arrays.asList?
            ArrayListCreationDiff arrayListCreationDiff = new ArrayListCreationDiff();
            arrayListCreationDiff.result();;
        }

        private static class ArrayListCreationDiff {
            private void result() {
                showImmutable();
                showNull();
                showContains();
                showReflectedChanges();
            }

            private void showImmutable() {
                System.out.println("\n-- 1");

                List<Integer> asList = Arrays.asList(1, 2, null);
                System.out.println("Original asList: " + asList);
                asList.set(1, 10); // OK
                System.out.println("Modified asList: " + asList);

                List<Integer> of = List.of(1, 2, 3);
                System.out.println("Original of: " + of);
                // System.out.println("Modified of: " + of.set(1, 10)); // Fails with UnsupportedOperationException
            }

            private void showNull() {
                System.out.println("\n-- 2");

                List<Integer> asList = Arrays.asList(1, 2, null); // OK
                System.out.println("Original asList: " + asList);

                // List<Integer> of = List.of(1, 2, null); // Fails with NullPointerException
            }

            private void showContains() {
                System.out.println("\n-- 3");

                List<Integer> asList = Arrays.asList(1, 2, 3);
                System.out.println("Original asList: " + asList.contains(null)); // Returns false

                List<Integer> of = List.of(1, 2, 3);
                // of.contains(null); // Fails with NullPointerException
            }

            private void showReflectedChanges() {
                System.out.println("\n-- 4");

                Integer[] array1 = {1,2,3};
                List<Integer> asList = Arrays.asList(array1);
                System.out.println("Original asList: " + asList);
                array1[1] = 10;
                System.out.println("Modified asList: " + asList); // Prints [1, 10, 3]

                Integer[] array2 = {1,2,3};
                List<Integer> of = List.of(array2);
                System.out.println("Original of: " + of);
                array2[1] = 10;
                System.out.println("Modified of: " + of); // Prints [1, 2, 3]
            }
        }
    }
}
