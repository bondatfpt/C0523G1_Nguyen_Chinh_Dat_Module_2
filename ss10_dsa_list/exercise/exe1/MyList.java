package ss10_dsa_list.exercise.exe1;

import model_view_controller.customer_management.service.ICustomerService;

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
        System.out.println("Khởi tạo thành công với size = 10");
        elements = new Object[DEFAULT_CAPACITY];
    }
    // Phương thức tăng size với tham số đầu vào là 1 số nguyên;
    public void ensureCapacity(int capacity){
       if(capacity >= 0){
           int newSize = this.elements.length + capacity;
           elements = Arrays.copyOf(elements,newSize);
       }
       else {
           throw new IllegalArgumentException("capacity: " + capacity);
       }
    }
    //Phuơng thức thêm 1 phần tử vào cuối mảng;
    public void add (E e){
        if(size == elements.length){
            ensureCapacity(1);
        }
        elements[size++] = e;
    }
    // Phương thức lấy ra một phần tử tại vị trí chỉ định;
    public E get(int i){
        if(i >= size || i < 0){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + i);
        }
        return (E) elements[i];
    }
    // Phương thức trả về độ dài của mảng;
    public int length(){
        return elements.length;
    }
    // Phương thức trả về size;
    public int size(){
        return size;
    }
    // Phương thức thêm 1 phần tử vào 1 vị trí chỉ định;
    public void add(E e, int index){
        if(index > elements.length){
            throw new IllegalArgumentException("Lỗi index: " + index);
        }
        else if(elements.length == index + 1){
            ensureCapacity(1);
        }
        if (elements[index] == null){
            elements[index] = e;
            size++;
        }
        else{
            if(size == elements.length){
                ensureCapacity(1);
            }
            System.arraycopy(elements,index,elements,index+1,size-index);
            elements[index] = e;
            size++;
        }
    }
    // Phương thức xóa 1 phần tử tại vị trí index;
    public E remove(int index){
        if(index < 0 || index > elements.length){
            throw new IllegalArgumentException("Lỗi index: " + index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size -1 ; i++) {
            elements[i] = elements[i+1];
        }
        elements[size-1] = null;
        size--;
        return element;
    }
    // Phương thức tạo ra 1 bản sao;
    public MyList<E> clone(){
        MyList<E> arrClone = new MyList<>();
        arrClone.elements = Arrays.copyOf(elements,size);
        arrClone.size = size;
        return arrClone;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
