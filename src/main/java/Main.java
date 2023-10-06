import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<HotDrinks> listProduct = new ArrayList<>();
        listProduct.add(new HotDrinks("OOPSeminar", 7, 2, 45));
        listProduct.add(new HotDrinks("Seminar", 3, 6, 35));
        listProduct.add(new HotDrinks("OOP", 5, 3, 25));

        HotDrinksVendingMachine vendingMachine = new HotDrinksVendingMachine(listProduct);
        System.out.println(vendingMachine.getProduct("OOPSeminar", 2, 45));
        System.out.println(vendingMachine.getProduct("Seminar", 6));
    }
}
