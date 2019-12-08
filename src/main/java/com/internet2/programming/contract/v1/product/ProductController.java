package com.internet2.programming.contract.v1.product;

import com.internet2.programming.contract.v1.product.model.ProductRequest;
import com.internet2.programming.contract.v1.product.model.ProductResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/v1/products")
@RestController
@AllArgsConstructor
public class ProductController {
    private ProductFacadeController productFacadeController;

    @GetMapping()
    public List<ProductResponse> findAll() {
        return productFacadeController.findAll();
    }

    @GetMapping("/{idProd}")
    public ProductResponse findById(@PathVariable String idProd) throws Exception {
        return productFacadeController.findById(idProd);
    }

    @PostMapping()
    public ProductResponse create(@RequestBody ProductRequest product) {
        return productFacadeController.create(product);
    }

    @DeleteMapping("/{idProd}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable String idProd) throws Exception {
        productFacadeController.deleteById(idProd);
    }

    @PutMapping("/{idProd}")
    public ProductResponse update(@PathVariable String idProd, @RequestBody @Valid ProductRequest product) throws Exception {
        return productFacadeController.update(idProd, product);
    }

    @GetMapping("/test")
    public String test() {
        return productFacadeController.test();
    }

}
