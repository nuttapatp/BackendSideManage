package com.Nuttapat.BackendSide.repository;

import com.Nuttapat.BackendSide.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Long> {



}
