package com.cmoa.besteasy.entities;

import java.math.BigDecimal;
import java.util.Date;

public class Protash {
    private Integer id;

    private String ptNum;

    private Integer ordId;

    private Integer proId;

    private String proNum;

    private Short workType;

    private Short ptPertype;

    private Integer ptPerid;

    private String anonymous;

    private String ptContent;

    private String ptDsep;

    private String ptRequ;

    private Date ptAcceptTime;

    private Integer planAmount;

    private Float ptSchedule;

    private BigDecimal ptPrice;

    private Short isDish;

    private Float ptProgress;

    private Short ptStatus;

    private Boolean dishConfirm;

    private Boolean pmConfirm;

    private Integer ptCamount;

    private Date ptCompleteTime;

    private BigDecimal ptCprice;

    private BigDecimal ptCost;

    private Boolean isvaluation;

    private BigDecimal ptTotal;

    private String ptComment;

    private Boolean ptGrade;

    private Double adjrAtio;

    private String adjReason;

    private BigDecimal ptPayable;

    private Short apprStat;

    private Integer apprUid;

    private Date apprTime;

    private BigDecimal amountPaid;

    private Date paymentTime;

    private Short ispayment;

    private Boolean paymentConfirm;

    private Date pconfimTime;

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

    public String getPtNum() {
        return ptNum;
    }

    public void setPtNum(String ptNum) {
        this.ptNum = ptNum == null ? null : ptNum.trim();
    }

    public Integer getOrdId() {
        return ordId;
    }

    public void setOrdId(Integer ordId) {
        this.ordId = ordId;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getProNum() {
        return proNum;
    }

    public void setProNum(String proNum) {
        this.proNum = proNum == null ? null : proNum.trim();
    }

    public Short getWorkType() {
        return workType;
    }

    public void setWorkType(Short workType) {
        this.workType = workType;
    }

    public Short getPtPertype() {
        return ptPertype;
    }

    public void setPtPertype(Short ptPertype) {
        this.ptPertype = ptPertype;
    }

    public Integer getPtPerid() {
        return ptPerid;
    }

    public void setPtPerid(Integer ptPerid) {
        this.ptPerid = ptPerid;
    }

    public String getAnonymous() {
        return anonymous;
    }

    public void setAnonymous(String anonymous) {
        this.anonymous = anonymous == null ? null : anonymous.trim();
    }

    public String getPtContent() {
        return ptContent;
    }

    public void setPtContent(String ptContent) {
        this.ptContent = ptContent == null ? null : ptContent.trim();
    }

    public String getPtDsep() {
        return ptDsep;
    }

    public void setPtDsep(String ptDsep) {
        this.ptDsep = ptDsep == null ? null : ptDsep.trim();
    }

    public String getPtRequ() {
        return ptRequ;
    }

    public void setPtRequ(String ptRequ) {
        this.ptRequ = ptRequ == null ? null : ptRequ.trim();
    }

    public Date getPtAcceptTime() {
        return ptAcceptTime;
    }

    public void setPtAcceptTime(Date ptAcceptTime) {
        this.ptAcceptTime = ptAcceptTime;
    }

    public Integer getPlanAmount() {
        return planAmount;
    }

    public void setPlanAmount(Integer planAmount) {
        this.planAmount = planAmount;
    }

    public Float getPtSchedule() {
        return ptSchedule;
    }

    public void setPtSchedule(Float ptSchedule) {
        this.ptSchedule = ptSchedule;
    }

    public BigDecimal getPtPrice() {
        return ptPrice;
    }

    public void setPtPrice(BigDecimal ptPrice) {
        this.ptPrice = ptPrice;
    }

    public Short getIsDish() {
        return isDish;
    }

    public void setIsDish(Short isDish) {
        this.isDish = isDish;
    }

    public Float getPtProgress() {
        return ptProgress;
    }

    public void setPtProgress(Float ptProgress) {
        this.ptProgress = ptProgress;
    }

    public Short getPtStatus() {
        return ptStatus;
    }

    public void setPtStatus(Short ptStatus) {
        this.ptStatus = ptStatus;
    }

    public Boolean getDishConfirm() {
        return dishConfirm;
    }

    public void setDishConfirm(Boolean dishConfirm) {
        this.dishConfirm = dishConfirm;
    }

    public Boolean getPmConfirm() {
        return pmConfirm;
    }

    public void setPmConfirm(Boolean pmConfirm) {
        this.pmConfirm = pmConfirm;
    }

    public Integer getPtCamount() {
        return ptCamount;
    }

    public void setPtCamount(Integer ptCamount) {
        this.ptCamount = ptCamount;
    }

    public Date getPtCompleteTime() {
        return ptCompleteTime;
    }

    public void setPtCompleteTime(Date ptCompleteTime) {
        this.ptCompleteTime = ptCompleteTime;
    }

    public BigDecimal getPtCprice() {
        return ptCprice;
    }

    public void setPtCprice(BigDecimal ptCprice) {
        this.ptCprice = ptCprice;
    }

    public BigDecimal getPtCost() {
        return ptCost;
    }

    public void setPtCost(BigDecimal ptCost) {
        this.ptCost = ptCost;
    }

    public Boolean getIsvaluation() {
        return isvaluation;
    }

    public void setIsvaluation(Boolean isvaluation) {
        this.isvaluation = isvaluation;
    }

    public BigDecimal getPtTotal() {
        return ptTotal;
    }

    public void setPtTotal(BigDecimal ptTotal) {
        this.ptTotal = ptTotal;
    }

    public String getPtComment() {
        return ptComment;
    }

    public void setPtComment(String ptComment) {
        this.ptComment = ptComment == null ? null : ptComment.trim();
    }

    public Boolean getPtGrade() {
        return ptGrade;
    }

    public void setPtGrade(Boolean ptGrade) {
        this.ptGrade = ptGrade;
    }

    public Double getAdjrAtio() {
        return adjrAtio;
    }

    public void setAdjrAtio(Double adjrAtio) {
        this.adjrAtio = adjrAtio;
    }

    public String getAdjReason() {
        return adjReason;
    }

    public void setAdjReason(String adjReason) {
        this.adjReason = adjReason == null ? null : adjReason.trim();
    }

    public BigDecimal getPtPayable() {
        return ptPayable;
    }

    public void setPtPayable(BigDecimal ptPayable) {
        this.ptPayable = ptPayable;
    }

    public Short getApprStat() {
        return apprStat;
    }

    public void setApprStat(Short apprStat) {
        this.apprStat = apprStat;
    }

    public Integer getApprUid() {
        return apprUid;
    }

    public void setApprUid(Integer apprUid) {
        this.apprUid = apprUid;
    }

    public Date getApprTime() {
        return apprTime;
    }

    public void setApprTime(Date apprTime) {
        this.apprTime = apprTime;
    }

    public BigDecimal getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(BigDecimal amountPaid) {
        this.amountPaid = amountPaid;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Short getIspayment() {
        return ispayment;
    }

    public void setIspayment(Short ispayment) {
        this.ispayment = ispayment;
    }

    public Boolean getPaymentConfirm() {
        return paymentConfirm;
    }

    public void setPaymentConfirm(Boolean paymentConfirm) {
        this.paymentConfirm = paymentConfirm;
    }

    public Date getPconfimTime() {
        return pconfimTime;
    }

    public void setPconfimTime(Date pconfimTime) {
        this.pconfimTime = pconfimTime;
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