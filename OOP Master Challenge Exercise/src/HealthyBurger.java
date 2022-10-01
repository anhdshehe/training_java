public class HealthyBurger extends Hamburger{
    @Override
    public int getMaxAdditionalSize() {return 2;}

    public HealthyBurger(String meat, double price) {
        super("Healthy", "Brown rye", meat, price);
    }
}
