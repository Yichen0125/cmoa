package com.cmoa.besteasy.entities;

import java.math.BigDecimal;
import java.util.Date;

public class Statement {
    private Integer id;

    private String sttNum;

    private String ordNums;

    private Integer empId;

    private Integer cusId;

    private String cusNameZh;

    private String cusNameEn;

    private String stEmail;

    private String stTel;

    private String stFax;

    private BigDecimal total;

    private Boolean invoiceType;

    private Boolean cusSign;

    private Date createRDate;

    private Date createTime;

    private Integer createUser;

    private String createUsername;

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

    public String getSttNum() {
        return sttNum;
    }

    public void setSttNum(String sttNum) {
        this.sttNum = sttNum == null ? null : sttNum.trim();
    }

    public String getOrdNums() {
        return ordNums;
    }

    public void setOrdNums(String ordNums) {
        this.ordNums = ordNums == null ? null : ordNums.trim();
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getCusId() {
        return cusId;
    }

    public void setCusId(Integer cusId) {
        this.cusId = cusId;
    }

    public String getCusNameZh() {
        return cusNameZh;
    }

    public void setCusNameZh(String cusNameZh) {
        this.cusNameZh = cusNameZh == null ? null : cusNameZh.trim();
    }

    public String getCusNameEn() {
        return cusNameEn;
    }

    public void setCusNameEn(String cusNameEn) {
        this.cusNameEn = cusNameEn == null ? null : cusNameEn.trim();
    }

    public String getStEmail() {
        return stEmail;
    }

    public void setStEmail(String stEmail) {
        this.stEmail = stEmail == null ? null : stEmail.trim();
    }

    public String getStTel() {
        return stTel;
    }

    public void setStTel(String stTel) {
        this.stTel = stTel == null ? null : stTel.trim();
    }

    public String getStFax() {
        return stFax;
    }

    public void setStFax(String stFax) {
        this.stFax = stFax == null ? null : stFax.trim();
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Boolean getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(Boolean invoiceType) {
        this.invoiceType = invoiceType;
    }

    public Boolean getCusSign() {
        return cusSign;
    }

    public void setCusSign(Boolean cusSign) {
        this.cusSign = cusSign;
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

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public String getCreateUsername() {
        return createUsername;
    }

    public void setCreateUsername(String createUsername) {
        this.createUsername = createUsername == null ? null : createUsername.trim();
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