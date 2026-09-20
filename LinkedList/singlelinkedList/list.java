package LinkedList.singlelinkedList;

public class list {

    // create node

    class Node {
        String data;
        Node next;

        Node(String value) {
            data = value;
            next = null;
        }
    }

    Node head;

    // add First method

    public void addFirst(String data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    // add last method

    public void addLast(String data) {
        Node newnNode = new Node(data);

        if (head == null) {
            head = newnNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {

            temp = temp.next;

        }

        temp.next = newnNode;

    }

    // remove first node

    public void removeFirst() {

        if (head == null) {
            System.out.println("list is empty");
        }

        head = head.next;
    }

    // remove last node
    public void removeLst() {
        if (head == null) {
            System.out.println("list is empty ");

        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    // get first node
    public void getFirst() {
        if (head == null) {
            System.out.println("list is empty");
        } else {
            System.out.println(head.data);
        }
    }

    //get last node
    public void getLast () {

        if (head == null ) {
            System.out.println("list is empty");
        }

        Node temp = head;
        while (temp.next !=null) {
            temp = temp.next;
        }

        System.out.println(temp.data);
         
    }

    // show the list (show method)

    public void show() {
        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data + "-->");
            temp = temp.next;

        }

    }

    public static void main(String[] args) {
        list listedlist = new list();
        listedlist.addFirst("2");
        listedlist.addFirst("1");
        listedlist.addLast("3");
        listedlist.removeFirst();
        listedlist.removeLst();

        listedlist.show();

    }

}
