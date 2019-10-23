package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Car;
import dmacc.beans.InventoryItem;

@Configuration
public class BeanConfiguration {

	@Bean
	public Car car() {
		Car bean = new Car();
		bean.setPrice(23000);
		bean.setCurrentOdometerMiles(97000);
		bean.setDamaged(false);
		bean.setMake("VolksWagen");
		bean.setModel("Jetta");
		return bean;
	}
	
	@Bean
	public InventoryItem inventoryitem() {
		InventoryItem bean = new InventoryItem();
		bean.setInventoryNumber(123);
		bean.setLocationNumber(236);
		bean.setPreviousOwner("Dealorship");
		return bean;
	}
}
