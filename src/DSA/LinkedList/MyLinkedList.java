package DSA.LinkedList;

public class MyLinkedList<E> {
    public Node head;

    public MyLinkedList(){};

    public  class Node {
        E data;
        Node next;

        public Node (E data){
            this.data = data;
            next = null;
        }
        public Node(){
            data = null;
            next = null;
        }

    }

    public Node getDummyNode(){
        return new Node();
    }

    public void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node getHeadNode(){
        return head;
    }

    public Node getLastNode(){
        if (head == null)
            return null;
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        return temp;
    }

    public void setHeadNode(Node node){
        head = node;
    }

    public void addAtBegin(E data){
        Node temp = new Node(data);
        if (head == null)
            head = temp;
        else{
            temp.next = head;
            head = temp;
        }
    }

    public void addAtLast(E data){

        Node input = new Node(data);

        if (head == null) {
            head = input;
            return;
        }

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = input;
    }

    public void addAt(int index, E data) throws IndexOutOfBoundsException {

        if (index < 0){
            throw new IndexOutOfBoundsException("Invalid index : " + index + ", for the given LinkedList");
        }

        if (index == 0) {
            addAtBegin(data);
            return;
        }

        if (head == null){
            throw new NullPointerException("Empty LinkedList");
        }

        int k =0;
        Node temp = head;

        while (k < index - 1){
            temp = temp.next;
            k++;
            if (temp == null){
                throw new IndexOutOfBoundsException("Given index : "+ index +", is greater than length of LinkedList");
            }
        }

        Node input = new Node(data);
        input.next = temp.next;
        temp.next = input;
    }

    public void deleteFirst()throws NullPointerException{
        if (head == null){
            throw new NullPointerException("Empty LinkedList");
        }

        if (head.next == null){
            head = null;
            return;
        }

        head = head.next;
        return;
    }

    public void deleteLast() throws NullPointerException{

        if (head == null){
            throw new NullPointerException("Empty LinkedList");
        }

        if (head.next == null){
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null)
            temp = temp.next;

        temp.next = null;
    }

    public void deleteAt(int index)throws IndexOutOfBoundsException{

        if (index < 0){
            throw new IndexOutOfBoundsException("Invalid index : " + index + ", for the given LinkedList");
        }

        if (head == null){
            throw new NullPointerException("Empty LinkedList");
        }

        if (index == 0) {
            deleteFirst();
            return;
        }

        int k = 0;
        Node temp = head;
        while (k < index -1){
            temp = temp.next;
            k++;
            if (temp.next == null){
                throw new IndexOutOfBoundsException("Given index : "+ index +", is greater than length of LinkedList");
            }
        }

        temp.next = temp.next.next;
    }


    public E get(int index){
        if (index < 0){
            throw new IndexOutOfBoundsException("Invalid index : " + index + ", for the given LinkedList");
        }

        if (head == null){
            throw new NullPointerException("Empty LinkedList");
        }

        int k =0;
        Node temp = head;
        while (k < index){
            k++;
            temp = temp.next;

            if (temp == null){
                throw new IndexOutOfBoundsException("Given index : "+ index +", is greater than length of LinkedList");
            }
        }

        return temp.data;
    }
}
