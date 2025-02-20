package project.inventorymanagementservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.inventorymanagementservice.entity.Product;
import project.inventorymanagementservice.entity.ProductCategory;
import project.inventorymanagementservice.repo.ProductRepo;

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
