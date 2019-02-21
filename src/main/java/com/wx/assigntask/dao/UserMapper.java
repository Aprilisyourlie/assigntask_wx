package com.wx.assigntask.dao;

import com.wx.assigntask.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    List<User> selectAll();

    User findUserByUserName(String username);

    User findUserById(int userid);

    List<User> selectAllByTasking();
    List selectAllIdByTasking();

    int updateTaking (int userId,int tasking);
}