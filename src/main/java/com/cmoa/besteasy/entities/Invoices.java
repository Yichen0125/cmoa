package com.cmoa.besteasy.entities;

import java.util.Date;

public class Invoices {
    private Integer id;

    private String applyId;

    private Integer cusId;

    private Integer contactId;

    private Integer empId;

    private Integer orderId;

    private Integer type;

    private Integer manner;

    private Double ykje;

    private Double zkje;

    private Double zkjesl;

    private Double zkjesj;

    private Date sqTime;

    private Short sqStatus;

    private Short spStatus;

    private Date spTime;

    private Integer spEmp;

    private Date createTime;

    private String createUsername;

    private Integer createUser;

    private Integer ordered;

    private Boolean delflag;

    private String remarks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId == null ? null : applyId.trim();
    }

    public Integer getCusId() {
        return cusId;
    }

    public void setCusId(Integer cusId) {
        this.cusId = cusId;
    }

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getManner() {
        return manner;
    }

    public void setManner(Integer manner) {
        this.manner = manner;
    }

    public Double getYkje() {
        return ykje;
    }

    public void setYkje(Double ykje) {
        this.ykje = ykje;
    }

    public Double getZkje() {
        return zkje;
    }

    public void setZkje(Double zkje) {
        this.zkje = zkje;
    }

    public Double getZkjesl() {
        return zkjesl;
    }

    public void setZkjesl(Double zkjesl) {
        this.zkjesl = zkjesl;
    }

    public Double getZkjesj() {
        return zkjesj;
    }

    public void setZkjesj(Double zkjesj) {
        this.zkjesj = zkjesj;
    }

    public Date getSqTime() {
        return sqTime;
    }

    public void setSqTime(Date sqTime) {
        this.sqTime = sqTime;
    }

    public Short getSqStatus() {
        return sqStatus;
    }

    public void setSqStatus(Short sqStatus) {
        this.sqStatus = sqStatus;
    }

    public Short getSpStatus() {
        return spStatus;
    }

    public void setSpStatus(Short spStatus) {
        this.spStatus = spStatus;
    }

    public Date getSpTime() {
        return spTime;
    }

    public void setSpTime(Date spTime) {
        this.spTime = spTime;
    }

    public Integer getSpEmp() {
        return spEmp;
    }

    public void setSpEmp(Integer spEmp) {
        this.spEmp = spEmp;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUsername() {
        return createUsername;
    }

    public void setCreateUsername(String createUsername) {
        this.createUsername = createUsername == null ? null : createUsername.trim();
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}