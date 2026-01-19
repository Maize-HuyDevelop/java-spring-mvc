package vn.hoidanit.laptopshop.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String handleHello() {
        return "Hello form service";
    }

    public class UserPageService {
        public String handleUserPage() {
            return "User form service";
        }

    }
}
