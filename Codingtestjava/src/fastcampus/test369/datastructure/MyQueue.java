package fastcampus.test369.datastructure;

import java.util.ArrayList;

public class MyQueue<T> {
    //- JAVA ArrayList 클래스를 활용해서 큐를 다루는 enqueue, dequeue 기능 구현해보기
    //- dequeue 기능 호출 시, 큐에 데이터가 없을 경우, null 을 리턴하도록 함
    //- 다양한 데이터 타입을 다룰 수 있도록, Java Genric 타입 문법을 활용해보기

    private ArrayList<T> queue = new ArrayList<>();

    public void enqueue(T item) {
        queue.add(item);
    }

    public T dequeue() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.remove(0);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public ArrayList<T> getQueue() {
        return queue;
    }

    public static void main(String[] args) {
        MyQueue<Integer> mq = new MyQueue<Integer>();

        mq.enqueue(3);
        mq.enqueue(5);
        mq.enqueue(6);
        System.out.println("mq.getQueue() = " + mq.getQueue());
        System.out.println("mq = " + mq.dequeue());
        System.out.println("mq = " + mq.dequeue());
        System.out.println("mq = " + mq.dequeue());
    }
}
