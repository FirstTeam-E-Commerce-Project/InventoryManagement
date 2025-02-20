package project.newinventorymanagement1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;
    private String modelNumber;
    private String productName;
    private String description;
    private String brand;
    private Integer price;
    private Integer quantity;
    @Enumerated(EnumType.STRING)
    private ProductCategory productCategory;
}
