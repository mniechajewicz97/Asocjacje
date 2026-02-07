import java.util.ArrayList;
import java.util.List;

public class Order {
    private Client client;
    List<OrderProduct> orderList = new ArrayList<>();

    public Order() {
        }
    public Order(Client client) {
        client.addOrder(this);
        this.client = client;
    }

    public void addOrderProduct(OrderProduct orderProduct) {

        for (OrderProduct op : orderList) {
            if (op.getProduct().equals(orderProduct.getProduct())) {
                op.setHowMany(op.getHowMany() + orderProduct.getHowMany());
                return;
            }
        }
        orderList.add(orderProduct);
    }


    public List<OrderProduct> getOrderList() {
        return orderList;
    }

    public Client getClient() { return client; }


}
