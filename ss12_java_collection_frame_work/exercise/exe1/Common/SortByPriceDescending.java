package ss12_java_collection_frame_work.exercise.exe1.Common;
import ss12_java_collection_frame_work.exercise.exe1.model.Product;

import java.util.Comparator;

public class SortByPriceDescending implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getPrice() > o2.getPrice()){
            return -1;
        } else if (o1.getPrice()== o2.getPrice()) {
            return 0;
        }
        return 1;
    }
}
