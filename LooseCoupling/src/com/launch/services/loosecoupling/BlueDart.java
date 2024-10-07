package com.launch.services.loosecoupling;

public class BlueDart implements DeliveryServices {
	
	double amount;
	
	@Override
	public boolean deliverTheProduct(double amount) {
		// TODO Auto-generated method stub
		
		this.amount = amount;
		
		System.out.println("Package is delivered by BlueDart which is worth $"+amount);
		
		return true;
	}

}
