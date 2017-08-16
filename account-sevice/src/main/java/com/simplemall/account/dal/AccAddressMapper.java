package com.simplemall.account.dal;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.simplemall.account.bean.AccAddress;
import com.simplemall.account.bean.AccAddressCriteria;

public interface AccAddressMapper {
    /**
     * 根据条件计数
     *
     * @param example
     */
    int countByExample(AccAddressCriteria example);

    /**
     *
     * @param example
     */
    int deleteByExample(AccAddressCriteria example);

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
    int insert(AccAddress record);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insertSelective(AccAddress record);

    /**
     * 根据条件查询列表
     *
     * @param example
     */
    List<AccAddress> selectByExample(AccAddressCriteria example);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param tid
     */
    AccAddress selectByPrimaryKey(String tid);

    /**
     * 选择性更新数据库记录
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") AccAddress record, @Param("example") AccAddressCriteria example);

    /**
     * 选择性更新数据库记录
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") AccAddress record, @Param("example") AccAddressCriteria example);

    /**
     * 根据主键来更新部分数据库记录
     *
     * @param record
     */
    int updateByPrimaryKeySelective(AccAddress record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(AccAddress record);
}