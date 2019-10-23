package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dmacc.beans.Car;
import dmacc.beans.InventoryItem;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.InventoryItemRepository;

@SpringBootApplication
public class CarInventoryApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CarInventoryApplication.class, args);
	}

	@Autowired
	 InventoryItemRepository repo;

	@Override
	public void run(String... args) throws Exception {
				
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		// get beans
		InventoryItem c = appContext.getBean("inventoryitem", InventoryItem.class);
		Car car = appContext.getBean("car", Car.class);
		
		//assign object car to InventoryItem c
		c.setCar(car);
		
		//save
		repo.save(c);
		
		//print to screen
		List<InventoryItem> allMyContacts = repo.findAll();
		for(InventoryItem people: allMyContacts) {
			System.out.println(people.toString());	
}

	}

}
