import java.util.ArrayList;

public class Hamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private double price;
    private double totalPrice;
    public int getMaxAdditionalSize() {return 4;}
    private ArrayList<Additional> additions = new ArrayList<>();

    public ArrayList<Additional> getAdditions() {
        return additions;
    }

    public void setAdditions(ArrayList<Additional> additions) {
        this.additions = additions;
    }
    public Hamburger(String name, String breadRollType, String meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getRollType() {
        return breadRollType;
    }

    public void setRollType(String rollType) {
        this.breadRollType = rollType;
    }

    public void addAdditional(String name, double price) {
        if (this.additions.size() == this.getMaxAdditionalSize()) {
            return;
        }
        this.additions.add(new Additional(name, price));
    }
    public void print(){
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll type is " + this.price);
        this.totalPrice = this.price;

        for (Additional addition: this.additions) {
            System.out.println("Added " + addition.name + " for an extra " + addition.price);
            this.totalPrice += addition.price;
        }

        System.out.println("Total price is " + this.totalPrice);
    }
}
