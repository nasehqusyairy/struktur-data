package strukturdata;

public class App {
  public static void main(String[] args) {
    Data dt1 = new Data("01", "Budi");
    Data dt2 = new Data("02", "Ali");
    Data dt3 = new Data("03", "Umar");

    Stack Qu = new Stack();

    Qu.Push(dt1);
    Qu.Push(dt2);
    Qu.Push(dt3);

    System.out.println(Qu);

    Data dt01 = Qu.Pop();
    System.out.println(Qu);

    Data dt02 = Qu.Pop();
    System.out.println(Qu);

    Data dt03 = Qu.Pop();
    System.out.println(Qu);

    Data dt04 = Qu.Pop();
    System.out.println(Qu);
  }
}
