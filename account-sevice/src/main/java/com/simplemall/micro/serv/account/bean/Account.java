package com.simplemall.micro.serv.account.bean;

import java.util.Date;

public class Account {
    /**
     * 
     * 表 : tb_acc_account
     * 对应字段 : tid
     */
    private String tid;

    /**
     * 手机号
     * 表 : tb_acc_account
     * 对应字段 : phone
     */
    private String phone;

    /**
     * 邮件
     * 表 : tb_acc_account
     * 对应字段 : email
     */
    private String email;

    /**
     * 密码
     * 表 : tb_acc_account
     * 对应字段 : password
     */
    private String password;

    /**
     * 
     * 表 : tb_acc_account
     * 对应字段 : create_by
     */
    private String createBy;

    /**
     * 
     * 表 : tb_acc_account
     * 对应字段 : create_date
     */
    private Date createDate;

    /**
     * 
     * 表 : tb_acc_account
     * 对应字段 : update_by
     */
    private String updateBy;

    /**
     * 
     * 表 : tb_acc_account
     * 对应字段 : update_date
     */
    private Date updateDate;

    /**
     * 
     * 表 : tb_acc_account
     * 对应字段 : remark
     */
    private String remark;

    /**
     * 
     * 表 : tb_acc_account
     * 对应字段 : version
     */
    private Integer version;

    /**
     * 
     * 表 : tb_acc_account
     * 对应字段 : state
     */
    private Integer state;

    /**
     * get method 
     *
     * @return tb_acc_account.tid：
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
     * @return tb_acc_account.phone：手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * set method 
     *
     * @param phone  手机号
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * get method 
     *
     * @return tb_acc_account.email：邮件
     */
    public String getEmail() {
        return email;
    }

    /**
     * set method 
     *
     * @param email  邮件
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * get method 
     *
     * @return tb_acc_account.password：密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * set method 
     *
     * @param password  密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * get method 
     *
     * @return tb_acc_account.create_by：
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
     * @return tb_acc_account.create_date：
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
     * @return tb_acc_account.update_by：
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
     * @return tb_acc_account.update_date：
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
     * @return tb_acc_account.remark：
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
     * @return tb_acc_account.version：
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
     * @return tb_acc_account.state：
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