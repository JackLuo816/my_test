package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
public interface UserMapper {
    User findUser();
}
