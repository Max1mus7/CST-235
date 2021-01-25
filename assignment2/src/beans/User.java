package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class User {
	private String firstName = "";
	private String lastName = "";

	public User()
	{
		firstName = "Mark";
		lastName = "Reha";
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
}
