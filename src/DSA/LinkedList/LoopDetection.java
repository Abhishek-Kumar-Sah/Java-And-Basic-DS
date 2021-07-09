package DSA.LinkedList;
import DSA.LinkedList.MyLinkedList.Node;

public class LoopDetection {
    public static void main(String[] args) {

        MyLinkedList<Integer> ll = new MyLinkedList<>();

        for (int i =1; i< 20 ; i++)
            ll.addAtLast(i);

        ll.getLastNode().next = ll.getHeadNode().next.next.next;

          // Method 1- LinkedList gets destroyed

//        Node temp = ll.getHeadNode();
//        Node dummy = ll.getDummyNode();
//
//        if (temp.next == temp){
//            System.out.println("Loop detected");
//            return;
//        }
//
//        while (temp != null){
//
//            if (temp.next == dummy) {
//                System.out.println("Loop detected");
//                return;
//            }else{
//                Node next = temp.next;
//                temp.next = dummy;
//                temp = next;
//            }
//        }
//        System.out.println("Loop not detected");


        //Method 2 - Floyd cycle detection

        Node slow = ll.getHeadNode();
        Node fast = ll.getHeadNode();

        while (fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                System.out.println("Loop detected");
                return;
            }
        }

        System.out.println("Loop not detected");
    }
}
