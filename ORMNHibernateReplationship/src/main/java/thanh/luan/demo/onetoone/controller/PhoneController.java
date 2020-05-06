package thanh.luan.demo.onetoone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import thanh.luan.demo.onetoone.domain.Phone;
import thanh.luan.demo.onetoone.service.PhoneService;

@Controller
@RequestMapping("/phone")
public class PhoneController {
    @Autowired
    PhoneService phoneService;

    @GetMapping("/add")
    public String inputProduct(@ModelAttribute Phone phone) {
        return "onetoone/PhoneForm";
    }

    @PostMapping("/add")
    public String saveProduct(Phone phone) {
       System.out.println(phone);
        // ....Demo Cascade
        // Best practice on bidirectional set BOTH ends ["Pretend" no DB]
        phone.getProduct().setHotLine(phone);
        phone = phoneService.save(phone); // insert & [ insert OR Update of phone]

        return "onetoone/PhoneDetails";
    }

}
