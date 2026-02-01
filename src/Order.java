import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {

    List<OrderProduct> orderList = new ArrayList<>();

    public void addOrderProduct(OrderProduct orderProduct, int howMany) {

        for (OrderProduct op : orderList) {
            if (op.getProduct().equals(orderProduct.getProduct())) {
                op.setHowMany(op.getHowMany() + howMany);
                return;
            }
        }
        orderList.add(orderProduct);
    }

    public List<OrderProduct> getOrderList() {
        return orderList;
    }
    public void setOrderList(List<OrderProduct> orderList) {
        this.orderList = orderList;

    }
}
