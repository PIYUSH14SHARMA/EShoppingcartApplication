package in.sp.application.model;

import in.sp.application.model.Product;

public class Cart extends Product{
	private int quantity;
	

	

	public Cart() {
	}


	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}