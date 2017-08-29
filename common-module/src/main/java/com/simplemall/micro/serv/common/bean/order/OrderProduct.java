package com.simplemall.micro.serv.common.bean.order;

import java.math.BigDecimal;
import java.util.Date;

public class OrderProduct {
    /**
     * 
     * 表 : tb_ord_produt
     * 对应字段 : tid
     */
    private String tid;

    /**
     * 流水号
     * 表 : tb_ord_produt
     * 对应字段 : serial_no
     */
    private String serialNo;

    /**
     * 商品名
     * 表 : tb_ord_produt
     * 对应字段 : prd_name
     */
    private String prdName;

    /**
     * 商品价
     * 表 : tb_ord_produt
     * 对应字段 : prd_price
     */
    private BigDecimal prdPrice;

    /**
     * 数量
     * 表 : tb_ord_produt
     * 对应字段 : prd_qty
     */
    private Integer prdQty;

    /**
     * 
     * 表 : tb_ord_produt
     * 对应字段 : create_date
     */
    private Date createDate;

    /**
     * 
     * 表 : tb_ord_produt
     * 对应字段 : update_by
     */
    private String updateBy;

    /**
     * 
     * 表 : tb_ord_produt
     * 对应字段 : update_date
     */
    private Date updateDate;

    /**
     * 
     * 表 : tb_ord_produt
     * 对应字段 : remark
     */
    private String remark;

    /**
     * 
     * 表 : tb_ord_produt
     * 对应字段 : version
     */
    private Integer version;

    /**
     * 
     * 表 : tb_ord_produt
     * 对应字段 : state
     */
    private Integer state;

    /**
     * get method 
     *
     * @return tb_ord_produt.tid：
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
     * @return tb_ord_produt.serial_no：流水号
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
     * @return tb_ord_produt.prd_name：商品名
     */
    public String getPrdName() {
        return prdName;
    }

    /**
     * set method 
     *
     * @param prdName  商品名
     */
    public void setPrdName(String prdName) {
        this.prdName = prdName == null ? null : prdName.trim();
    }

    /**
     * get method 
     *
     * @return tb_ord_produt.prd_price：商品价
     */
    public BigDecimal getPrdPrice() {
        return prdPrice;
    }

    /**
     * set method 
     *
     * @param prdPrice  商品价
     */
    public void setPrdPrice(BigDecimal prdPrice) {
        this.prdPrice = prdPrice;
    }

    /**
     * get method 
     *
     * @return tb_ord_produt.prd_qty：数量
     */
    public Integer getPrdQty() {
        return prdQty;
    }

    /**
     * set method 
     *
     * @param prdQty  数量
     */
    public void setPrdQty(Integer prdQty) {
        this.prdQty = prdQty;
    }

    /**
     * get method 
     *
     * @return tb_ord_produt.create_date：
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
     * @return tb_ord_produt.update_by：
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
     * @return tb_ord_produt.update_date：
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
     * @return tb_ord_produt.remark：
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
     * @return tb_ord_produt.version：
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
     * @return tb_ord_produt.state：
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