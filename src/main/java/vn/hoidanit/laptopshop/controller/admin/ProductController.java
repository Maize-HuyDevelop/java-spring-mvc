package vn.hoidanit.laptopshop.controller.admin;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import vn.hoidanit.laptopshop.domain.Product;
import vn.hoidanit.laptopshop.service.ProductService;
import vn.hoidanit.laptopshop.service.UploadService;

@Controller
// Show product
public class ProductController {
    // private final ProductService productService;
    // private final UploadService uploadService;

    // public ProductController(
    // UploadService uploadService,
    // ProductService productService) {
    // this.productService = productService;
    // this.uploadService = uploadService;
    // }

    @GetMapping("/admin/product")
    public String GetProduct() {
        // List<Product> products = this.productService.getAllProducts();
        // model.addAttribute("products", products);
        return "admin/product/show";
    }

    // Create product
    @GetMapping("/admin/product/createProduct") // Get
    public String getCreateProductPage(Model model) {
        model.addAttribute("newProduct", new Product());
        return "admin/product/createProduct";
    }

    // @PostMapping(value = "/admin/product/createProduct")
    // public String getCreateProductPage(Model model,
    // @ModelAttribute("newProduct") Product hoidanit,
    // @RequestParam("hoidanitFile") MultipartFile file) {
    // String avatar = this.uploadService.handleSaveUploadFile(file, "avatar");
    // hoidanit.setAvatar(avatar);
    // model.addAttribute("newProduct", new Product());
    // this.productService.handleSaveProduct(hoidanit);

    // return "redirect:/admin/product";

    // }
}