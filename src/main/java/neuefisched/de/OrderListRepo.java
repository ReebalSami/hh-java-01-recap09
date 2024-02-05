package neuefisched.de;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OrderListRepo {

    //properties:
    private List<Order> orderList = new ArrayList<>();


    //constructor
    public OrderListRepo() {
        this.orderList = orderList;
    }
    //getter & setter

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    //equals hash

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderListRepo that = (OrderListRepo) o;
        return Objects.equals(orderList, that.orderList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderList);
    }

    @Override
    public String toString() {
        return "OrderListRepo{" +
                "orders=" + orderList +
                '}';
    }



    public void addOrder(Order order){
     orderList.add(order);
    }

    public void removeOrder(Order order){
        orderList.remove(order);
    }

    public Order getOrderById(String id){
        for (Order order : orderList){
            if (order.orderID().equals(id)){
                return order;

            }
        }
        return null;
    }

    public List<Order> getAllOrders(){
        return new ArrayList<>(orderList);
    }
}



