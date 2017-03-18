package com.example.repository;

import com.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * Created by xiachao on 2017/3/18.
 */
public interface UserRepository extends JpaRepository<User,UUID> {
}
