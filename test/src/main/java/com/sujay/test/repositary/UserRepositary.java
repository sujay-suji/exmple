package com.sujay.test.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sujay.test.model.User;


@Repository
@Transactional
public interface UserRepositary extends JpaRepository<User, Long>{

}
