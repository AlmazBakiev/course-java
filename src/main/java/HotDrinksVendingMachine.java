import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine {
    List<HotDrinks> productList;

    public List<HotDrinks> getProductList() {
        return productList;
    }

    public void setProductList(List<HotDrinks> productList) {
        this.productList = new ArrayList<>(productList);
    }

    public HotDrinksVendingMachine(List<HotDrinks> productList) {
        this.productList = productList;
    }
    public HotDrinks getProduct(String name, int volume) {
        for (HotDrinks hotDrinks : productList) {
            if (hotDrinks.getName().equals(name) && hotDrinks.getVolume() == volume) {
                return hotDrinks;
            }
        }
        return null;
    }
    @Override
    public Product getProduct(String name, int volume, int temperature) {
        for (Product product : productList){
            if(product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }

    public void addHotDrinks(HotDrinks hotDrinks){
        this.productList.add(hotDrinks);
    }
}
