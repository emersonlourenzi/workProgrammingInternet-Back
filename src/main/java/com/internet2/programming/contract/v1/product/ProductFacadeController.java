package com.internet2.programming.contract.v1.product;

import com.internet2.programming.contract.v1.product.mapper.ProductMapper;
import com.internet2.programming.contract.v1.product.model.ProductRequest;
import com.internet2.programming.contract.v1.product.model.ProductResponse;
import com.internet2.programming.implementation.product.ProductFacadeImp;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class ProductFacadeController {
    private ProductFacadeImp productFacadeImp;

    public List<ProductResponse> findAll() {
        return productFacadeImp.findAll().stream().map(ProductMapper::mapToContract).collect(Collectors.toList());
    }

    public ProductResponse findById(String idProd) throws Exception {
        return ProductMapper.mapToContract(productFacadeImp.findById(idProd));
    }

    public ProductResponse create(ProductRequest product) {
        return ProductMapper.mapToContract(productFacadeImp.create(ProductMapper.mapToImp(product)));
    }

    public void deleteById(String idProd) throws Exception {
        productFacadeImp.deleteById(idProd);
    }

    public ProductResponse update(String idProd, ProductRequest product) throws Exception {
        return ProductMapper.mapToContract(productFacadeImp.update(idProd, ProductMapper.mapToImp(product)));
    }

    public String test() {
        return productFacadeImp.test();
    }
}
