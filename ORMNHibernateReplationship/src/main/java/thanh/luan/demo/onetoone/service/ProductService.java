package thanh.luan.demo.onetoone.service;

import thanh.luan.demo.onetoone.domain.Product;

import java.util.List;

public interface ProductService {
    public Product save(Product product);
    public List<Product> getAllProducts();
}
