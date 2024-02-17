package core.list;

import java.util.Stack;

public class StackDemo {

  public static void main(String[] args) {
    //Creating stack
    Stack s = new Stack();

    //to add element in stack
    s.push(10);
    s.push(30);
    s.push(true);

    //to remove element from stack
    Object o = s.pop();
    System.out.println(s);

    //to get last element from stack without replacing it
    Object obj = s.peek();
    System.out.println(obj);
    System.out.println(s);

    //to check whether stack is empty or not
    System.out.println(s.empty());

    //to search an element in stack, it returns offset of element if available.
    System.out.println(s.search(10));
    s.push(null);
    s.push(null);
    s.push(null);
    System.out.println("Stack null insertion: " + s);
  }

}
