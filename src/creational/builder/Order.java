package src.creational.builder;

import src.creational.factory.domain.Product;

import java.util.List;

public class Order {
    private List<Product> products;
    private int quantity;
    private int orderId;
    private String orderName;
    private double totalPrice;

    private Order(OrderBuilder builder) {
        this.products = builder.products;
        this.quantity = builder.quantity;
        this.orderId = builder.orderId;
        this.orderName = builder.orderName;
        this.totalPrice = builder.totalPrice;
    }

    public List<Product> getProducts() {
        return products;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public static class OrderBuilder {
        private final List<Product> products;
        private final int quantity;
        private int orderId;
        private String orderName;
        private final double totalPrice;

        public OrderBuilder(List<Product> products, int quantity, double totalPrice) {
            this.products = products;
            this.quantity = quantity;
            this.totalPrice = totalPrice;
        }

        public void setOrderId(int id) {
            this.orderId = id;
        }

        public void setOrderName(String name) {
            this.orderName = name;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
