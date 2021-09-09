package fastcampus.test369.datastructure;

public class MySingleLinkedList<T> {
    public Node<T> head = null;

    public static class Node<T> {
        T data;
        Node<T> next = null;

        public Node(T data) {
            this.data = data;
        }
    }

    public void addNode(T data) {
        if (head == null) {
            head = new Node<>(data);
        }
    }

    public static void main(String[] args) {
//        Node<Integer> myNode1, myNode2;
//        myNode1 = new Node<Integer>(1);
//        myNode2 = new Node<Integer>(2);
//        myNode1.next = myNode2;


    }
}
