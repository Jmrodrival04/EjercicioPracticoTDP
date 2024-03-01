package org.example;

public interface IOrderManager {
    void createOrder(Object orderDetails);
    void updateOrder(Object orderDetails);
    void deleteOrder(String orderId);
}
