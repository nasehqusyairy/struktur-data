package rekursi;

public class Rekursi {

  public int faktorial(int val) {
    return val == 2 ? 2 : val * faktorial(val - 1);
  }

}
