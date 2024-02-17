package udemy.algorithm.hashtable;

import java.util.LinkedList;

class HashTable {

    private static final int SIZE = 10;
    private final LinkedList<Entry>[] table;

    public HashTable() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    public static void main(String[] args) {
        HashTable hashtable = new HashTable();

        hashtable.put("key1", "value1");
        hashtable.put("key2", "value2");
        hashtable.put("key3", "value3");

        System.out.println("Value for key1: " + hashtable.get("key1"));
        System.out.println("Value for key2: " + hashtable.get("key2"));
        System.out.println("Value for key3: " + hashtable.get("key3"));
        System.out.println("Value for non-existent key: " + hashtable.get("nonexistent"));

        System.out.println("Does algorithm.hashtable contain key2? " + hashtable.containsKey("key2"));
        System.out.println("Does algorithm.hashtable contain nonexistent key? " + hashtable.containsKey("nonexistent"));
    }

    private int hashFunction(String key) {
        // Simple hash function for demonstration purposes
        return key.hashCode() % SIZE;
    }

    public void put(String key, String value) {
        int index = hashFunction(key);
        LinkedList<Entry> list = table[index];

        for (Entry entry : list) {
            if (entry.key.equals(key)) {
                // Key already exists, update the value
                entry.value = value;
                return;
            }
        }

        // Key doesn't exist, add a new entry
        list.add(new Entry(key, value));
    }

    public String get(String key) {
        int index = hashFunction(key);
        LinkedList<Entry> list = table[index];

        for (Entry entry : list) {
            if (entry.key.equals(key)) {
                // Key found, return the associated value
                return entry.value;
            }
        }

        // Key not found
        return null;
    }

    public boolean containsKey(String key) {
        int index = hashFunction(key);
        LinkedList<Entry> list = table[index];

        for (Entry entry : list) {
            if (entry.key.equals(key)) {
                // Key found
                return true;
            }
        }

        // Key not found
        return false;
    }

}
