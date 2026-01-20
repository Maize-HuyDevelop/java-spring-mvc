package vn.hoidanit.laptopshop.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// import vn.hoidanit.laptopshop.domain.Product;
import vn.hoidanit.laptopshop.domain.User;
import vn.hoidanit.laptopshop.service.UserService;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String getHomePage(Model model) {
        List<User> arrUsers = this.userService.getAllUsersByEmail("huy@gmail.com");
        System.out.println(arrUsers);
        model.addAttribute("eric", "test");
        model.addAttribute("hoidanit", "from userController");
        return "hello";
    }

    // Create User
    @RequestMapping("/admin/user")
    public String getUserPage(Model model) {
        model.addAttribute("newUser", new User());
        model.addAttribute("hoidanit", "from userController");
        return "admin/user/create";
    }

    @RequestMapping(value = "/admin/user/create", method = RequestMethod.POST)
    public String createtUserPage(Model model, @ModelAttribute("newUser") User hoidanit) {
        System.out.println(" Run here " + hoidanit);
        this.userService.handSaveUser(hoidanit);
        return "hello";
    }

    // test create Product
    // @RequestMapping("/admin/product")
    // public String getProductPage(Model model) {
    // model.addAttribute("newProduct", new Product());
    // model.addAttribute("hoidanit", "from productController");
    // return "admin/product/createProduct";
    // }

    // @RequestMapping(value = "/admin/product/createProduct", method =
    // RequestMethod.POST)
    // public String createProductPage(Model model, @ModelAttribute("newProduct")
    // Product hoidanit) {
    // System.out.println("Run here" + hoidanit);
    // return "product";
    // }

}
