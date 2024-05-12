package stephenaamuah.inventoryservice.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import stephenaamuah.inventoryservice.Model.Inventory;

import java.util.List;
import java.util.Optional;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {


    List<Inventory>findBySkuCodeIn(List<String> skuCodes);
}
