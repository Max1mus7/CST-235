package controllers;

import java.util.ArrayList;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import Business.MyTimerService;
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
	OrdersBusinessService service;
	@Inject
	ArrayList<Order> orders;
	@EJB
	MyTimerService timer = new MyTimerService();
	
	public String onSubmit(User user)
	{
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("orders", new Orders());
		service.test();
		timer.setTimer(10000);
		return "TestResponse.xhtml";
	}
	public String onFlash(User user)
	{
		FacesContext.getCurrentInstance().getExternalContext().getFlash().put("user", user);
		return "TestResponse2.xhtml";
	}
	public OrdersBusinessService getService()
	{
		return this.service;
	}
	public ArrayList<Order> getOrders()
	{
		return (ArrayList<Order>) this.service.getOrders();
	}
}
