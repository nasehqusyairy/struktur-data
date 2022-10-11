package StackDanQueue;

public class Data {

    public String id;
    public String nama;

    public Data next;
    public Data prev;

    public Data(String id, String nama) {
        this.id = id;
        this.nama = nama;

        next = null;
        prev = null;

    }
}
