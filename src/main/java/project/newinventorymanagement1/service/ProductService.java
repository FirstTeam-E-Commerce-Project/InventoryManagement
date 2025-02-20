package project.newinventorymanagement1.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.newinventorymanagement1.entity.Product;
import project.newinventorymanagement1.entity.ProductCategory;
import project.newinventorymanagement1.repo.ProductRepo;


import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepo productRepo;

    public Product addProduct(Product product) {
        return productRepo.save(product);
    }

    public List<Product> addMultipleProduct(List<Product> products) {
        return productRepo.saveAll(products);
    }

    public List<Product> getProductsByName(String name) {
        return productRepo.findAllByName(name);
    }

    public List<Product> getProductByCategory(ProductCategory productCategory) {
        return productRepo.findAllByProductCategoryIgnoreCase(productCategory);
    }

    public Optional<Product> getProductById(Integer id) {
        return productRepo.findById(id);
    }

    public boolean deleteProductById(Integer id) {
        productRepo.deleteById(id);
        return true;
    }
}
