package thanh.luan.demo.onetoone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import thanh.luan.demo.onetoone.domain.Phone;
import thanh.luan.demo.onetoone.repository.PhoneRepository;
import thanh.luan.demo.onetoone.util.Util;

import java.util.List;

@Service
@Transactional
public class PhoneServiceImpl implements PhoneService {

    @Autowired
    PhoneRepository phoneRepository;

    @Override
    public List<Phone> getAll() {
        return Util.iterableToCollection(phoneRepository.findAll());
    }

    @Override
    public Phone save(Phone phone) {
        return  phoneRepository.save(phone);
    }
}
