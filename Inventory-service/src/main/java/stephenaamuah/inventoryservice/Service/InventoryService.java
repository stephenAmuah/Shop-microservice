package stephenaamuah.inventoryservice.Service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import stephenaamuah.inventoryservice.Model.InventoryResponse;
import stephenaamuah.inventoryservice.Repository.InventoryRepository;

import java.util.List;

@Service
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }


    @Transactional(readOnly = true)
    public List<InventoryResponse> isInStock(List<String> skuCode) {
        return inventoryRepository.findBySkuCodeIn(skuCode)
                .stream()
                .map(inventory -> InventoryResponse.builder()
                        .skuCode(inventory.getSkuCode())
                        .isInStock(inventory.getQuantity() > 0)
                        .build())
                .toList();


    }
}
