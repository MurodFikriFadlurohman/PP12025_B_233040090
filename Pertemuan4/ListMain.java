package Pertemuan4;

import Pertemuan3.StrukturList;

public class ListMain {
    public static void main(String[] args) {
        Pertemuan3.StrukturList list = new StrukturList();
        list.addTail(4);
        list.addTail(5);
        list.addMid(5, 2);
        list.addMid(5, 2);
        list.addMid(4, 2);
        list.addMid(1, 2);
        list.addMid(1, 2);
        list.addMid(1, 2);
        list.addMid(2, 2);
        list.addHead(3);

        System.out.print("Elemen: ");
        list.displayElement();
    }
}
