package fastcampus.test369.datastructure;

import java.util.ArrayList;

public class MyStack<T> {
    //- JAVA ArrayList 클래스를 활용해서 스택을 다루는 push, pop 기능 구현해보기
    //- pop 기능 호출 시, 스택에 데이터가 없을 경우, null 을 리턴하도록 함
    //- 다양한 데이터 타입을 다룰 수 있도록, Java Genric 타입 문법을 활용해보기
    private ArrayList<T> stack = new ArrayList<>();
    
    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.remove(stack.size() - 1);
    }
    
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public ArrayList<T> getStack() {
        return stack;
    }

    public static void main(String[] args) {
        MyStack<Integer> ms = new MyStack<>();

        ms.push(2);
        System.out.println("ms.getStack() = " + ms.getStack());
        ms.push(3);
        System.out.println("ms.getStack() = " + ms.getStack());
        ms.push(4);
        System.out.println("ms.getStack() = " + ms.getStack());
        System.out.println("ms.pop() = " + ms.pop());
        System.out.println("ms.getStack() = " + ms.getStack());
        System.out.println("ms.pop() = " + ms.pop());
        System.out.println("ms.getStack() = " + ms.getStack());
        System.out.println("ms.pop() = " + ms.pop());
    }
}
