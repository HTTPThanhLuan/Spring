package thanh.luan.demo.onetoone.service;

import org.springframework.stereotype.Service;
import thanh.luan.demo.onetoone.domain.Phone;

import java.util.List;


public interface PhoneService {
    public List<Phone> getAll();

    public Phone save(Phone phone);
}
