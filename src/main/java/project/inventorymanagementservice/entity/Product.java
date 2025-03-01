package project.inventorymanagementservice.entity;

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
    private String name;
    private double price;
    private Integer quantity;
    @Enumerated(EnumType.STRING)
    private ProductCategory productCategory;
}
