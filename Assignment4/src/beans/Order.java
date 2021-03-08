package beans;

public class Order
{
	private String orderNumber;
	private String productName;
	private double price;
	private int quantity;
	
	
	public Order()
	{
		this.orderNumber = "";
		this.productName = "";
		this.price = 0.0;
		this.quantity = 0;
	}
	
	public Order(String orderNumber, String productName, double price, int quantity)
	{
		this.orderNumber = orderNumber;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getOrderNumber()
	{
		return orderNumber;
	}
	
	public void setOrderNumber(String orderNumber)
	{
		this.orderNumber = orderNumber;
	}
	
	public String getProductName()
	{
		return productName;
	}
	
	public void setProductName(String productName)
	{
		this.productName = productName;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public void setQuantity(int quanitity)
	{
		this.quantity = quanitity;
	}
	
}
