package com.wolken.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wolken.project.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
