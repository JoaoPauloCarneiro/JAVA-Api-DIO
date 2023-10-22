package me.dio.SantanderBootcamp2023.Repository;

import me.dio.SantanderBootcamp2023.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository <User, Long>{
}
