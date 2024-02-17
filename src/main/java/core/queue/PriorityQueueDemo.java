package core.queue;

import java.util.*;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        //creating priorityQueue
        PriorityQueue pq = new PriorityQueue();
        //defaul size = 11
        //DNSO

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

    }

}
