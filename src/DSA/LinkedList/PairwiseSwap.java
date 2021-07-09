package DSA.LinkedList;
import DSA.LinkedList.MyLinkedList.Node;

public class PairwiseSwap {
    public static void main(String[] args) {
        MyLinkedList<Integer> ll = new MyLinkedList<>();

        for (int i =0; i < 20 ;i++){
            ll.addAtLast(i);
        }

        Node head = ll.getHeadNode();

        if (head == null || head.next == null){
            ll.print();
            return;
        }

        //First swapping
        Node current = head.next.next;
        Node previous = head;
        head = head.next; // new head set
        head.next = previous; // first swapping

        while (current != null && current.next != null){
            previous.next = current.next;

            Node next = current.next.next;

            //Swapping
            current.next.next = current;

            previous = current;
            current = next;
        }

        previous.next = current;
        ll.setHeadNode(head);
        ll.print();
    }
}
