package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import Business.OrdersBusinessInterface;
import Business.OrdersBusinessService;
import beans.Order;
import beans.Orders;
import beans.User;


@ManagedBean
@ViewScoped
public class FormController 
{
	@Inject
	OrdersBusinessInterface service;
	
	Connection conn = null;
	
	public String onSubmit(User user)
	{
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("orders", new Orders());
		getAllOrders();
		insertOrder();
		getAllOrders();
		return "TestResponse.xhtml"; 
	}
	public String onFlash(User user)
	{
		FacesContext.getCurrentInstance().getExternalContext().getFlash().put("user", user);
		return "TestResponse2.xhtml";
	}
	public OrdersBusinessInterface getService()
	{
		return this.service;
	}
	public ArrayList<Order> getOrders()
	{
		return (ArrayList<Order>) this.service.getOrders();
	}
	private void getAllOrders()
	{
		String url = "jdbc:postgresql://localhost:5432/postgres";
		try
		{
			conn = DriverManager.getConnection(url, "postgres", "Max1mus7");
			System.out.println("Successfully established a database connection!");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM testapp.ORDERS");
			while(rs.next())
			{
				System.out.print(rs.getInt("ID") + "\t");
				System.out.print(rs.getString("PRODUCT_NAME") + "\t");
				System.out.print(rs.getFloat("PRICE") + "\t");
				System.out.println();
			}
			conn.close();
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			System.out.println("Failed to connect to the database");
			e.printStackTrace();
		}
		finally
		{
			if(conn == null)
			{
				System.out.println("Connection could not close because it was never established.");
			}
			else
			{
				try
				{
					conn.close();
				}
				catch (SQLException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Connection closed.");
			}
		}
	}
	private void insertOrder()
	{
		String url = "jdbc:postgresql://localhost:5432/postgres";
		try
		{
			conn = DriverManager.getConnection(url, "postgres", "Max1mus7");
			System.out.println("Successfully established a database connection!");
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("INSERT INTO testapp.ORDERS (ORDER_NO, PRODUCT_NAME, PRICE, QUANTITY) VALUES('001122334455', 'This was inserted new', 25.00, 100)");

			conn.close();
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			System.out.println("Failed to connect to the database");
			e.printStackTrace();
		}
		finally
		{
			if(conn == null)
			{
				System.out.println("Connection could not close because it was never established.");
			}
			else
			{
				try
				{
					conn.close();
				}
				catch (SQLException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Connection closed.");
			}
		}
	}
}
