package bootcamp.user_crud_api.services;

import bootcamp.user_crud_api.model.User;
import bootcamp.user_crud_api.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) throws Exception {
        if (userRepository.existsById(user.getUsername())) {
            throw new Exception("User already exists");
        }
        return userRepository.save(user);
    }

    public User updateUser( User newUser) {
        Optional<User> userOptional = userRepository.findById(newUser.getUsername());
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            user.setPassword(newUser.getPassword());
            user.setEmail(newUser.getEmail());
            return userRepository.save(user);
        }
        return null;
    }

    public User getUserByUsername(String username) {
        return userRepository.findById(username).orElse(null);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public boolean deleteUser(String username) {
        if (userRepository.existsById(username)) {
            userRepository.deleteById(username);
            return true;
        } else {
            return false;
        }
    }
}
