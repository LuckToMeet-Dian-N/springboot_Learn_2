package com.wen.springboot_test_2.Entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class Users implements Serializable {
    @Id
    @GeneratedValue
    private  Integer user_id ;
    @Column
    private String password;
}
