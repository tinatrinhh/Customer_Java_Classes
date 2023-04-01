import java.util.*;

// extend this class from parent class Person
public class Customer extends Person {
	// Create field names
	private String customerNumber; 
	private boolean mailingList; 
	
	// Create constructor that takes no parameter 
	public Customer() {
		customerNumber = ""; 
		mailingList = true; 
	}
	
	// Create constructor that takes n, a, p, c as String, m as boolean 
	public Customer(String n, String a, String p, String c, boolean m) {
		super(n, a, p);
		customerNumber = c;
		mailingList = m; 
	}
	
	// Create mutators
	public void setCustomerNumber(String c) {
		customerNumber = c; 
	}
	
	public void setMailingList(boolean m) {
		mailingList = m; 
	}
	
	// Create accessors 
	public String getCustomerNumber() {
		return customerNumber; 
	}
	
	public boolean getMailingList() {
		return mailingList; 
	}
}
