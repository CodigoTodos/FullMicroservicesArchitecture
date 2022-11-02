package com.brunoalves.ProductService.service;

import com.brunoalves.ProductService.model.ProductRequest;
import com.brunoalves.ProductService.model.ProductResponse;

public interface ProductService {

    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);

    void reduceQuantity(long productId, long quantity);
}
