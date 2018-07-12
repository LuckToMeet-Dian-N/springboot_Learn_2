package com.wen.springboot_test_2.service;

import com.wen.springboot_test_2.Entity.Users;

import java.util.List;

public interface UserService {
    /**
     * 测试JPA的sql
     * @return
     */
    List<Users> findAllUser();

    /**
     * 测试我们自己写的sql
     * @return
     */
    List<Users> findAllUser2();

    /**
     * 插入数据库
     * @param users
     * @return
     */
    Users saveUser(Users users);

    /**
     * 修改数据库数据
     * @param account
     * @param password
     * @return
     */
    Integer updadteUserPassword(String account,String password);

    /**
     * 删除用户
     * @param users
     * @return
     */
    void deleteUser(Users users);



}
