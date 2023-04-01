import java.util.*;

// extend this class from class Customer
public class PreferredCustomer extends Customer {
/**
 * Create field names
 */
	private double purchase;
	private double discountLevel;
	
	// Create a constructor that takes no parameter
	public PreferredCustomer() {
		purchase = 0.0;
		discountLevel = 0.0;
	}
	
	// Create a constructor that takes n, a, p, c as string, m as boolean, and pur as double
	public PreferredCustomer(String n, String a, String p, String c, boolean m, double pur) {
		super(n, a, p, c, m); 
		purchase = pur; 
	}
	
	// Create a mutator setPurchase that takes p as double 
	public void setPurchases(double p) {
		purchase = p; 
	}
	
	// Create accessors
	public double getPurchases() {
		return purchase; 
	}
	
	public double getDiscountLevel() {
		if(getPurchases() >= 500.0 && getPurchases() < 1000.0) {
			discountLevel = 0.05; 
		}
		else if(getPurchases() >= 1000.0 && getPurchases() < 1500.0) {
			discountLevel = 0.06;
		}
		else if(getPurchases() >= 1500.0 && getPurchases() < 2000.0 ) {
			discountLevel = 0.07;
		}
		else if (getPurchases() >= 2000.0) {
			discountLevel = 0.1;
		}
		return discountLevel;
	}
}

