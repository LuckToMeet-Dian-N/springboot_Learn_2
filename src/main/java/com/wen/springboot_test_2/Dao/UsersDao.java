package com.wen.springboot_test_2.Dao;

import com.wen.springboot_test_2.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
public interface UsersDao extends JpaRepository<Users,String>{
    /**
     * 自动生成的sql
     * @return
     */
    List<Users> findAll();

    /**
     * 自己写sql
     * @return
     */
    @Query("SELECT u from Users u ")
    List<Users> findALL2();

    @Transactional
    @Modifying      //告诉JPA使用的是写操作
    @Query("update Users set password=:password where user_id=:user_id ")
    Integer updateUserPassword(@Param("user_id") String user_id,@Param("password") String password);



}
