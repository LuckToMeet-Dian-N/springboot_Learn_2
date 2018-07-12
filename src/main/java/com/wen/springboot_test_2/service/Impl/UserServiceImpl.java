package com.wen.springboot_test_2.service.Impl;

import com.wen.springboot_test_2.Dao.UsersDao;
import com.wen.springboot_test_2.Entity.Users;
import com.wen.springboot_test_2.service.UserService;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl  implements UserService{

    @Resource
    UsersDao usersDao;


    @Override
    public List<Users> findAllUser() {
        return usersDao.findAll();
    }

    @Override
    public List<Users> findAllUser2() {

        return usersDao.findALL2();
    }

    @Override
    public Users saveUser(Users users) {

        /**
         * 这里写校验逻辑，此教程为入门系列，就不写了--懒
         */

        return usersDao.save(users);
    }

    @Override
    public Integer updadteUserPassword(String user_id, String password) {
        /**
         * 这里写校验逻辑，此教程为入门系列，就不写了--懒
         */
        return usersDao.updateUserPassword(user_id,password);
    }

    @Override
    public void deleteUser(Users users) {
         usersDao.delete(users);
    }

}
