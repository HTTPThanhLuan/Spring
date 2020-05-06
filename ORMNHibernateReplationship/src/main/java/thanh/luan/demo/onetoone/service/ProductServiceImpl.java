package thanh.luan.demo.onetoone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thanh.luan.demo.onetoone.domain.Product;
import thanh.luan.demo.onetoone.repository.ProductRepository;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {


    private ProductRepository productRepository;

    public ProductServiceImpl(@Autowired  ProductRepository productRepository) {

        this.productRepository = productRepository;
    }

    @Override
    public Product save(Product product) { return productRepository.save(product); }

    @Override
    public List<Product> getAllProducts() {return this.productRepository.getAllProducts();}
}
