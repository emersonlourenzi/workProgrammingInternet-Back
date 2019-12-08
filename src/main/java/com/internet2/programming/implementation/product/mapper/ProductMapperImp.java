package com.internet2.programming.implementation.product.mapper;

import com.internet2.programming.implementation.product.model.ProductModelImp;
import com.internet2.programming.implementation.product.repository.ProductEntity;

public class ProductMapperImp {
    public static ProductModelImp mapToModel(ProductEntity productEntity) {
        return ProductModelImp.builder()
                .id(productEntity.getId())
                .nameProd(productEntity.getNameProd())
                .descriptionProd(productEntity.getDescriptionProd())
                .build();
    }

    public static ProductEntity mapToEntity(ProductModelImp productModelImp) {
        return ProductEntity.builder()
                .id(productModelImp.getId())
                .nameProd(productModelImp.getNameProd())
                .descriptionProd(productModelImp.getDescriptionProd())
                .build();
    }
}
