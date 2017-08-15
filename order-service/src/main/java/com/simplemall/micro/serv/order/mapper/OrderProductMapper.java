package com.simplemall.micro.serv.order.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.simplemall.micro.serv.order.bean.OrderProduct;
import com.simplemall.micro.serv.order.bean.OrderProductCriteria;

public interface OrderProductMapper {
    /**
     * 根据条件计数
     *
     * @param example
     */
    int countByExample(OrderProductCriteria example);

    /**
     *
     * @param example
     */
    int deleteByExample(OrderProductCriteria example);

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
    int insert(OrderProduct record);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insertSelective(OrderProduct record);

    /**
     * 根据条件查询列表
     *
     * @param example
     */
    List<OrderProduct> selectByExample(OrderProductCriteria example);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param tid
     */
    OrderProduct selectByPrimaryKey(String tid);

    /**
     * 选择性更新数据库记录
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") OrderProduct record, @Param("example") OrderProductCriteria example);

    /**
     * 选择性更新数据库记录
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") OrderProduct record, @Param("example") OrderProductCriteria example);

    /**
     * 根据主键来更新部分数据库记录
     *
     * @param record
     */
    int updateByPrimaryKeySelective(OrderProduct record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(OrderProduct record);
}