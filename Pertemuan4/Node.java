package Pertemuan4;

public class Node {
    private int data;
    private Node next;

    /* Inisialisasi atribut node */
    public Node(int data) {
        this.data = data;
    }

    /* Setter dan Getter */
    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
