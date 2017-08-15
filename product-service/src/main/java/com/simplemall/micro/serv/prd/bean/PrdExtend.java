package com.simplemall.micro.serv.prd.bean;

import java.util.Date;

public class PrdExtend {
    /**
     * 
     * 表 : tb_prd_extend
     * 对应字段 : tid
     */
    private String tid;

    /**
     * 供应商
     * 表 : tb_prd_extend
     * 对应字段 : supplier_name
     */
    private String supplierName;

    /**
     * 长描述
     * 表 : tb_prd_extend
     * 对应字段 : long_desc
     */
    private String longDesc;

    /**
     * 重量
     * 表 : tb_prd_extend
     * 对应字段 : weight
     */
    private String weight;

    /**
     * 产地
     * 表 : tb_prd_extend
     * 对应字段 : origin
     */
    private String origin;

    /**
     * 售出数量
     * 表 : tb_prd_extend
     * 对应字段 : saled_qty
     */
    private Integer saledQty;

    /**
     * 
     * 表 : tb_prd_extend
     * 对应字段 : create_by
     */
    private String createBy;

    /**
     * 
     * 表 : tb_prd_extend
     * 对应字段 : create_date
     */
    private Date createDate;

    /**
     * 
     * 表 : tb_prd_extend
     * 对应字段 : update_by
     */
    private String updateBy;

    /**
     * 
     * 表 : tb_prd_extend
     * 对应字段 : update_date
     */
    private Date updateDate;

    /**
     * 
     * 表 : tb_prd_extend
     * 对应字段 : remark
     */
    private String remark;

    /**
     * 
     * 表 : tb_prd_extend
     * 对应字段 : version
     */
    private Integer version;

    /**
     * 
     * 表 : tb_prd_extend
     * 对应字段 : state
     */
    private Integer state;

    /**
     * get method 
     *
     * @return tb_prd_extend.tid：
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
     * @return tb_prd_extend.supplier_name：供应商
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * set method 
     *
     * @param supplierName  供应商
     */
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    /**
     * get method 
     *
     * @return tb_prd_extend.long_desc：长描述
     */
    public String getLongDesc() {
        return longDesc;
    }

    /**
     * set method 
     *
     * @param longDesc  长描述
     */
    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc == null ? null : longDesc.trim();
    }

    /**
     * get method 
     *
     * @return tb_prd_extend.weight：重量
     */
    public String getWeight() {
        return weight;
    }

    /**
     * set method 
     *
     * @param weight  重量
     */
    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    /**
     * get method 
     *
     * @return tb_prd_extend.origin：产地
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * set method 
     *
     * @param origin  产地
     */
    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }

    /**
     * get method 
     *
     * @return tb_prd_extend.saled_qty：售出数量
     */
    public Integer getSaledQty() {
        return saledQty;
    }

    /**
     * set method 
     *
     * @param saledQty  售出数量
     */
    public void setSaledQty(Integer saledQty) {
        this.saledQty = saledQty;
    }

    /**
     * get method 
     *
     * @return tb_prd_extend.create_by：
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
     * @return tb_prd_extend.create_date：
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
     * @return tb_prd_extend.update_by：
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
     * @return tb_prd_extend.update_date：
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
     * @return tb_prd_extend.remark：
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
     * @return tb_prd_extend.version：
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
     * @return tb_prd_extend.state：
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