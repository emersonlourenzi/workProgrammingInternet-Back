package com.internet2.programming.implementation.product;

import com.internet2.programming.implementation.product.model.ProductModelImp;
import com.internet2.programming.implementation.product.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class ProductFacadeImp {
    private ProductService productService;

    public List<ProductModelImp> findAll() {
        return productService.findAll();
    }

    public ProductModelImp findById(String idProd) throws Exception {
        return productService.findById(idProd);
    }

    public ProductModelImp create(ProductModelImp product) {
        return productService.create(product);
    }

    public void deleteById(String idProd) throws Exception {
        productService.deleteById(idProd);
    }

    public ProductModelImp update(String idProd, ProductModelImp product) throws Exception {
        return productService.update(idProd, product);
    }

    public String test() {
        return productService.test();
    }
}
