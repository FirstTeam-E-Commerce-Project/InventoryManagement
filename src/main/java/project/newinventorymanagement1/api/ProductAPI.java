package project.newinventorymanagement1.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import project.newinventorymanagement1.entity.Product;
import project.newinventorymanagement1.entity.ProductCategory;
import project.newinventorymanagement1.service.ProductService;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductAPI {

    private final ProductService productService;

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @PostMapping("/addMultiple")
    public List<Product> addMultipleProduct(@RequestBody List<Product> products) {
        return productService.addMultipleProduct(products);
    }

    @GetMapping("/getByName")
    public List<Product> getProductsByName(@RequestParam("name") String name) {
        return productService.getProductsByName(name);
    }


    @GetMapping("/getById")
    public Optional<Product> getProductById(@RequestParam("id") Integer id) {
        return productService.getProductById(id);
    }

    @GetMapping("/getByCategory")
    public List<Product> getProductByCategory(@RequestParam ProductCategory productCategory) {
        return productService.getProductByCategory(productCategory);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProductById(@PathVariable("id") Integer id) {
        if (productService.deleteProductById(id)) {
            return "Product id " + id + " was deleted successfully";
        } else {
            return "Product id " + id + " could not be deleted";
        }
    }
}
