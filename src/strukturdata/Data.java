package strukturdata;

public class Data {

    // Property atau variabel Global
    public String id;
    public String nama;

    public Data next;
    public Data prev;

    public Data(String id, String nama) { // variabel di dalam kurung disebut argumen atau parameter dan merupakan
                                          // variabel lokal

        // Keyword 'this' untuk membedakan mana variabel global dan mana yang lokal
        this.id = id;
        this.nama = nama;

        // nilai awal
        next = null;
        prev = null;

    }

    public static void main(String[] args) {
        Data dt1 = new Data("01", "Budi");
        Data dt2 = new Data("02", "Ali");
        Data dt3 = new Data("03", "Umar");

    }
}
