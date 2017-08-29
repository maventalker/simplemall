package com.simplemall.micro.serv.order.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.simplemall.micro.serv.common.bean.order.OrderState;
import com.simplemall.micro.serv.common.bean.order.OrderStateCriteria;

public interface OrderStateMapper {
    /**
     * 根据条件计数
     *
     * @param example
     */
    int countByExample(OrderStateCriteria example);

    /**
     *
     * @param example
     */
    int deleteByExample(OrderStateCriteria example);

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
    int insert(OrderState record);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insertSelective(OrderState record);

    /**
     * 根据条件查询列表
     *
     * @param example
     */
    List<OrderState> selectByExample(OrderStateCriteria example);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param tid
     */
    OrderState selectByPrimaryKey(String tid);

    /**
     * 选择性更新数据库记录
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") OrderState record, @Param("example") OrderStateCriteria example);

    /**
     * 选择性更新数据库记录
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") OrderState record, @Param("example") OrderStateCriteria example);

    /**
     * 根据主键来更新部分数据库记录
     *
     * @param record
     */
    int updateByPrimaryKeySelective(OrderState record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(OrderState record);
}