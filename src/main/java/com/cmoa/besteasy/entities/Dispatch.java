package com.cmoa.besteasy.entities;

import java.util.Date;

public class Dispatch {
    private Integer id;

    private String dishNum;

    private Integer dispatcherId;

    private Integer proId;

    private Integer ptId;

    private Integer pmId;

    private Integer ptPerid;

    private String ptPername;

    private String ptDesc;

    private Date dishStime;

    private Date dishEtime;

    private String ptContent;

    private Integer ptCamount;

    private Date deliverTime;

    private Short execState;

    private Date createRDate;

    private Date createTime;

    private Integer createUid;

    private String createUser;

    private Date updateTime;

    private Integer ordered;

    private Boolean delflag;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDishNum() {
        return dishNum;
    }

    public void setDishNum(String dishNum) {
        this.dishNum = dishNum == null ? null : dishNum.trim();
    }

    public Integer getDispatcherId() {
        return dispatcherId;
    }

    public void setDispatcherId(Integer dispatcherId) {
        this.dispatcherId = dispatcherId;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Integer getPtId() {
        return ptId;
    }

    public void setPtId(Integer ptId) {
        this.ptId = ptId;
    }

    public Integer getPmId() {
        return pmId;
    }

    public void setPmId(Integer pmId) {
        this.pmId = pmId;
    }

    public Integer getPtPerid() {
        return ptPerid;
    }

    public void setPtPerid(Integer ptPerid) {
        this.ptPerid = ptPerid;
    }

    public String getPtPername() {
        return ptPername;
    }

    public void setPtPername(String ptPername) {
        this.ptPername = ptPername == null ? null : ptPername.trim();
    }

    public String getPtDesc() {
        return ptDesc;
    }

    public void setPtDesc(String ptDesc) {
        this.ptDesc = ptDesc == null ? null : ptDesc.trim();
    }

    public Date getDishStime() {
        return dishStime;
    }

    public void setDishStime(Date dishStime) {
        this.dishStime = dishStime;
    }

    public Date getDishEtime() {
        return dishEtime;
    }

    public void setDishEtime(Date dishEtime) {
        this.dishEtime = dishEtime;
    }

    public String getPtContent() {
        return ptContent;
    }

    public void setPtContent(String ptContent) {
        this.ptContent = ptContent == null ? null : ptContent.trim();
    }

    public Integer getPtCamount() {
        return ptCamount;
    }

    public void setPtCamount(Integer ptCamount) {
        this.ptCamount = ptCamount;
    }

    public Date getDeliverTime() {
        return deliverTime;
    }

    public void setDeliverTime(Date deliverTime) {
        this.deliverTime = deliverTime;
    }

    public Short getExecState() {
        return execState;
    }

    public void setExecState(Short execState) {
        this.execState = execState;
    }

    public Date getCreateRDate() {
        return createRDate;
    }

    public void setCreateRDate(Date createRDate) {
        this.createRDate = createRDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUid() {
        return createUid;
    }

    public void setCreateUid(Integer createUid) {
        this.createUid = createUid;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getOrdered() {
        return ordered;
    }

    public void setOrdered(Integer ordered) {
        this.ordered = ordered;
    }

    public Boolean getDelflag() {
        return delflag;
    }

    public void setDelflag(Boolean delflag) {
        this.delflag = delflag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}