package binaryTree;

public class BinarySearchTree {

  public Node root = null;
  public String str = "";

  public void add(int value) {
    Node node = new Node(value);
    add(node);
  }

  public void add(Node node) {
    if (root == null) {
      root = node;
    } else {
      Node tmp = root;
      boolean placed = false;
      while (!placed) {
        if (node.value < tmp.value) {

          if (tmp.leftChild != null) {
            tmp = tmp.leftChild;
          } else {
            tmp.leftChild = node;
            placed = true;
          }

        } else {

          if (tmp.rightChild != null) {
            tmp = tmp.rightChild;
          } else {
            tmp.rightChild = node;
            placed = true;
          }

        }
      }
    }
  }

  public Node find(int key) {
    if (root != null) {
      Node tmp = root;

      while (tmp != null) {
        if (tmp.value == key) {
          return tmp;
        } else {
          if (key < tmp.value) {
            tmp = tmp.leftChild;

          } else {
            tmp = tmp.rightChild;
          }
        }
      }

      return tmp;
    }
    return null;
  }

  public Node remove(int key) {

    Node el = find(key);
    System.out.println(root.leftChild.rightChild);
    if (el != null) {
      if (el.rightChild != null) {
        add(el.rightChild);
        if (el.leftChild != null)
          add(el.leftChild);
      }
    }

    return el;
  }

  public void display() {
    show(root);
    System.out.println(str);
  }

  public void show(Node nd) {
    if (nd != null) {
      if (nd.leftChild != null) {
        show(nd.leftChild);
      }
      str = str + " " + nd.value;
      if (nd.rightChild != null) {
        show(nd.rightChild);
      }
    }
  }

}
