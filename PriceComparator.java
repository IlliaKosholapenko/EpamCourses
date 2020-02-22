import java.util.Comparator;

public class PriceComparator implements Comparator {

    @Override
    public int compare(Object obj1, Object obj2) {
        double price1 = ((Task6_Book) obj1).getPrice();
        double price2 = ((Task6_Book) obj2).getPrice();
        return (int)(price2-price1) ;
    }
}
