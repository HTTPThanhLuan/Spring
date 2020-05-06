package thanh.luan.demo.onetoone.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import thanh.luan.demo.onetoone.domain.Phone;

@Repository
public interface PhoneRepository extends CrudRepository<Phone, Long> {
}
