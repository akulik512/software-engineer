package test.question.tree;

public class BinaryTreeExample {

  public static void main(String[] args) {
    Node small = new Node(10);
    small.left = new Node(5);
    small.right = new Node(15);
    small.left.left = new Node(3);
    small.left.right = new Node(8);
    small.right.right = new Node(20);

    Node resultSmall = small.find(8);

    if (resultSmall != null) {
      System.out.println("Node found with value 8: " + resultSmall.value);
    } else {
      System.out.println("Node with value 8 not found.");
    }

    Node large = constructLargeTree(0, 100000);

    Node resultLarge = large.find(99999);

    if (resultLarge != null) {
      System.out.println("Node found with value 99999: " + resultLarge.value);
    } else {
      System.out.println("Node with value 99999 not found.");
    }
  }

  private static Node constructLargeTree(int start, int end) {
    if (start > end) {
      return null;
    }

    int mid = (start + end) / 2;
    Node root = new Node(mid);
    root.left = constructLargeTree(start, mid - 1);
    root.right = constructLargeTree(mid + 1, end);

    return root;
  }

}
