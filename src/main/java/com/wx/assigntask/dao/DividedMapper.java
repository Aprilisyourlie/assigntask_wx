package com.wx.assigntask.dao;

import com.wx.assigntask.entity.Divided;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface DividedMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table divided
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer dividedid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table divided
     *
     * @mbg.generated
     */
    int insert(Divided record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table divided
     *
     * @mbg.generated
     */
    Divided selectByPrimaryKey(Integer dividedid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table divided
     *
     * @mbg.generated
     */
    List<Divided> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table divided
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Divided record);

    /**
     * 插入算法分组
     */
    int insertDivided(Divided divided);

    String findIfDivided(int dividedId);

    int updataDivided(String ifdivided,int dividedId);
}