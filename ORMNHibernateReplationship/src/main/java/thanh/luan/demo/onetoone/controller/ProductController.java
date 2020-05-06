package thanh.luan.demo.onetoone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import thanh.luan.demo.onetoone.domain.Product;
import thanh.luan.demo.onetoone.service.ProductService;

import java.util.List;

@Controller

public class ProductController {

    private  ProductService productService;
    ProductController(@Autowired ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/")
    public String inputProduct(@ModelAttribute("product") Product product) {
        return "onetoone/ProductForm";
    }

    @PostMapping("/")
    public String saveProduct(Product product, Model model) {

        System.out.println(product);
        // ....Demo Cascade
        // Best practice on bidirectional set BOTH ends ["Pretend" no DB]
        product.getHotLine().setProduct(product);
        product = productService.save(product); // insert & [ insert OR Update of phone]

        //TODO: ask why can ProductDetails access product?
        return "onetoone/ProductDetails";

//        model.addAttribute("product", product);
//        return "redirect:/details";
    }

//    @GetMapping("/details")
//    public  String detail(){
//
//        return "onetoone/ProductDetails";
//    }


    @GetMapping("/listproducts")
    public String listProducts(Product product, Model model) {

        List<Product> list = productService.getAllProducts();
        list.forEach(System.out::println);
        model.addAttribute("products", list);

        return "onetoone/ListProducts";
    }
}
