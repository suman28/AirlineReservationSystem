package com.ars.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ars.models.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
	Page<User> findUsersById(long Id, Pageable page);
}
