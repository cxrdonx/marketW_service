package com.marketonline.web.controller;

import com.marketonline.domain.Product;
import com.marketonline.domain.repository.ProductRepository;
import com.marketonline.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    //inyectar el servicio
    @Autowired
    private ProductService productService;
        public List<Product> getAll(){
           return productService.getAll();
    }

    @GetMapping("/all")
     public Optional<Product>getProduct(int productId){
            return productService.getProduct(productId);
     }
     public Optional<List<Product>> getByCategory(int categoryId){
         return productService.getByCategory(categoryId);
    }
    public Product save(Product product){
            return productService.save(product);
    }
    public boolean delete(int productId){
            return productService.delete(productId);
    }
     }


