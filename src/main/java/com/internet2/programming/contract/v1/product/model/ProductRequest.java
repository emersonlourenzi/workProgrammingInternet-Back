package com.internet2.programming.contract.v1.product.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Document(value = "products")
public class ProductRequest {
    @Id
    private String id;
    @NotNull
    @NotEmpty(message = "Required Name Product field.")
    private String nameProd;
    @NotNull
    @NotEmpty(message = "Required Description Product field.")
    private String descriptionProd;
}
