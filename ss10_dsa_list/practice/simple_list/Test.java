package ss10_dsa_list.practice.simple_list;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);
        listInteger.add(6);
        listInteger.add(7);
        listInteger.add(8);
        listInteger.add(9);
        System.out.println(listInteger.get(0));
        System.out.println(listInteger.get(8));
        System.out.println(listInteger.get(6));
        listInteger.ensureCapacity();
    }
}
