package com.simplemall.micro.serv.pay.dal;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.simplemall.micro.serv.pay.bean.PayRecord;
import com.simplemall.micro.serv.pay.bean.PayRecordCriteria;

public interface PayRecordMapper {
    /**
     * 根据条件计数
     *
     * @param example
     */
    int countByExample(PayRecordCriteria example);

    /**
     *
     * @param example
     */
    int deleteByExample(PayRecordCriteria example);

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
    int insert(PayRecord record);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insertSelective(PayRecord record);

    /**
     * 根据条件查询列表
     *
     * @param example
     */
    List<PayRecord> selectByExample(PayRecordCriteria example);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param tid
     */
    PayRecord selectByPrimaryKey(String tid);

    /**
     * 选择性更新数据库记录
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") PayRecord record, @Param("example") PayRecordCriteria example);

    /**
     * 选择性更新数据库记录
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") PayRecord record, @Param("example") PayRecordCriteria example);

    /**
     * 根据主键来更新部分数据库记录
     *
     * @param record
     */
    int updateByPrimaryKeySelective(PayRecord record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(PayRecord record);
}