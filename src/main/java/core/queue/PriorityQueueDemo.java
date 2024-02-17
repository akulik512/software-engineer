package core.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeSet;

public class PriorityQueueDemo {

  public static void main(String[] args) {
    //creating priorityQueue
    //default capacity = 11
    PriorityQueue pq = new PriorityQueue();

    //creating priorityQueue with specified size
    PriorityQueue pq1 = new PriorityQueue(20);

    //creating priorityQueue with initial capacity and comparator object
    //PriorityQueue pq2 = new PriorityQueue(int initialCapacity,Comparator c);

    SortedSet s = new TreeSet();
    //creating priorityQueue equivalent to sortedSet s
    PriorityQueue pq3 = new PriorityQueue(s);

    List l = new ArrayList();
    //creating equivalent priorityQueue for any collection
    PriorityQueue pq4 = new PriorityQueue(l);

    System.out.println("Test duplicates");
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
    priorityQueue.add(3);
    priorityQueue.add(1);
    priorityQueue.add(2);
    priorityQueue.add(1); // Duplicate

    while (!priorityQueue.isEmpty()) {
      System.out.println(priorityQueue.poll());
    }
  }

}
