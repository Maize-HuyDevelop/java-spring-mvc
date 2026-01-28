package vn.hoidanit.laptopshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import vn.hoidanit.laptopshop.domain.User;
import vn.hoidanit.laptopshop.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User handleSaveUser(User user) {// hàm lưu người dùng
        User eric = this.userRepository.save(user);
        System.out.print(eric);
        return eric;
    }

    public List<User> getAllUsers() {// hàm để lấy thông tin tất cả người dùng
        return this.userRepository.findAll();
    }

    public List<User> getAllUsersByEmail(String email) {// hàm để lấy tất cả thông tin thông qua email
        return this.userRepository.findOneByEmail(email);
    }

}
