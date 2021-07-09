package DSA.LinkedList;
import DSA.LinkedList.MyLinkedList.Node;

public class PalindromeCheck {
    public static void main(String[] args) {

        MyLinkedList<Integer> ll = new MyLinkedList<>();

        for (int i = 0 ; i< 10 ; i++){
            ll.addAtBegin(i);
            ll.addAtLast(i);
        }
        ll.print();
        Node head = ll.getHeadNode();


        //Function starts
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //Reverse ll from slow.next to last

        Node prev = null;
        Node current = slow.next;
        Node next = null;

        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        slow.next = prev;
        // ll reversed after slow.next to end
        slow = prev;
        while (slow != null){
            if (head.data != slow.data){
                System.out.println("False");
                return;
            }
            head = head.next;
            slow = slow.next;
        }
        System.out.println("True");

    }
}
