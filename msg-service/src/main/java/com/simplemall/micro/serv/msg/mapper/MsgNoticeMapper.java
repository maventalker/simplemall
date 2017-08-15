package com.simplemall.micro.serv.msg.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.simplemall.micro.serv.msg.bean.MsgNotice;
import com.simplemall.micro.serv.msg.bean.MsgNoticeCriteria;

public interface MsgNoticeMapper {
    /**
     * 根据条件计数
     *
     * @param example
     */
    int countByExample(MsgNoticeCriteria example);

    /**
     *
     * @param example
     */
    int deleteByExample(MsgNoticeCriteria example);

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
    int insert(MsgNotice record);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insertSelective(MsgNotice record);

    /**
     * 根据条件查询列表
     *
     * @param example
     */
    List<MsgNotice> selectByExample(MsgNoticeCriteria example);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param tid
     */
    MsgNotice selectByPrimaryKey(String tid);

    /**
     * 选择性更新数据库记录
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") MsgNotice record, @Param("example") MsgNoticeCriteria example);

    /**
     * 选择性更新数据库记录
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") MsgNotice record, @Param("example") MsgNoticeCriteria example);

    /**
     * 根据主键来更新部分数据库记录
     *
     * @param record
     */
    int updateByPrimaryKeySelective(MsgNotice record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(MsgNotice record);
}