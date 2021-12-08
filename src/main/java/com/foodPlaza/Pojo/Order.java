package com.foodPlaza.Pojo;


public class Order 
{
	
private int orderId;
	
private String orderDate;
	
private double totalBill;
	
private String emailId;
	
public Order()
	
{
		
	
}
	
Order(int orderId,String orderDate,double totalBill,String emailId)
	
{
		
this.orderId=orderId;
		
this.orderDate=orderDate;
		
this.totalBill=totalBill;
		
this.emailId=emailId;
	
}
	

@Override
	
public String toString() 
{
		
return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ","
+ " totalBill=" + totalBill + ", emailId="
+ emailId + "]";
	
}
	
public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public double getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	
	

}
