import java.util.Arrays;

public class MyStack<E> {
    private MyList<E> arr;
    private int capacity;

    public MyStack() {
        arr = new MyList<>();
    }

    public MyStack(int capacity) {
        this.capacity = capacity;
        arr = new MyList<>(this.capacity);
    }
    public boolean isEmpty(){
        return size() == 0;
    }
    public boolean isFull(){
        return size()+1 == capacity;
    }

    public int size() {
        return arr.size();
    }

    public void push(E element){
        if (isFull()){
            System.out.println("Stack is full");
        }
        else{
            arr.add(element);
        }
    }
    public E pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Stack is null");
        }
        return arr.remove();
    }
//    public String toString(){
//        return Arrays.toString(Arrays.toString();
//    }

}
