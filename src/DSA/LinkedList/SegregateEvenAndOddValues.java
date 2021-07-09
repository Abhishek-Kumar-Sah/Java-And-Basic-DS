package DSA.LinkedList;

import DSA.LinkedList.MyLinkedList.Node;

public class SegregateEvenAndOddValues {
    public static void main(String[] args) {

        MyLinkedList<Integer> ll = new MyLinkedList<Integer>();

        for (int i =0; i< 20 ;i++)
            ll.addAtLast(i);

        ll.addAt(4,9);
        ll.addAt(4,9);
        ll.addAt(13,35);
        ll.addAt(16,38);
        ll.print();


        Node even = ll.getDummyNode();
        Node odd = ll.getDummyNode();
        Node evenHead = null;
        Node oddHead = null;
        Node temp = ll.getHeadNode();

        boolean evenHeadSet = false;
        boolean oddHeadSet = false;

        while (temp != null){
            Node next = temp.next;
            if ((int)temp.data % 2 == 0){
                even.next = temp;
                even = even.next;
                if (!evenHeadSet){
                    evenHead = even;
                    evenHeadSet = true;
                }
            }else{
                odd.next = temp;
                odd = odd.next;
                if (!oddHeadSet){
                    oddHead = odd;
                    oddHeadSet = true;
                }
            }
            temp = next;
        }

        even.next = oddHead;
        if (evenHead != null)
            ll.setHeadNode(evenHead);
        else
            ll.setHeadNode(oddHead);

        ll.print();
    }
}
