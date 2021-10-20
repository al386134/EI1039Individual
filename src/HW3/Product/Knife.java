package HW3.Product;

public abstract class Knife {
    public String name;
    public void sharpen() {
        System.out.println("sharpen");
    }
    public void polish() {
        System.out.println("polish");
    }
    public void wrapp() {
        System.out.println("wrapp");
    }
    public String getName() {
        return name;
    }
}