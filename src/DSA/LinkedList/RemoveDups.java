package DSA.LinkedList;
import DSA.LinkedList.MyLinkedList.Node;

public class RemoveDups {
    public static void main(String[] args) {

        MyLinkedList<Integer> ll = new MyLinkedList<>();

        for (int i =1 ; i < 5; i++){
            ll.addAtLast(i);
            ll.addAtLast(i);
            ll.addAtLast(i);
        }
        ll.addAtLast(6);

        ll.print();

        Node i = ll.getHeadNode(), j = ll.getHeadNode();

        while (j != null){

            if (j.data != i.data){
                i.next = j;
                i = j;
            }

            j = j.next;
        }

        i.next = null;
        ll.print();
    }
}
