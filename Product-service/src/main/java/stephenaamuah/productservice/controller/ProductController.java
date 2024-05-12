package stephenaamuah.productservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import stephenaamuah.productservice.model.ProductRequest;
import stephenaamuah.productservice.model.ProductResponse;
import stephenaamuah.productservice.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest){
        productService.createProduct(productRequest);
    }


    @GetMapping
    @ResponseStatus
    public List<ProductResponse> getAllProduct(){
        return productService.getAllProducts();
    }


}
