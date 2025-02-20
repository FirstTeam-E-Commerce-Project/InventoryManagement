package project.inventorymanagementservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.inventorymanagementservice.entity.Product;
import project.inventorymanagementservice.entity.ProductCategory;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

    List<Product> findAllByProductCategoryIgnoreCase(ProductCategory productCategory);
    List<Product> findAllByName(String name);

}
