package project.newinventorymanagement1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.newinventorymanagement1.entity.Product;
import project.newinventorymanagement1.entity.ProductCategory;


import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

    List<Product> findAllByProductCategoryIgnoreCase(ProductCategory productCategory);
    List<Product> findAllByName(String name);

}
