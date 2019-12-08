package com.internet2.programming.implementation.product.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@Data
@Builder
@Document(value = "products")
public class ProductModelImp {
    @Id
    private String id;
    @NotNull
    @NotEmpty(message = "Required Name Product field.")
    private String nameProd;
    @NotNull
    @NotEmpty(message = "Required Description product field.")
    private String descriptionProd;
}
