package ss10_dsa_list.exercise.exe1;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Double> myList = new MyList();
        myList.add(5d);
        System.out.println(myList.get(0));
        System.out.println(myList.toString());
        myList.add(6d,2);
        System.out.println(myList.toString());
        myList.remove(2);
        System.out.println(myList.toString());
    }
}
