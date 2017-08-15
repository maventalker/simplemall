package com.simplemall.micro.serv.account.dal;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.simplemall.micro.serv.account.bean.Account;
import com.simplemall.micro.serv.account.bean.AccountCriteria;

public interface AccountMapper {
    /**
     * 根据条件计数
     *
     * @param example
     */
    int countByExample(AccountCriteria example);

    /**
     *
     * @param example
     */
    int deleteByExample(AccountCriteria example);

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
    int insert(Account record);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insertSelective(Account record);

    /**
     * 根据条件查询列表
     *
     * @param example
     */
    List<Account> selectByExample(AccountCriteria example);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param tid
     */
    Account selectByPrimaryKey(String tid);

    /**
     * 选择性更新数据库记录
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Account record, @Param("example") AccountCriteria example);

    /**
     * 选择性更新数据库记录
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Account record, @Param("example") AccountCriteria example);

    /**
     * 根据主键来更新部分数据库记录
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Account record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(Account record);
}