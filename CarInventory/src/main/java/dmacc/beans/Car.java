package dmacc.beans;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Car {
	
	//properties
	private String model;
	private String make;
	@Column(name = "currentOdometerMiles")
	private int currentOdometerMiles;
	private float price;
	private boolean isDamaged;
	
	//constructor
	public Car () {
		
	}

	//getters and setters
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getCurrentOdometerMiles() {
		return currentOdometerMiles;
	}

	public void setCurrentOdometerMiles(int currentOdometerMiles) {
		this.currentOdometerMiles = currentOdometerMiles;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isDamaged() {
		return isDamaged;
	}

	public void setDamaged(boolean isDamaged) {
		this.isDamaged = isDamaged;
	}
		
	//toString
	@Override
	public String toString() {
		return "Car [model=" + model + ", make=" + make + ", currentOdometerMiles="
				+ currentOdometerMiles + ", price=" + price + ", isDamaged=" + isDamaged + "]";
	}
	
	
	
	
	
}
