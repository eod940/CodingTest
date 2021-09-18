package fastcampus.test369.datastructure;

public class DoubleLinkedList<T> {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> MyLinkedList = new DoubleLinkedList<Integer>();

        MyLinkedList.addNode(1);
        MyLinkedList.addNode(2);
        MyLinkedList.addNode(3);
        MyLinkedList.addNode(4);
        MyLinkedList.addNode(5);
        MyLinkedList.printAll();
        System.out.println("----------------");

        MyLinkedList.insertToFront(3, 2);
        MyLinkedList.printAll();
        System.out.println("----------------");

        MyLinkedList.insertToFront(6, 2);
        MyLinkedList.insertToFront(1, 0);
        MyLinkedList.printAll();
        System.out.println("----------------");

        MyLinkedList.addNode(6);
        MyLinkedList.printAll();
    }
    public Node<T> head = null;
    public Node<T> tail = null;

    public class Node<T> {
        T data;
        Node<T> next = null;
        Node<T> prev = null;

        public Node(T data) {
            this.data = data;
        }
    }

    public void addNode(T data) {
        if (this.head == null) {
            this.head = new Node<>(data);
            this.tail = this.head;
        } else {
            Node<T> node = this.head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node<>(data);
            node.next.prev = node;
            this.tail = node.next;
        }
    }

    public void printAll() {
        if (head != null) {
            Node<T> node = this.head;
            System.out.println(node.data);
            while (node.next != null) {
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public T searchFromHead(T isData) {
        if (this.head != null) {
            Node<T> node = this.head;
            while (node.next != null) {
                if (node == isData){
                    return node.data;
                } else {
                    node = node.next;
                }
            }
        }
        return null;
    }

    public Node<T> searchFromTail(T isData) {
        if (this.head != null) {
            Node<T> node = this.tail;
            while (node != null) {
                if (node.data == isData) {
                    return node;
                } else {
                    node = node.prev;
                }
            }
        }
        return null;
    }

    public boolean insertToFront(T data, T isData) {
        if (this.head == null) {
            this.head = new Node<>(isData);
            this.tail = this.head;
            return true;
        } else if (this.head.data == data) {
            Node<T> newHead = new Node<>(isData);
            newHead.next = this.head;
            this.head = newHead;
            return true;
        } else {
            Node<T> searchedNode = searchFromTail(data);

            if (searchedNode == null) {
                return false;
            }
            Node<T> nodePrev = searchedNode.prev;
            nodePrev.next = new Node<>(isData);
            nodePrev.next.next = searchedNode;

            nodePrev.next.prev = nodePrev;
            searchedNode.prev = nodePrev.next;
            return true;
        }
    }
}
