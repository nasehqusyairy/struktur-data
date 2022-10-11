package StackDanQueue;

// class untuk menampung data dengan konsep FIFO, dimana data yang masuk pertama, akan keluar pertama pula
// dalam konsep ini, data yang masuk paling awal akan ditandai sebagai head, sedangkan yang masuk paling akhir, akan ditandai sebagai tail.
// Maka setiap kali ada data baru yang masuk, tail akan bergeser
public class Queue {
  // property untuk menandai data yang paling depan
  public Data head = null;

  // property untuk menandai data yang masuk paling akhir
  public Data tail = null;

  // method untuk menambahkan data dan menggeser tail
  public void add(Data node) {
    if (head == null && tail == null) { // jika head maupun tail masih kosong, maka isi keduanya dengan data yang baru
      head = node;
      tail = node;
    } else {
      // beri tahu program bahwa data baru akan tersedia sebagai next
      tail.next = node;

      // geser tail
      tail = node;
    }
  }

  // method untuk mengeluarkan data
  // berdasarkan konsep, data yang akan keluar adalah data yang paling awal masuk,
  // yaitu yang ditandai sebagai head
  public Data get() {
    if (head == null)
      // jika head masih kosong, maka tampilkan kosong
      return null;

    // jika head tidak kosong...
    // tampung nilai head ke dalam variabel sementara (tmp)
    // tujuannya agar nilai di dalamnya siap dikeluarkan
    // tanpa dirusak oleh program berikutnya
    Data tmp = head;

    // karena nilai head akan dikeluarkan, maka data yang akan menggantikannya
    // adalah data setelahnya
    head = head.next;

    // karena variabel tmp berisi nilai yang paling depan (masuk paling awal
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
