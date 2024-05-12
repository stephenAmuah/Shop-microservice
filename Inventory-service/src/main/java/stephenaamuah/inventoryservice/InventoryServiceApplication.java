package stephenaamuah.inventoryservice;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import stephenaamuah.inventoryservice.Model.Inventory;
import stephenaamuah.inventoryservice.Repository.InventoryRepository;

@SpringBootApplication
@Slf4j
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }


    @Bean
    public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
        return args -> {
            Inventory inventory = new Inventory();
            inventory.setSkuCode("Iphone 13");
            inventory.setQuantity(100);

            Inventory inventory1 = new Inventory();
            inventory1.setSkuCode("Iphone 14");
            inventory1.setQuantity(0);


            inventoryRepository.save(inventory);
            log.info("Inventory{}", inventory);
            inventoryRepository.save(inventory1);
            log.info("Inventory 1{}", inventory1);
        };

    }

}
