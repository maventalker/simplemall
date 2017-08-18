package com.simplemall.micro.serv.common.bean.product;

import java.util.Date;

public class PrdInfo {
    /**
     * 
     * 表 : tb_prd_info
     * 对应字段 : tid
     */
    private String tid;

    /**
     * 对外展示名称
     * 表 : tb_prd_info
     * 对应字段 : label_name
     */
    private String labelName;

    /**
     * 短描述
     * 表 : tb_prd_info
     * 对应字段 : short_desc
     */
    private String shortDesc;

    /**
     * 库存
     * 表 : tb_prd_info
     * 对应字段 : price
     */
    private String price;

    /**
     * 
     * 表 : tb_prd_info
     * 对应字段 : store
     */
    private Integer store;

    /**
     * 
     * 表 : tb_prd_info
     * 对应字段 : create_by
     */
    private String createBy;

    /**
     * 
     * 表 : tb_prd_info
     * 对应字段 : create_date
     */
    private Date createDate;

    /**
     * 
     * 表 : tb_prd_info
     * 对应字段 : update_by
     */
    private String updateBy;

    /**
     * 
     * 表 : tb_prd_info
     * 对应字段 : update_date
     */
    private Date updateDate;

    /**
     * 
     * 表 : tb_prd_info
     * 对应字段 : remark
     */
    private String remark;

    /**
     * 
     * 表 : tb_prd_info
     * 对应字段 : version
     */
    private Integer version;

    /**
     * 
     * 表 : tb_prd_info
     * 对应字段 : state
     */
    private Integer state;

    /**
     * get method 
     *
     * @return tb_prd_info.tid：
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
     * @return tb_prd_info.label_name：对外展示名称
     */
    public String getLabelName() {
        return labelName;
    }

    /**
     * set method 
     *
     * @param labelName  对外展示名称
     */
    public void setLabelName(String labelName) {
        this.labelName = labelName == null ? null : labelName.trim();
    }

    /**
     * get method 
     *
     * @return tb_prd_info.short_desc：短描述
     */
    public String getShortDesc() {
        return shortDesc;
    }

    /**
     * set method 
     *
     * @param shortDesc  短描述
     */
    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc == null ? null : shortDesc.trim();
    }

    /**
     * get method 
     *
     * @return tb_prd_info.price：库存
     */
    public String getPrice() {
        return price;
    }

    /**
     * set method 
     *
     * @param price  库存
     */
    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    /**
     * get method 
     *
     * @return tb_prd_info.store：
     */
    public Integer getStore() {
        return store;
    }

    /**
     * set method 
     *
     * @param store  
     */
    public void setStore(Integer store) {
        this.store = store;
    }

    /**
     * get method 
     *
     * @return tb_prd_info.create_by：
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
     * @return tb_prd_info.create_date：
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
     * @return tb_prd_info.update_by：
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
     * @return tb_prd_info.update_date：
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
     * @return tb_prd_info.remark：
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
     * @return tb_prd_info.version：
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
     * @return tb_prd_info.state：
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