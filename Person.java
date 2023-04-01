import java.util.*;
public class Person {
	/**
	 * Field names 
	 */
	private String name; 
	private String address; 
	private String telephone; 
	
	
	// Create constructor that takes no parameter 
	public Person() {
		name = "";
		address = "";
		telephone = ""; 
		
	}
	
	// Create constructor that takes n, a, p as string
	public Person(String n, String a, String p) {
		name = n; 
		address = a;
		telephone = p;
	}
	
	/** 
	 * Create mutators 
	 */
	
	public void setName(String n) {
		name = n; 
	}
	
	public void setAddress(String a) {
		address = a; 
	}
	
	public void setPhone(String p) {
		telephone = p; 
	}
	
	/**
	 * Create accessors
	 */
	
	public String getName() {
		return name; 
	}
	
	public String getAddress() {
		return address; 
	}
	
	public String getPhone() {
		return telephone; 
	}
}
