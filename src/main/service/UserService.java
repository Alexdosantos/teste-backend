// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.demo.model.UserEntity;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import java.util.List;
// import java.util.Optional;

// @Service
// public class UserService {
//     @Autowired
//     private UserRepository userRepository;

//     public ResponseEntity createUser(UserCreateDto user) {
//         if (userRepository.findByCpf(user.cpf()) == null) {
//             return ResponseEntity.badRequest().body("CLiente não existe");
//         }

//         UserEntity newUser = new User(user.name(), user.cpf() , user.saldo());
//         userRepository.save(newUser);

//         return ResponseEntity.ok().body(newUser);
//     }

// }
