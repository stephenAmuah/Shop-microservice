package stephenaamuah.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import stephenaamuah.productservice.model.Product;

@Repository
public interface ProductRepository extends MongoRepository <Product, String> {
}
