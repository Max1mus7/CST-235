package Business;

import java.util.List;

import javax.ejb.Local;

import beans.Order;
import beans.Orders;

public interface OrdersBusinessInterface
{
	public void test();
	public List<Order> getOrders();
	public void setOrders(List<Order> orders); 
}
