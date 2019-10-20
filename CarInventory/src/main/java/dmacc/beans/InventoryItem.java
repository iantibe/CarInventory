package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity(name = "cars")
public class InventoryItem {

	//properties
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private int inventoryNumber;
	private int locationNumber;
	private String previousOwner;
	@Autowired
	private Car car;
	
	
	//constructor
	public InventoryItem() {
		
	}

	//getter and setter
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getInventoryNumber() {
		return inventoryNumber;
	}

	public void setInventoryNumber(int inventoryNumber) {
		this.inventoryNumber = inventoryNumber;
	}

	public int getLocationNumber() {
		return locationNumber;
	}

	public void setLocationNumber(int locationNumber) {
		this.locationNumber = locationNumber;
	}

	public String getPreviousOwner() {
		return previousOwner;
	}

	public void setPreviousOwner(String previousOwner) {
		this.previousOwner = previousOwner;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	//tostring
	@Override
	public String toString() {
		return "InventoryItem [id=" + id + ", inventoryNumber=" + inventoryNumber + ", locationNumber=" + locationNumber
				+ ", previousOwner=" + previousOwner + ", car=" + car + "]";
	}
		
	
	

	
	
	
}