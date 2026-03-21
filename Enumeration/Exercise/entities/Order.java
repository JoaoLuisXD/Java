package Enumeration.Exercise.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> orders = new ArrayList<>();

    public Order(Date moment, OrderStatus status, Client client){
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }
    public List<OrderItem> getOrders() {
        return orders;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public void setMoment(Date moment) {
        this.moment = moment;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item){
        orders.add(item);
    }

    public void removeItem(OrderItem item){
        orders.remove(item);
    }

    public Double total(){
        Double cont = 0.0;
        for (OrderItem o : orders) {
            cont += o.subTotal();         
        }
        return cont;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY:\n");
        sb.append("Order moment: ");
        sb.append(sdf.format(moment));
        sb.append("\nOrder status: ");
        sb.append(status);
        sb.append("\nClient: ");
        sb.append(client.toString());
        sb.append("\nOrder items:\n");
        for (OrderItem o : orders) {
            sb.append(o + "\n");
        }
        sb.append("Total price: $");
        sb.append(total());
        return sb.toString();
    }
}
