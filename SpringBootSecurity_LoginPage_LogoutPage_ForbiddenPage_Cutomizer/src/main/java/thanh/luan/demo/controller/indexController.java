package thanh.luan.demo.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/user")
    public String user(){
        return "user";
    }

    @GetMapping("/admin")
    @Secured("ROLE_ADMIN")
    //    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String admin(){
        return "admin";
    }
}
