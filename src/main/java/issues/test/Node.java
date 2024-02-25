package issues.test;

import java.util.Stack;

public class Node {

  Node left, right;
  int value;

  public Node(int value) {
    this.value = value;
  }

  // New method to find a node with a specific value iteratively
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
        return current; // Found the node with the given value
      }

      current = current.right;
    }

    return null; // Node with the given value not found
  }
}
