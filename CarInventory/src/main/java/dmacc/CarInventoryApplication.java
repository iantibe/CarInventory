package dmacc;

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
		// TODO Auto-generated method stub
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);

		InventoryItem c = appContext.getBean("inventoryitem", InventoryItem.class);
		Car car = appContext.getBean("car", Car.class);
		
		c.setCar(car);
		
		repo.save(c);
		
		
		
	}

}
