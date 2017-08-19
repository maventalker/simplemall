package com.simplemall.micro.serv.order.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.simplemall.micro.serv.common.bean.order.OrderInfo;
import com.simplemall.micro.serv.common.bean.order.OrderInfoCriteria;

public interface OrderInfoMapper {
    /**
     * 根据条件计数
     *
     * @param example
     */
    int countByExample(OrderInfoCriteria example);

    /**
     *
     * @param example
     */
    int deleteByExample(OrderInfoCriteria example);

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
    int insert(OrderInfo record);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insertSelective(OrderInfo record);

    /**
     * 根据条件查询列表
     *
     * @param example
     */
    List<OrderInfo> selectByExample(OrderInfoCriteria example);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param tid
     */
    OrderInfo selectByPrimaryKey(String tid);

    /**
     * 选择性更新数据库记录
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") OrderInfo record, @Param("example") OrderInfoCriteria example);

    /**
     * 选择性更新数据库记录
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") OrderInfo record, @Param("example") OrderInfoCriteria example);

    /**
     * 根据主键来更新部分数据库记录
     *
     * @param record
     */
    int updateByPrimaryKeySelective(OrderInfo record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(OrderInfo record);
}