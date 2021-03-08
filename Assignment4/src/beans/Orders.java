package beans;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class Orders
{
	private ArrayList<Order> orders = new ArrayList<Order>();
	
	public Orders()
	{
		orders.add(new Order());
		orders.add(new Order());
		orders.add(new Order());
		orders.add(new Order());
		orders.add(new Order());
	}
	
	public ArrayList<Order> getOrders()
	{
		return orders;
	}
	
	public void setOrders(ArrayList<Order> orders)
	{
		this.orders = orders;
	}
}
