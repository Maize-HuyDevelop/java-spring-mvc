package vn.hoidanit.laptopshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import vn.hoidanit.laptopshop.domain.Role;
import vn.hoidanit.laptopshop.domain.User;
import vn.hoidanit.laptopshop.repository.RoleRepository;
import vn.hoidanit.laptopshop.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public UserService(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
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

    public User getUserById(long id) {// hàm để lấy thông tin user thông qua email
        return this.userRepository.findById(id);
    }

    public User handleUpdateUser(User user) {// hàm sửa thông tin người dùng
        User eric = this.userRepository.save(user);
        System.out.print(eric);
        return eric;
    }

    public void deleteAUser(long id) {// hàm để xóa thông tin user thông qua id
        this.userRepository.deleteById(id);
    }

    public Role getRoleByName(String name) {
        return this.roleRepository.findByName(name);
    }
}
