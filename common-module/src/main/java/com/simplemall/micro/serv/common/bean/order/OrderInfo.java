package com.simplemall.micro.serv.common.bean.order;

import java.math.BigDecimal;
import java.util.Date;

public class OrderInfo {
    /**
     * 
     * 表 : tb_ord_inf
     * 对应字段 : tid
     */
    private String tid;

    /**
     * 流水号
     * 表 : tb_ord_inf
     * 对应字段 : serial_no
     */
    private String serialNo;

    /**
     * 订单状态
     * 表 : tb_ord_inf
     * 对应字段 : status
     */
    private String status;

    /**
     * 支付类型
     * 表 : tb_ord_inf
     * 对应字段 : pay_type
     */
    private String payType;

    /**
     * 支付状态
     * 表 : tb_ord_inf
     * 对应字段 : pay_status
     */
    private String payStatus;

    /**
     * 账户
     * 表 : tb_ord_inf
     * 对应字段 : shipping_account
     */
    private String shippingAccount;

    /**
     * 收货人
     * 表 : tb_ord_inf
     * 对应字段 : shipping_name
     */
    private String shippingName;

    /**
     * 收货地址
     * 表 : tb_ord_inf
     * 对应字段 : shipping_address
     */
    private String shippingAddress;

    /**
     * 收货电话
     * 表 : tb_ord_inf
     * 对应字段 : shipping_phone
     */
    private String shippingPhone;

    /**
     * 发货方式
     * 表 : tb_ord_inf
     * 对应字段 : post_way
     */
    private String postWay;

    /**
     * 配送费
     * 表 : tb_ord_inf
     * 对应字段 : post_fee
     */
    private BigDecimal postFee;

    /**
     * 订单总价
     * 表 : tb_ord_inf
     * 对应字段 : price
     */
    private BigDecimal price;

    /**
     * 
     * 表 : tb_ord_inf
     * 对应字段 : create_by
     */
    private String createBy;

    /**
     * 
     * 表 : tb_ord_inf
     * 对应字段 : create_date
     */
    private Date createDate;

    /**
     * 
     * 表 : tb_ord_inf
     * 对应字段 : update_by
     */
    private String updateBy;

    /**
     * 
     * 表 : tb_ord_inf
     * 对应字段 : update_date
     */
    private Date updateDate;

    /**
     * 
     * 表 : tb_ord_inf
     * 对应字段 : remark
     */
    private String remark;

    /**
     * 
     * 表 : tb_ord_inf
     * 对应字段 : version
     */
    private Integer version;

    /**
     * 
     * 表 : tb_ord_inf
     * 对应字段 : state
     */
    private Integer state;

    /**
     * get method 
     *
     * @return tb_ord_inf.tid：
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
     * @return tb_ord_inf.serial_no：流水号
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
     * @return tb_ord_inf.status：订单状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * set method 
     *
     * @param status  订单状态
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * get method 
     *
     * @return tb_ord_inf.pay_type：支付类型
     */
    public String getPayType() {
        return payType;
    }

    /**
     * set method 
     *
     * @param payType  支付类型
     */
    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    /**
     * get method 
     *
     * @return tb_ord_inf.pay_status：支付状态
     */
    public String getPayStatus() {
        return payStatus;
    }

    /**
     * set method 
     *
     * @param payStatus  支付状态
     */
    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus == null ? null : payStatus.trim();
    }

    /**
     * get method 
     *
     * @return tb_ord_inf.shipping_account：账户
     */
    public String getShippingAccount() {
        return shippingAccount;
    }

    /**
     * set method 
     *
     * @param shippingAccount  账户
     */
    public void setShippingAccount(String shippingAccount) {
        this.shippingAccount = shippingAccount == null ? null : shippingAccount.trim();
    }

    /**
     * get method 
     *
     * @return tb_ord_inf.shipping_name：收货人
     */
    public String getShippingName() {
        return shippingName;
    }

    /**
     * set method 
     *
     * @param shippingName  收货人
     */
    public void setShippingName(String shippingName) {
        this.shippingName = shippingName == null ? null : shippingName.trim();
    }

    /**
     * get method 
     *
     * @return tb_ord_inf.shipping_address：收货地址
     */
    public String getShippingAddress() {
        return shippingAddress;
    }

    /**
     * set method 
     *
     * @param shippingAddress  收货地址
     */
    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress == null ? null : shippingAddress.trim();
    }

    /**
     * get method 
     *
     * @return tb_ord_inf.shipping_phone：收货电话
     */
    public String getShippingPhone() {
        return shippingPhone;
    }

    /**
     * set method 
     *
     * @param shippingPhone  收货电话
     */
    public void setShippingPhone(String shippingPhone) {
        this.shippingPhone = shippingPhone == null ? null : shippingPhone.trim();
    }

    /**
     * get method 
     *
     * @return tb_ord_inf.post_way：发货方式
     */
    public String getPostWay() {
        return postWay;
    }

    /**
     * set method 
     *
     * @param postWay  发货方式
     */
    public void setPostWay(String postWay) {
        this.postWay = postWay == null ? null : postWay.trim();
    }

    /**
     * get method 
     *
     * @return tb_ord_inf.post_fee：配送费
     */
    public BigDecimal getPostFee() {
        return postFee;
    }

    /**
     * set method 
     *
     * @param postFee  配送费
     */
    public void setPostFee(BigDecimal postFee) {
        this.postFee = postFee;
    }

    /**
     * get method 
     *
     * @return tb_ord_inf.price：订单总价
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * set method 
     *
     * @param price  订单总价
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * get method 
     *
     * @return tb_ord_inf.create_by：
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
     * @return tb_ord_inf.create_date：
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
     * @return tb_ord_inf.update_by：
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
     * @return tb_ord_inf.update_date：
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
     * @return tb_ord_inf.remark：
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
     * @return tb_ord_inf.version：
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
     * @return tb_ord_inf.state：
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