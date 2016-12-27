package com.cmoa.besteasy.entities;

import java.math.BigDecimal;
import java.util.Date;

public class Project {
    private Integer id;

    private String proNum;

    private Integer ordId;

    private Integer odId;

    private String ordNum;

    private Integer proProgress;

    private Integer empId;

    private Date proAcceptTime;

    private Float proSchedule;

    private Date deliverTime;

    private Date completeDate;

    private String originalFile;

    private String completeFile;

    private Integer wordsCount;

    private String resourceApply;

    private Integer secretLevel;

    private Integer proPriority;

    private BigDecimal proPrice;

    private BigDecimal serviceFee;

    private BigDecimal settlement;

    private String authlist;

    private String proRequ;

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

    public String getProNum() {
        return proNum;
    }

    public void setProNum(String proNum) {
        this.proNum = proNum == null ? null : proNum.trim();
    }

    public Integer getOrdId() {
        return ordId;
    }

    public void setOrdId(Integer ordId) {
        this.ordId = ordId;
    }

    public Integer getOdId() {
        return odId;
    }

    public void setOdId(Integer odId) {
        this.odId = odId;
    }

    public String getOrdNum() {
        return ordNum;
    }

    public void setOrdNum(String ordNum) {
        this.ordNum = ordNum == null ? null : ordNum.trim();
    }

    public Integer getProProgress() {
        return proProgress;
    }

    public void setProProgress(Integer proProgress) {
        this.proProgress = proProgress;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Date getProAcceptTime() {
        return proAcceptTime;
    }

    public void setProAcceptTime(Date proAcceptTime) {
        this.proAcceptTime = proAcceptTime;
    }

    public Float getProSchedule() {
        return proSchedule;
    }

    public void setProSchedule(Float proSchedule) {
        this.proSchedule = proSchedule;
    }

    public Date getDeliverTime() {
        return deliverTime;
    }

    public void setDeliverTime(Date deliverTime) {
        this.deliverTime = deliverTime;
    }

    public Date getCompleteDate() {
        return completeDate;
    }

    public void setCompleteDate(Date completeDate) {
        this.completeDate = completeDate;
    }

    public String getOriginalFile() {
        return originalFile;
    }

    public void setOriginalFile(String originalFile) {
        this.originalFile = originalFile == null ? null : originalFile.trim();
    }

    public String getCompleteFile() {
        return completeFile;
    }

    public void setCompleteFile(String completeFile) {
        this.completeFile = completeFile == null ? null : completeFile.trim();
    }

    public Integer getWordsCount() {
        return wordsCount;
    }

    public void setWordsCount(Integer wordsCount) {
        this.wordsCount = wordsCount;
    }

    public String getResourceApply() {
        return resourceApply;
    }

    public void setResourceApply(String resourceApply) {
        this.resourceApply = resourceApply == null ? null : resourceApply.trim();
    }

    public Integer getSecretLevel() {
        return secretLevel;
    }

    public void setSecretLevel(Integer secretLevel) {
        this.secretLevel = secretLevel;
    }

    public Integer getProPriority() {
        return proPriority;
    }

    public void setProPriority(Integer proPriority) {
        this.proPriority = proPriority;
    }

    public BigDecimal getProPrice() {
        return proPrice;
    }

    public void setProPrice(BigDecimal proPrice) {
        this.proPrice = proPrice;
    }

    public BigDecimal getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(BigDecimal serviceFee) {
        this.serviceFee = serviceFee;
    }

    public BigDecimal getSettlement() {
        return settlement;
    }

    public void setSettlement(BigDecimal settlement) {
        this.settlement = settlement;
    }

    public String getAuthlist() {
        return authlist;
    }

    public void setAuthlist(String authlist) {
        this.authlist = authlist == null ? null : authlist.trim();
    }

    public String getProRequ() {
        return proRequ;
    }

    public void setProRequ(String proRequ) {
        this.proRequ = proRequ == null ? null : proRequ.trim();
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