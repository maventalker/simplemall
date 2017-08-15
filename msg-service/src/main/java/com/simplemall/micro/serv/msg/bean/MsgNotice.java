package com.simplemall.micro.serv.msg.bean;

import java.util.Date;

public class MsgNotice {
    /**
     * 
     * 表 : tb_msg_notice
     * 对应字段 : tid
     */
    private String tid;

    /**
     * 流水号
     * 表 : tb_msg_notice
     * 对应字段 : serial_no
     */
    private String serialNo;

    /**
     * 目标类型SMS|EMAIL
     * 表 : tb_msg_notice
     * 对应字段 : target_type
     */
    private String targetType;

    /**
     * 目标地址
     * 表 : tb_msg_notice
     * 对应字段 : target_address
     */
    private String targetAddress;

    /**
     * 消息详情
     * 表 : tb_msg_notice
     * 对应字段 : content
     */
    private String content;

    /**
     * 
     * 表 : tb_msg_notice
     * 对应字段 : create_date
     */
    private Date createDate;

    /**
     * 
     * 表 : tb_msg_notice
     * 对应字段 : update_by
     */
    private String updateBy;

    /**
     * 
     * 表 : tb_msg_notice
     * 对应字段 : update_date
     */
    private Date updateDate;

    /**
     * 
     * 表 : tb_msg_notice
     * 对应字段 : remark
     */
    private String remark;

    /**
     * 
     * 表 : tb_msg_notice
     * 对应字段 : version
     */
    private Integer version;

    /**
     * 
     * 表 : tb_msg_notice
     * 对应字段 : state
     */
    private Integer state;

    /**
     * get method 
     *
     * @return tb_msg_notice.tid：
     */
    public String getTid() {
        return tid;
    }

    /**
     * set method 
     *
     * @param tid  
     */
    public void setTid(String tid) {
        this.tid = tid == null ? null : tid.trim();
    }

    /**
     * get method 
     *
     * @return tb_msg_notice.serial_no：流水号
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * set method 
     *
     * @param serialNo  流水号
     */
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo == null ? null : serialNo.trim();
    }

    /**
     * get method 
     *
     * @return tb_msg_notice.target_type：目标类型SMS|EMAIL
     */
    public String getTargetType() {
        return targetType;
    }

    /**
     * set method 
     *
     * @param targetType  目标类型SMS|EMAIL
     */
    public void setTargetType(String targetType) {
        this.targetType = targetType == null ? null : targetType.trim();
    }

    /**
     * get method 
     *
     * @return tb_msg_notice.target_address：目标地址
     */
    public String getTargetAddress() {
        return targetAddress;
    }

    /**
     * set method 
     *
     * @param targetAddress  目标地址
     */
    public void setTargetAddress(String targetAddress) {
        this.targetAddress = targetAddress == null ? null : targetAddress.trim();
    }

    /**
     * get method 
     *
     * @return tb_msg_notice.content：消息详情
     */
    public String getContent() {
        return content;
    }

    /**
     * set method 
     *
     * @param content  消息详情
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * get method 
     *
     * @return tb_msg_notice.create_date：
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * set method 
     *
     * @param createDate  
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * get method 
     *
     * @return tb_msg_notice.update_by：
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * set method 
     *
     * @param updateBy  
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * get method 
     *
     * @return tb_msg_notice.update_date：
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * set method 
     *
     * @param updateDate  
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * get method 
     *
     * @return tb_msg_notice.remark：
     */
    public String getRemark() {
        return remark;
    }

    /**
     * set method 
     *
     * @param remark  
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * get method 
     *
     * @return tb_msg_notice.version：
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * set method 
     *
     * @param version  
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * get method 
     *
     * @return tb_msg_notice.state：
     */
    public Integer getState() {
        return state;
    }

    /**
     * set method 
     *
     * @param state  
     */
    public void setState(Integer state) {
        this.state = state;
    }
}