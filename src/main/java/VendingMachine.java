public interface VendingMachine {
    Product getProduct(String name, int volume, int temperature);
}