package com.cmoa.besteasy.entities;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private Integer id;

    private String ordNum;

    private Integer cusId;

    private Integer empId;

    private String empNum;

    private String empName;

    private Integer mId;

    private String mName;

    private String contractNum;

    private Date contractDate;

    private String region;

    private Integer contactId;

    private Boolean ordType;

    private String originalName;

    private Byte tranType;

    private String formatDocument;

    private Boolean formatRequ;

    private Date ordTime;

    private Date completeTime;

    private Date rCompleteTime;

    private Boolean countMethod;

    private BigDecimal price;

    private Integer count;

    private Double changeRate;

    private BigDecimal increase;

    private Boolean importance;

    private Boolean priority;

    private Boolean manageauth;

    private Boolean cusSign;

    private Boolean ordStatus;

    private Boolean audit;

    private Double ordProgress;

    private String zdyy;

    private Integer instalment;

    private Byte chekTimes;

    private BigDecimal ordTotal;

    private BigDecimal settlementAmount;

    private Date confTime;

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

    public String getOrdNum() {
        return ordNum;
    }

    public void setOrdNum(String ordNum) {
        this.ordNum = ordNum == null ? null : ordNum.trim();
    }

    public Integer getCusId() {
        return cusId;
    }

    public void setCusId(Integer cusId) {
        this.cusId = cusId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpNum() {
        return empNum;
    }

    public void setEmpNum(String empNum) {
        this.empNum = empNum == null ? null : empNum.trim();
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    public String getContractNum() {
        return contractNum;
    }

    public void setContractNum(String contractNum) {
        this.contractNum = contractNum == null ? null : contractNum.trim();
    }

    public Date getContractDate() {
        return contractDate;
    }

    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public Boolean getOrdType() {
        return ordType;
    }

    public void setOrdType(Boolean ordType) {
        this.ordType = ordType;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName == null ? null : originalName.trim();
    }

    public Byte getTranType() {
        return tranType;
    }

    public void setTranType(Byte tranType) {
        this.tranType = tranType;
    }

    public String getFormatDocument() {
        return formatDocument;
    }

    public void setFormatDocument(String formatDocument) {
        this.formatDocument = formatDocument == null ? null : formatDocument.trim();
    }

    public Boolean getFormatRequ() {
        return formatRequ;
    }

    public void setFormatRequ(Boolean formatRequ) {
        this.formatRequ = formatRequ;
    }

    public Date getOrdTime() {
        return ordTime;
    }

    public void setOrdTime(Date ordTime) {
        this.ordTime = ordTime;
    }

    public Date getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }

    public Date getrCompleteTime() {
        return rCompleteTime;
    }

    public void setrCompleteTime(Date rCompleteTime) {
        this.rCompleteTime = rCompleteTime;
    }

    public Boolean getCountMethod() {
        return countMethod;
    }

    public void setCountMethod(Boolean countMethod) {
        this.countMethod = countMethod;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getChangeRate() {
        return changeRate;
    }

    public void setChangeRate(Double changeRate) {
        this.changeRate = changeRate;
    }

    public BigDecimal getIncrease() {
        return increase;
    }

    public void setIncrease(BigDecimal increase) {
        this.increase = increase;
    }

    public Boolean getImportance() {
        return importance;
    }

    public void setImportance(Boolean importance) {
        this.importance = importance;
    }

    public Boolean getPriority() {
        return priority;
    }

    public void setPriority(Boolean priority) {
        this.priority = priority;
    }

    public Boolean getManageauth() {
        return manageauth;
    }

    public void setManageauth(Boolean manageauth) {
        this.manageauth = manageauth;
    }

    public Boolean getCusSign() {
        return cusSign;
    }

    public void setCusSign(Boolean cusSign) {
        this.cusSign = cusSign;
    }

    public Boolean getOrdStatus() {
        return ordStatus;
    }

    public void setOrdStatus(Boolean ordStatus) {
        this.ordStatus = ordStatus;
    }

    public Boolean getAudit() {
        return audit;
    }

    public void setAudit(Boolean audit) {
        this.audit = audit;
    }

    public Double getOrdProgress() {
        return ordProgress;
    }

    public void setOrdProgress(Double ordProgress) {
        this.ordProgress = ordProgress;
    }

    public String getZdyy() {
        return zdyy;
    }

    public void setZdyy(String zdyy) {
        this.zdyy = zdyy == null ? null : zdyy.trim();
    }

    public Integer getInstalment() {
        return instalment;
    }

    public void setInstalment(Integer instalment) {
        this.instalment = instalment;
    }

    public Byte getChekTimes() {
        return chekTimes;
    }

    public void setChekTimes(Byte chekTimes) {
        this.chekTimes = chekTimes;
    }

    public BigDecimal getOrdTotal() {
        return ordTotal;
    }

    public void setOrdTotal(BigDecimal ordTotal) {
        this.ordTotal = ordTotal;
    }

    public BigDecimal getSettlementAmount() {
        return settlementAmount;
    }

    public void setSettlementAmount(BigDecimal settlementAmount) {
        this.settlementAmount = settlementAmount;
    }

    public Date getConfTime() {
        return confTime;
    }

    public void setConfTime(Date confTime) {
        this.confTime = confTime;
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