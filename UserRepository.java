package Gestion.pressing.pressing.repositories;

import Gestion.pressing.pressing.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {


}
