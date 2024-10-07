package com.launch.services.loosecoupling;

public class DHL implements DeliveryServices {
	double amount;

	@Override
	public boolean deliverTheProduct(double amount) {
		
		this.amount = amount;
		
		System.out.println("Package is delivered by DHL which is worth $"+amount);
		
		return true;
	}

}
