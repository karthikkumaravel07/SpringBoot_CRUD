package com.karthik.simpleWebApp.service;

import com.karthik.simpleWebApp.model.Product;
import com.karthik.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;
//    List<Product> products = new ArrayList<>( Arrays.asList(
//            new Product(101, "iphone", 5000),
//            new Product(102, "iphone", 5000),
//            new Product(103, "iphone", 5000)
//    ));
    public List<Product> getProducts() {
        return repo.findAll();
    }



    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }
    public void addProduct(Product prod) {
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
       repo.save(prod);
    }

    public void deleteProductById(int prodId) {
       repo.deleteById(prodId);
    }
}
