package com.launch.app.loosecoupling;

import com.launch.services.loosecoupling.DeliveryServices;

public class FlipKartApp {
	
	private DeliveryServices service;
	
	

	public void setService(DeliveryServices service) {
		this.service = service;
	}



	boolean initiateDelivery (double amount) {
		
		return service.deliverTheProduct(amount);		
	
	}

}
