package DSA.LinkedList;

import DSA.LinkedList.MyLinkedList.Node;

public class Merge2SortedLinkedList {
    public static void main(String[] args) {

        MyLinkedList<Integer> ll1 = new MyLinkedList<>();
        for (int i =0 ; i < 20 ; i = i+2){

            ll1.addAtLast(i);
        }
        ll1.addAtLast(34);

        MyLinkedList<Integer> ll2 = new MyLinkedList<>();
        for (int i = 1 ; i < 45 ;i = i+2){

            ll2.addAtLast(i);
        }
        ll2.addAtBegin(2);

        ll1.print();
        ll2.print();
        Node head1 = ll1.getHeadNode();
        Node head2 = ll2.getHeadNode();



        //Function starts
        Node head = ll1.getDummyNode();
        Node temp = head;
        Node lastOf1 = head;
        Node lastOf2 = head;

        while (head1 != null && head2 != null){

            if ((int)head1.data <= (int)head2.data){
                temp.next = head1;
                lastOf1 = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                lastOf2 = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        if (head1 != null)
            lastOf2.next = head1;
        else if (head2 != null)
            lastOf1.next = head2;


        ll1.setHeadNode(head.next);
        ll1.print();
    }
}
