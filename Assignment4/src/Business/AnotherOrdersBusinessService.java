package Business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import beans.Order;
import beans.Orders;	

/**
 * Session Bean implementation class AnotherOrdersBusinessService
 */
@Stateless
@Local(OrdersBusinessInterface.class)
@LocalBean
@Alternative
public class AnotherOrdersBusinessService implements OrdersBusinessInterface
{
	List<Order> orders = new ArrayList<Order>();
	/**
	 * Default constructor.
	 */
	public AnotherOrdersBusinessService()
	{
		// TODO Auto-generated constructor stub
		orders.add(new Order("0", "Order from AnotherOrdersBusinessService", 0.0, 0));
		orders.add(new Order());
		orders.add(new Order());
		orders.add(new Order());
		orders.add(new Order());
	}
	
	/**
	 * @see OrdersBusinessInterface#test()
	 */
	public void test()
	{
		System.out.println("I successfully called a test method in a different OrdersBusinessService");
	}

	@Override
	public List<Order> getOrders()
	{
		// TODO Auto-generated method stub
		return this.orders;
	}

	@Override
	public void setOrders(List<Order> orders)
	{
		// TODO Auto-generated method stub
		this.orders = orders;
	}
	
	
}
