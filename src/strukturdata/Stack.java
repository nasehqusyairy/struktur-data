package strukturdata;

public class Stack {
  public Data Head = null;
  public Data Tail = null;

  public void Push(Data node) {
    if (Head == null && Tail == null) {
      Head = node;
      Tail = node;
    } else {
      Data tmp = Head;
      Head.Prev = node;
      Head = node;
      Head.Next = tmp;
    }
  }

  public Data Pop() {
    if (Head == null)
      return null;
    Data tmp = Head;
    Head.Prev = null;
    Head = Head.Next;
    tmp.Next = null;
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
