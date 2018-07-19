package com.ars.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ars.models.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

	@Query(value = "select * from user_details p where p.username = ?1 ", nativeQuery = true)
	User findOne(String username);
}
