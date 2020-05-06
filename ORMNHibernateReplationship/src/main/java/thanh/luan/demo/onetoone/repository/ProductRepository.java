package thanh.luan.demo.onetoone.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import thanh.luan.demo.onetoone.domain.Product;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product,Long> {

    @Query(value = "select p from Product p left join fetch p.hotLine") //TODO: ask
    List<Product> getAllProducts();
}
