package stackDanQueue;

public class App {
  public static void main(String[] args) {
    Data dt1 = new Data("01", "Budi");
    Data dt2 = new Data("02", "Ali");
    Data dt3 = new Data("03", "Umar");

    Stack Qu = new Stack();

    Qu.push(dt1);
    Qu.push(dt2);
    Qu.push(dt3);

    System.out.println(Qu);

    // Data dt01 =
    Qu.pop();
    System.out.println(Qu);

    // Data dt02 =
    Qu.pop();
    System.out.println(Qu);

    // Data dt03 =
    Qu.pop();
    System.out.println(Qu);

    // Data dt04 =
    Qu.pop();
    System.out.println(Qu);
  }
}
