package strukturdata;

// class untuk menampung data dengan konsep FILO, dimana data yang masuk pertama, akan keluar paling akhir
// dalam konsep ini, data yang masuk paling akhir akan ditandai sebagai head. Maka setiap kali ada data baru yang masuk, head akan bergeser

// Maka data terdepan hanya memiliki 'next' dan data paling belakang hanya memiliki 'prev'
public class Stack {
  // property untuk menandai data paling depan (yang masuk paling akhir)
  public Data head = null;

  // property untuk menandai data yang masuk paling awal
  public Data tail = null;

  // method untuk menambahkan data dan menggeser head
  public void push(Data node) {
    if (head == null && tail == null) {
      head = node;
      tail = node;
    } else {
      // nilai head akan ditandai sebagai next, untuk menghindari eror,
      // tampung head ke dalam variabel sementara (tmp)
      Data tmp = head;

      // beri tahu program bahwa data baru akan tersedia sebagai prev
      head.prev = node;

      // geser head
      head = node;

      // ingat untuk menandai nilai head sebelumnya sebagai next
      head.next = tmp;
    }
  }

  // method untuk mengeluarkan data
  // berdasarkan konsep, data yang akan keluar adalah data yang masuk paling akhir
  // yaitu yang ditandai sebagai head
  public Data pop() {
    if (head == null)
      // jika head masih kosong, maka tampilkan kosong
      return null;

    // jika head tidak kosong...
    // tampung nilai head ke dalam variabel sementara (tmp)
    // tujuannya agar nilai di dalamnya siap dikeluarkan
    // tanpa dirusak oleh program berikutnya
    Data tmp = head;

    // harusnya, karena data terdepan lepas, maka data tersebut tidak punya 'next'
    // dan data yang ditandai sebagai head tidak memiliki 'prev'
    // sesuai pada konsep yang dijelaskan di baris 6

    // hilangkan 'prev' pada head
    head.prev = null;

    // geser head
    head = head.next;

    // hilangkan 'next' pada tmp
    tmp.next = null;

    // karena variabel tmp berisi nilai yang paling depan (masuk paling akhir
    // berdasarkan konsep),
    // maka variabel inilah yang akan dikeluarkan
    return tmp;
  }

  // method yang otomatis dijalankan ketika melakukan print ke konsol
  @Override
  public String toString() {
    String tmp = "";
    Data Node = head;
    while (Node != null) {
      tmp += Node.nama + " ";
      Node = Node.next;
    }
    return tmp;
  }

}
