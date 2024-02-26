package test.question.tree;

import java.util.Stack;

public class Node {

  Node left, right;
  int value;

  public Node(int value) {
    this.value = value;
  }

  public Node find(int v) {
    Node current = this;
    Stack<Node> stack = new Stack<>();

    while (current != null || !stack.isEmpty()) {
      while (current != null) {
        stack.push(current);
        current = current.left;
      }

      current = stack.pop();

      if (v == current.value) {
        return current;
      }

      current = current.right;
    }

    return null;
  }
}
