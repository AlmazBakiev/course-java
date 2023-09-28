import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Laptops> laptopsList = new ArrayList<>();

        laptopsList.add(new Laptops("Asus", 128, "Windows", "White"));
        laptopsList.add(new Laptops("Acer", 256, "Linux", "Black"));
        laptopsList.add(new Laptops("Asus", 512, "Windows", "Yellow"));
        laptopsList.add(new Laptops("Acer", 1024, "Linux", "Brown"));
        laptopsList.add(new Laptops("Asus", 2048, "Linux", "White"));
        laptopsList.add(new Laptops("Acer", 1024, "Windows", "Black"));
        laptopsList.add(new Laptops("Asus", 1024, "Linux", "Yellow"));
        laptopsList.add(new Laptops("Acer", 1024, "Windows", "Brown"));
        laptopsList.add(new Laptops("Asus", 1024, "Linux", "White"));
        laptopsList.add(new Laptops("Acer", 1024, "Windows", "White"));

        searchByColor(laptopsList, "Black");
    }

    public static void searchByName(List<Laptops> laptopsList, String name) {
        laptopsList.stream().filter(l->l.getName().equals(name)).forEach(System.out::println);
    }

    public static void search(List<Laptops> laptopsList, Integer hDCapacity) {
        laptopsList.stream().filter(l->l.getHDCapacity().equals(hDCapacity)).forEach(System.out::println);
    }

    public static void searchByOS(List<Laptops> laptopsList, String oS) {
        laptopsList.stream().filter(l->l.getOS().equals(oS)).forEach(System.out::println);
    }

    public static void searchByColor(List<Laptops> laptopsList, String color) {
        laptopsList.stream().filter(l->l.getColor().equals(color)).forEach(System.out::println);
    }
}
