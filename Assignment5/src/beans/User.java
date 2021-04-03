package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ManagedBean
@ViewScoped
public class User {
	@NotNull(message = "Please enter a first name. This is required.")
	@Size(min = 3, max = 15)
	private String firstName = "";
	
	@NotNull(message = "Please enter a last name. This is required.")
	@Size(min = 3, max = 15)
	private String lastName = "";

	public User()
	{
		firstName = "Max";
		lastName = "Weber";
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
