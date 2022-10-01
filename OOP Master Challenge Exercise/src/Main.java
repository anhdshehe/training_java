public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Hamburger hamburger = new Hamburger("Basic", "White", "Sausage", 3.56);
        hamburger.addAdditional("Tomato", 0.27);
        hamburger.addAdditional("Lettuce", 0.75);
        hamburger.addAdditional("Cheese", 1.13);
        hamburger.addAdditional("Cheese", 1.13);
        hamburger.addAdditional("Cheese", 1.13);
        hamburger.print();

        HealthyBurger healthyHamburger = new HealthyBurger("Chicken", 4.23);
        healthyHamburger.addAdditional("Lettuce", 0.75);
        healthyHamburger.addAdditional("Cheese", 1.13);
        healthyHamburger.addAdditional("Cheese", 1.13);
        healthyHamburger.print();
    }
}