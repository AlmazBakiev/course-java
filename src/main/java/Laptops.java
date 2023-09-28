public class Laptops {

    private String name;
    private Integer hDCapacity;
    private String oS;
    private String color;

    public Laptops(String name, Integer hDCapacity, String oS, String color) {
        this.name = name;
        this.hDCapacity = hDCapacity;
        this.oS = oS;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Integer getHDCapacity() {
        return hDCapacity;
    }

    public String getOS() {
        return oS;
    }

    @Override
    public String toString() {
        return this.getName() + ", " + this.getHDCapacity() + ", " + this.getOS() + ", " + this.getColor();
    }

    public String getColor() {
        return color;
    }
}
