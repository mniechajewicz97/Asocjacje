import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private String surname;
    private String email;
    private List<Order> ordersClient = new ArrayList<>();

    public Client(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;

    }
    public void addOrder(Order order) {
        ordersClient.add(order);
    }
    public void removeOrder(Order order) {
        ordersClient.remove(order);
    }
    public List<Order> getOrdersClient() { return ordersClient; }


}
