package com.simplemall.micro.serv.prd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.simplemall.micro.serv.prd.bean.PrdExtend;
import com.simplemall.micro.serv.prd.bean.PrdExtendCriteria;

public interface PrdExtendMapper {
    /**
     * 根据条件计数
     *
     * @param example
     */
    int countByExample(PrdExtendCriteria example);

    /**
     *
     * @param example
     */
    int deleteByExample(PrdExtendCriteria example);

    /**
     * 根据主键删除数据库的记录
     *
     * @param tid
     */
    int deleteByPrimaryKey(String tid);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insert(PrdExtend record);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insertSelective(PrdExtend record);

    /**
     * 根据条件查询列表
     *
     * @param example
     */
    List<PrdExtend> selectByExample(PrdExtendCriteria example);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param tid
     */
    PrdExtend selectByPrimaryKey(String tid);

    /**
     * 选择性更新数据库记录
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") PrdExtend record, @Param("example") PrdExtendCriteria example);

    /**
     * 选择性更新数据库记录
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") PrdExtend record, @Param("example") PrdExtendCriteria example);

    /**
     * 根据主键来更新部分数据库记录
     *
     * @param record
     */
    int updateByPrimaryKeySelective(PrdExtend record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(PrdExtend record);
}