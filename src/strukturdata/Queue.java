package strukturdata;

public class Queue {
  public Data Head = null;
  public Data Tail = null;

  public void Add(Data node) {
    if (Head == null && Tail == null) {
      Head = node;
      Tail = node;
    } else {
      Tail.Next = node;
      Tail = node;
    }
  }

  public Data Get() {
    if (Head == null)
      return null;
    Data tmp = Head;
    Head = Head.Next;
    return tmp;
  }

  @Override
  public String toString() {
    String tmp = "";
    Data Node = Head;
    while (Node != null) {
      tmp += Node.Nama + " ";
      Node = Node.Next;
    }
    return tmp;
  }

}
