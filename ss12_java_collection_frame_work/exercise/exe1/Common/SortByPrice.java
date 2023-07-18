package ss12_java_collection_frame_work.exercise.exe1.Common;
import java.util.Comparator;
import ss12_java_collection_frame_work.exercise.exe1.model.Product;


public class SortByPrice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getPrice() > o2.getPrice()){
            return 1;
        } else if (o1.getPrice() == o2.getPrice()) {
            return 0;
        }
        else
            return -1;
    }
}
