package DSA.LinkedList;

import DSA.LinkedList.MyLinkedList.Node;

public class ApplyMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer> ll = new MyLinkedList<>();
        ll.addAtBegin(33);
        ll.addAtBegin(44);
        ll.addAtBegin(56);
        ll.addAtLast(99);
        ll.addAtLast(100);

        ll.addAt(0,10);
        ll.addAt(2,25);
        ll.addAt(5,1000);
        ll.addAt(8,999);
        ll.print();

        ll.deleteFirst();
        ll.deleteLast();
        ll.print();

        ll.deleteAt(2);
        ll.deleteAt(4);
        ll.deleteAt(4);
        ll.print();
        ll.deleteAt(0);
        ll.print();

        System.out.println(ll.get(0));
        System.out.println(ll.get(1));
        System.out.println(ll.get(2));
//        System.out.println(ll.get(3));


        Node head =  ll.getHeadNode();
        System.out.println(head.data);
        System.out.println(head.next.next.data);

    }
}
