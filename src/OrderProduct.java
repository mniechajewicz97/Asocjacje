

public class OrderProduct {
    private Product product;
    private int howMany;
    private double discount;

    public OrderProduct(Product product, int howMany, double discount) {
        this.product = product;
        this.howMany = howMany;
        this.discount = discount;
    }
    public int getHowMany() {
        return howMany;
    }
    public double totalPrice() {
        return howMany * product.getPrice() * (1 - discount);
    }
    public Product getProduct() {
        return product;
    }

    public String toString() {
        return "Product: " + product + ",discount: " + discount + " total price " + totalPrice();
    }
    public void setHowMany(int howMany) {
        this.howMany = howMany;
    }
}
