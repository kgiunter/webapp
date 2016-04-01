package com.tsystems.webapp.repository;


import com.tsystems.webapp.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String>
{
   // @Query("SELECT u from UserEntity u where u.login = :login")
   @Query (value = "SELECT * FROM USER WHERE login = ?", nativeQuery = true)
   UserEntity findByLogin(String login);
}
