public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity] ;
    }
    private Object[] copyArray(Object[] e, int size){
        Object[] newArr = new Object[size];
        for (int i = 0; i < e.length; i++) {
            newArr[i] = e[i];
        }

        return newArr;
    }

    public int size() {
        return size;
    }

    private void ensureCapa() {

        int newSize = elements.length + 1;
        elements = copyArray(elements, newSize);
    }
    public void add(E e){
        if (size == elements.length){
            ensureCapa();
        }
        elements[size++] = e;
    }
    public E get(int index){
        return (E)elements[index];
    }
    public E remove(){
       E element = (E)elements[size-1];
       Object[] newarr = new Object[--size];
        for (int i = 0; i < size; i++) {
            newarr[i] = elements[i];
        }
       return element;
    }
}
