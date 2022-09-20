package strukturdata;

public class Data {
    public String ID;
    public String Nama;

    public Data Next;
    public Data Prev;

    public Data(String ID, String Nama) {
        this.ID = ID;
        this.Nama = Nama;

        Next = null;
        Prev = null;

    }

    public static void main(String[] args) {
        Data dt1 = new Data("01", "Budi");
        Data dt2 = new Data("02", "Ali");
        Data dt3 = new Data("03", "Umar");

    }
}
