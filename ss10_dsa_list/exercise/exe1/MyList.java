package ss10_dsa_list.exercise.exe1;

import java.util.Arrays;
import java.util.List;

public class MyList<E>{
    private int size;
    public static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList(int size){
        this.size = size;
    }
    public MyList(){
        System.out.println("OK");
        elements = new Object[DEFAULT_CAPACITY];
    }
    public void ensureCapacity(){
        int newSize = elements.length * 2;
        Arrays.copyOf(elements,newSize);
    }
    public void add (E e){
        if(size == elements.length){
            ensureCapacity();
        }
        elements[size++] = e;
    }
    public E get(int i){
        if(i >= size || i < 0){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + i);
        }
        return (E) elements[i];
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
