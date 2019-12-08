package com.internet2.programming.contract.v1.product.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Data
@Builder
@Document(value = "products")
public class ProductResponse {
    private String id;
    private String nameProd;
    private String descriptionProd;
}
