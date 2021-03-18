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

            // Fixed sized!
            List<String> stringList = Arrays.asList("string");
            // stringList.add("new string");
            // System.out.println(stringList);// EXCEPTION!
        }
    }
}
