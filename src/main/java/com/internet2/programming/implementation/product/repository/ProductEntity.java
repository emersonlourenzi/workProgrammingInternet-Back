package com.internet2.programming.implementation.product.repository;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Data
@Builder
@Document(value = "products")
public class ProductEntity {
    private String id;
    private String nameProd;
    private String descriptionProd;
}
