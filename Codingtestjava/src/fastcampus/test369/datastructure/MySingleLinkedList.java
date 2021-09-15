package fastcampus.test369.datastructure;

public class MySingleLinkedList<T> {
    public Node<T> head = null;
    // 1번째: make Node class
    public static class Node<T> {
        T data;
        Node<T> next = null;

        public Node(T data) {
            this.data = data;
        }
    }

    // 2번째: add the data
    public void addNode(T data) {
        if (head == null) {
            head = new Node<>(data);
        } else {
            Node<T> node = this.head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node<>(data);
        }
    }



    // 3번째: print all



    public static void main(String[] args) {
        MySingleLinkedList ms = new MySingleLinkedList();
        ms.addNode(2);
        ms.addNode(3);
        ms.addNode(5);

        System.out.println(ms.head.next.next.data);

    }
}
