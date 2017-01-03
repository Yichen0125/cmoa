package com.cmoa.besteasy.entities;

import java.math.BigDecimal;
import java.util.Date;

public class Project {
    private Integer id;

    private String proNum;

    private Integer ordId;

    private String ordNum;

    private Float proProgress;

    private Integer pmId;

    private String pmName;

    private String originalName;

    private Short tranType;

    private String formatDocument;

    private Short formatRequ;

    private Float proSchedule;

    private Date proDeliverTime;

    private Date proCompleteTime;

    private String originalFile;

    private String completeFile;

    private Integer wordsCount;

    private String resourceApply;

    private String proRequ;

    private Short importance;

    private Short proPriority;

    private Short classified;

    private BigDecimal proPrice;

    private BigDecimal proServiceFee;

    private BigDecimal proTotal;

    private BigDecimal proSettlement;

    private String authlist;

    private Short proStatus;

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

    public String getOrdNum() {
        return ordNum;
    }

    public void setOrdNum(String ordNum) {
        this.ordNum = ordNum == null ? null : ordNum.trim();
    }

    public Float getProProgress() {
        return proProgress;
    }

    public void setProProgress(Float proProgress) {
        this.proProgress = proProgress;
    }

    public Integer getPmId() {
        return pmId;
    }

    public void setPmId(Integer pmId) {
        this.pmId = pmId;
    }

    public String getPmName() {
        return pmName;
    }

    public void setPmName(String pmName) {
        this.pmName = pmName == null ? null : pmName.trim();
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName == null ? null : originalName.trim();
    }

    public Short getTranType() {
        return tranType;
    }

    public void setTranType(Short tranType) {
        this.tranType = tranType;
    }

    public String getFormatDocument() {
        return formatDocument;
    }

    public void setFormatDocument(String formatDocument) {
        this.formatDocument = formatDocument == null ? null : formatDocument.trim();
    }

    public Short getFormatRequ() {
        return formatRequ;
    }

    public void setFormatRequ(Short formatRequ) {
        this.formatRequ = formatRequ;
    }

    public Float getProSchedule() {
        return proSchedule;
    }

    public void setProSchedule(Float proSchedule) {
        this.proSchedule = proSchedule;
    }

    public Date getProDeliverTime() {
        return proDeliverTime;
    }

    public void setProDeliverTime(Date proDeliverTime) {
        this.proDeliverTime = proDeliverTime;
    }

    public Date getProCompleteTime() {
        return proCompleteTime;
    }

    public void setProCompleteTime(Date proCompleteTime) {
        this.proCompleteTime = proCompleteTime;
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

    public String getProRequ() {
        return proRequ;
    }

    public void setProRequ(String proRequ) {
        this.proRequ = proRequ == null ? null : proRequ.trim();
    }

    public Short getImportance() {
        return importance;
    }

    public void setImportance(Short importance) {
        this.importance = importance;
    }

    public Short getProPriority() {
        return proPriority;
    }

    public void setProPriority(Short proPriority) {
        this.proPriority = proPriority;
    }

    public Short getClassified() {
        return classified;
    }

    public void setClassified(Short classified) {
        this.classified = classified;
    }

    public BigDecimal getProPrice() {
        return proPrice;
    }

    public void setProPrice(BigDecimal proPrice) {
        this.proPrice = proPrice;
    }

    public BigDecimal getProServiceFee() {
        return proServiceFee;
    }

    public void setProServiceFee(BigDecimal proServiceFee) {
        this.proServiceFee = proServiceFee;
    }

    public BigDecimal getProTotal() {
        return proTotal;
    }

    public void setProTotal(BigDecimal proTotal) {
        this.proTotal = proTotal;
    }

    public BigDecimal getProSettlement() {
        return proSettlement;
    }

    public void setProSettlement(BigDecimal proSettlement) {
        this.proSettlement = proSettlement;
    }

    public String getAuthlist() {
        return authlist;
    }

    public void setAuthlist(String authlist) {
        this.authlist = authlist == null ? null : authlist.trim();
    }

    public Short getProStatus() {
        return proStatus;
    }

    public void setProStatus(Short proStatus) {
        this.proStatus = proStatus;
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