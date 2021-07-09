package DSA.LinkedList;


import DSA.LinkedList.MyLinkedList.Node;

public class ReverseALinkedList {
    public static void main(String[] args) {

        MyLinkedList<Integer> ll = new MyLinkedList<>();

        for (int i =1 ; i < 11; i++)
            ll.addAtLast(i);

        ll.print();

        Node head = ll.getHeadNode();

        Node left = null;
        Node mid = head;
        Node right = head.next;

        while (right != null){
            right = mid.next;
            mid.next = left;
            left = mid;
            mid = right;
        }
        ll.setHeadNode(left);

        ll.print();
        MyLinkedList<Integer> ml = new MyLinkedList<>();

        ml.addAtBegin(1);
        ml.addAtLast(2);
        reverseLLRecursion(ml,null,ml.getHeadNode());

        ml.print();
    }

    public static void reverseLLRecursion(MyLinkedList<Integer> ll, Node left ,Node current){

        if (current == null) {
            ll.setHeadNode(left);
            return;
        }

        Node right = current.next;
        current.next = left;
        reverseLLRecursion(ll,current,right);
    }

}
