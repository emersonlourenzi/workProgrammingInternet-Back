package com.internet2.programming.contract.v1.product.mapper;

import com.internet2.programming.contract.v1.product.model.ProductRequest;
import com.internet2.programming.contract.v1.product.model.ProductResponse;
import com.internet2.programming.implementation.product.model.ProductModelImp;

public class ProductMapper {
    public static ProductResponse mapToContract(ProductModelImp productModelImp) {
        return ProductResponse.builder()
                .id(productModelImp.getId())
                .nameProd(productModelImp.getNameProd())
                .descriptionProd(productModelImp.getDescriptionProd())
                .build();
    }

    public static ProductModelImp mapToImp(ProductRequest productRequest) {
        return ProductModelImp.builder()
                .nameProd(productRequest.getNameProd())
                .descriptionProd(productRequest.getDescriptionProd())
                .build();
    }
}
