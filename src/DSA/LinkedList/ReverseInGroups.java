package DSA.LinkedList;
import DSA.LinkedList.MyLinkedList.Node;
public class ReverseInGroups {
    public static void main(String[] args) {

        MyLinkedList<Integer> ll = new MyLinkedList<>();

        for (int i=1; i < 20; i++){
            ll.addAtLast(i);
        }
        ll.print();

        ll.setHeadNode(revRecursive(ll,ll.getHeadNode(),3));
        ll.print();

        ll.setHeadNode(revInGroups(ll,ll.getHeadNode(),3));
        ll.print();

    }

    public static Node revRecursive(MyLinkedList<Integer> ll , Node head,int k){

        Node prev = null, current = head, next = null;

        int count = 0;
        while (current != null && count < k){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        if (current != null){
            Node restHead = revRecursive(ll,current,k);
            head.next = restHead;
        }

        return prev;
    }


    public static Node revInGroups(MyLinkedList<Integer> ll,Node head,int k){

        Node prev = null, current = head, next = null, newHead = null;
        Node prevFirst = null;

        boolean headSet = false;
        while (current != null) {
            int count = 0;

            Node currentFirst = current;
            prev = null;

            while (current != null && count < k) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                count++;
            }

            if (headSet == false){
                newHead = prev;
                headSet = true;
            }else {
                prevFirst.next = prev;
            }

            prevFirst = currentFirst;

        }

        return newHead;
    }
}
