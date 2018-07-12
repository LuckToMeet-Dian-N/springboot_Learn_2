package com.wen.springboot_test_2.JPATestcontroller;

import com.wen.springboot_test_2.Entity.Users;
import com.wen.springboot_test_2.service.UserService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "user")  //设置全局url
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 增操作
     * @param users
     * @return
     */
    @GetMapping(value = "insert")
    public String insertUser(Users users) {

//        System.out.println(userService.saveUser(users));

        return "插入成功"+userService.saveUser(users);
    }

    /**
     * 更新操作
     * @param account
     * @param password
     * @return
     */
    @GetMapping(value = "update")
    public String update(String account, String password) {

        System.out.println("开始更新：");
        userService.updadteUserPassword(account,password);
        return "更新成功";
    }

    /**
     * 查询操作
     * @return
     */
    @GetMapping(value = "find")
    public String  findUser() {

        System.out.println(userService.findAllUser());

        System.out.println("----------完美分割线--------------");

        return "查询成功："+userService.findAllUser2();
    }

    @GetMapping(value = "delete")
    public String  findUser(Users users) {

        userService.deleteUser(users);
        return "删除成功：";
    }


}
