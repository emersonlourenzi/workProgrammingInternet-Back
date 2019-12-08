package com.internet2.programming.implementation.product.service;

import com.internet2.programming.implementation.product.mapper.ProductMapperImp;
import com.internet2.programming.implementation.product.model.ProductModelImp;
import com.internet2.programming.implementation.product.repository.ProductEntity;
import com.internet2.programming.implementation.product.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProductService {
    private ProductRepository productRepository;

    public List<ProductModelImp> findAll() {
        return productRepository.findAll().stream()
                .map(ProductMapperImp::mapToModel)
                .collect(Collectors.toList());
    }

    public ProductModelImp findById(String idProd) throws Exception {
        Optional<ProductEntity> user = productRepository.findById(idProd);
        if (!user.isEmpty()) {
            return ProductMapperImp.mapToModel(productRepository.findById(idProd)
                    .orElseThrow(InputMismatchException::new));
        } else {
            throw new Exception("User not found. ");
        }
    }

    public ProductModelImp create(ProductModelImp product) {
        return ProductMapperImp.mapToModel(productRepository.save(ProductMapperImp.mapToEntity(product)));
    }

    public void deleteById(String idProd) throws Exception {
        if (productRepository.existsById(idProd)) {
            productRepository.deleteById(idProd);
        } else {
            throw new Exception("nonexistent user");
        }
    }

    public ProductModelImp update(String idProd, ProductModelImp product) throws Exception {
        if (productRepository.existsById(idProd)) {
            productRepository.deleteById(idProd);
            product.setId(idProd);
            return ProductMapperImp.mapToModel(productRepository.save(ProductMapperImp.mapToEntity(product)));
        } else {
            throw new Exception("nonexistent user");
        }
    }

    public String test() {
        return "BOMBOU . . .";
    }
}
