package com.foodPlaza.Dao;

import java.util.List;

import com.foodPlaza.Pojo.Order;

public interface OrderDao {
Order placeOrder(String emailId);
Order showOrder(String emailId);
List<Order>showAllOrder();
boolean deleteByOrderId(int orderId);


}
