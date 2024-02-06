package com.raitztiago.userdept.repositories;

import com.raitztiago.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
