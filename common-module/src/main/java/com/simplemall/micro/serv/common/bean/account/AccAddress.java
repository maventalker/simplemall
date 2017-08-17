package com.simplemall.micro.serv.common.bean.account;

import java.util.Date;

public class AccAddress {
    /**
     * 
     * 表 : tb_acc_address
     * 对应字段 : tid
     */
    private String tid;

    /**
     * 账户
     * 表 : tb_acc_address
     * 对应字段 : account_id
     */
    private String accountId;

    /**
     * 姓名
     * 表 : tb_acc_address
     * 对应字段 : real_name
     */
    private String realName;

    /**
     * 详细地址
     * 表 : tb_acc_address
     * 对应字段 : detail_address
     */
    private String detailAddress;

    /**
     * 是否常用地址
     * 表 : tb_acc_address
     * 对应字段 : is_flu
     */
    private String isFlu;

    /**
     * 
     * 表 : tb_acc_address
     * 对应字段 : create_by
     */
    private String createBy;

    /**
     * 
     * 表 : tb_acc_address
     * 对应字段 : create_date
     */
    private Date createDate;

    /**
     * 
     * 表 : tb_acc_address
     * 对应字段 : update_by
     */
    private String updateBy;

    /**
     * 
     * 表 : tb_acc_address
     * 对应字段 : update_date
     */
    private Date updateDate;

    /**
     * 
     * 表 : tb_acc_address
     * 对应字段 : remark
     */
    private String remark;

    /**
     * 
     * 表 : tb_acc_address
     * 对应字段 : version
     */
    private Integer version;

    /**
     * 
     * 表 : tb_acc_address
     * 对应字段 : state
     */
    private Integer state;

    /**
     * get method 
     *
     * @return tb_acc_address.tid：
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
     * @return tb_acc_address.account_id：账户
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * set method 
     *
     * @param accountId  账户
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * get method 
     *
     * @return tb_acc_address.real_name：姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * set method 
     *
     * @param realName  姓名
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * get method 
     *
     * @return tb_acc_address.detail_address：详细地址
     */
    public String getDetailAddress() {
        return detailAddress;
    }

    /**
     * set method 
     *
     * @param detailAddress  详细地址
     */
    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress == null ? null : detailAddress.trim();
    }

    /**
     * get method 
     *
     * @return tb_acc_address.is_flu：是否常用地址
     */
    public String getIsFlu() {
        return isFlu;
    }

    /**
     * set method 
     *
     * @param isFlu  是否常用地址
     */
    public void setIsFlu(String isFlu) {
        this.isFlu = isFlu == null ? null : isFlu.trim();
    }

    /**
     * get method 
     *
     * @return tb_acc_address.create_by：
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * set method 
     *
     * @param createBy  
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * get method 
     *
     * @return tb_acc_address.create_date：
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
     * @return tb_acc_address.update_by：
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
     * @return tb_acc_address.update_date：
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
     * @return tb_acc_address.remark：
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
     * @return tb_acc_address.version：
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
     * @return tb_acc_address.state：
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