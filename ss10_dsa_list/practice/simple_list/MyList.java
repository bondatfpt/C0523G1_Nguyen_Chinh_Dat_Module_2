package ss10_dsa_list.practice.simple_list;

import java.util.Arrays;

public class MyList<E>{
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList(){
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
}
