package com.launch.services.loosecoupling;

public class FedEx implements DeliveryServices {
	double amount;
	@Override
	public boolean deliverTheProduct(double amount) {
		
		this.amount = amount;
		
		System.out.println("Package is delivered by FedEx which is worth $"+amount);
		
		return true;
	}

}
