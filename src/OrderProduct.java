

public class OrderProduct {
    private Product product;
    private int howMany;
    private double discount;
    private boolean orderedByClient;


    public OrderProduct(Product product, int howMany, double discount) {
        this.product = product;
        this.howMany = howMany;
        this.discount = discount;

    }
    public OrderProduct(Product product, int howMany, double discount, boolean orderedByClient) {
        this.product = product;
        this.howMany = howMany;
        this.discount = discount;
        this.orderedByClient = orderedByClient;
    }
    public int getHowMany() {
        return howMany;
    }
    public double getDiscount() {
        return discount;
    }
    public int getPrice() {
        return product.getPrice();
    }

    public double totalPrice(int price) {
        return howMany * product.getPrice() * (1 - discount);
    }
    public Product getProduct() {
        return product;
    }

    public String toString() {
        return "Product: " + product + ",discount: " + discount + " total price " + totalPrice(product.getPrice());
    }

    public void setHowMany(int howMany) {
        this.howMany = howMany;
    }
}
