package com.simplemall.micro.serv.prd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.simplemall.micro.serv.common.bean.product.PrdInfo;
import com.simplemall.micro.serv.common.bean.product.PrdInfoCriteria;

public interface PrdInfoMapper {
    /**
     * 根据条件计数
     *
     * @param example
     */
    int countByExample(PrdInfoCriteria example);

    /**
     *
     * @param example
     */
    int deleteByExample(PrdInfoCriteria example);

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
    int insert(PrdInfo record);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insertSelective(PrdInfo record);

    /**
     * 根据条件查询列表
     *
     * @param example
     */
    List<PrdInfo> selectByExample(PrdInfoCriteria example);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param tid
     */
    PrdInfo selectByPrimaryKey(String tid);

    /**
     * 选择性更新数据库记录
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") PrdInfo record, @Param("example") PrdInfoCriteria example);

    /**
     * 选择性更新数据库记录
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") PrdInfo record, @Param("example") PrdInfoCriteria example);

    /**
     * 根据主键来更新部分数据库记录
     *
     * @param record
     */
    int updateByPrimaryKeySelective(PrdInfo record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(PrdInfo record);
}