package com.simplemall.micro.serv.common.bean.order;

import java.util.Date;

public class OrderState {
    /**
     * 
     * 表 : tb_ord_state
     * 对应字段 : tid
     */
    private String tid;

    /**
     * 流水号
     * 表 : tb_ord_state
     * 对应字段 : serial_no
     */
    private String serialNo;

    /**
     * 订单状态
     * 表 : tb_ord_state
     * 对应字段 : status
     */
    private String status;

    /**
     * 
     * 表 : tb_ord_state
     * 对应字段 : create_date
     */
    private Date createDate;

    /**
     * 
     * 表 : tb_ord_state
     * 对应字段 : update_by
     */
    private String updateBy;

    /**
     * 
     * 表 : tb_ord_state
     * 对应字段 : update_date
     */
    private Date updateDate;

    /**
     * 
     * 表 : tb_ord_state
     * 对应字段 : remark
     */
    private String remark;

    /**
     * 
     * 表 : tb_ord_state
     * 对应字段 : version
     */
    private Integer version;

    /**
     * 
     * 表 : tb_ord_state
     * 对应字段 : state
     */
    private Integer state;

    /**
     * get method 
     *
     * @return tb_ord_state.tid：
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
     * @return tb_ord_state.serial_no：流水号
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
     * @return tb_ord_state.status：订单状态
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
     * @return tb_ord_state.create_date：
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
     * @return tb_ord_state.update_by：
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
     * @return tb_ord_state.update_date：
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
     * @return tb_ord_state.remark：
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
     * @return tb_ord_state.version：
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
     * @return tb_ord_state.state：
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