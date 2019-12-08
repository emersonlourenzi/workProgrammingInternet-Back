package com.internet2.programming.contract.v1.product;

import com.internet2.programming.contract.v1.product.model.ProductRequest;
import com.internet2.programming.contract.v1.product.model.ProductResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

// Anotação generalista para qualquer tipo de solicitação (GET, POST, DELETE, etc...).
@RequestMapping("/v1/products")
// Anotação infoma ao spring que está é uma classe controladora.
@RestController
// Anotação do lombok que cria o construtor com todos os argumentos.
@AllArgsConstructor
public class ProductController {
    private ProductFacadeController productFacadeController;

    // Anotação para solicitações GET.
    @GetMapping
    public List<ProductResponse> findAll() {
        return productFacadeController.findAll();
    }

    // Anotação para solicitações GET.
    @GetMapping("/{idProd}")
    public ProductResponse findById(@PathVariable String idProd) throws Exception {
        return productFacadeController.findById(idProd);
    }

    // Anotação para solicitações POST.
    @PostMapping()
    public ProductResponse create(@RequestBody ProductRequest product) {
        return productFacadeController.create(product);
    }

    // Anotação para solicitações DELETE.
    @DeleteMapping("/{idProd}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable String idProd) throws Exception {
        productFacadeController.deleteById(idProd);
    }

    // Anotação para solicitações PUT.
    @PutMapping("/{idProd}")
    public ProductResponse update(@PathVariable String idProd, @RequestBody @Valid ProductRequest product) throws Exception {
        return productFacadeController.update(idProd, product);
    }

    // Anotação para solicitações GET. ESTE MÉTODO FOI APENAS UM TESTE.
    @GetMapping("/test")
    public String test() {
        return productFacadeController.test();
    }

}
