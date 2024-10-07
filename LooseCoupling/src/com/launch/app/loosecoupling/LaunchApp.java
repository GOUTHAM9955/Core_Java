package com.launch.app.loosecoupling;

import com.launch.services.loosecoupling.DHL;
import com.launch.services.loosecoupling.FedEx;

public class LaunchApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlipKartApp fk =new FlipKartApp(); // target object
		
//Injecting dependent object to target object through setter is called setter injection
		fk.setService(new FedEx()); // dependent object
		
		fk.initiateDelivery(1234);
		
		
	}

}
