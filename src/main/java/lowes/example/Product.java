package lowes.example;

import lombok.Data;

@Data
public class Product {
    private String id;
    private String productName;
    private String productDescription;
    private Double productPrice;
}
