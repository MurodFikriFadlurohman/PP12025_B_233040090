package Pertemuan3;

public class ListMain {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addHead(7);
        list.addHead(5);
        list.addHead(4);
        list.addHead(1);

        System.out.print("Elemen: ");
        list.displayElement();
    }
}
