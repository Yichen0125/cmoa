package com.cmoa.besteasy.entities;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

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
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date contractDate;

    private String region;

    private Integer contactId;

    private Boolean ordType;

    private String originalName;

    private Byte tranType;

    private Integer tranId;

    private Integer pmId;

    private String pmNum;

    private String pmName;

    private String formatDocument;

    private Short formatRequ;

    private Date ordTime;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date completeTime;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date rCompleteTime;

    private Short countMethod;

    private BigDecimal price;

    private Integer count;

    private BigDecimal totalPrice;

    private Double changeRate;

    private BigDecimal increase;

    private Short importance;

    private Short priority;

    private Short manageauth;

    private Short cusSign;

    private Short ordStatus;

    private Boolean audit;

    private Double ordProgress;

    private String zdyy;

    private Integer instalment;

    private Byte chekTimes;

    private BigDecimal ordTotal;

    private String sttNum;

    private BigDecimal settlementAmount;

    private BigDecimal receivedAmount;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date pmcompletedDate;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date confTime;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createRDate;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private Integer createUser;

    private String createUsername;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private Integer ordered;

    private Boolean delflag;

    private String remark;
    
    private Customer customer;
    
    private Employe employe ;
    
    private Cuscontact contact;

    public Cuscontact getContact() {
		return contact;
	}

	public void setContact(Cuscontact contact) {
		this.contact = contact;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

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

    public Integer getTranId() {
        return tranId;
    }

    public void setTranId(Integer tranId) {
        this.tranId = tranId;
    }

    public Integer getPmId() {
        return pmId;
    }

    public void setPmId(Integer pmId) {
        this.pmId = pmId;
    }

    public String getPmNum() {
        return pmNum;
    }

    public void setPmNum(String pmNum) {
        this.pmNum = pmNum == null ? null : pmNum.trim();
    }

    public String getPmName() {
        return pmName;
    }

    public void setPmName(String pmName) {
        this.pmName = pmName == null ? null : pmName.trim();
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

    public Short getCountMethod() {
        return countMethod;
    }

    public void setCountMethod(Short countMethod) {
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

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
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

    public Short getImportance() {
        return importance;
    }

    public void setImportance(Short importance) {
        this.importance = importance;
    }

    public Short getPriority() {
        return priority;
    }

    public void setPriority(Short priority) {
        this.priority = priority;
    }

    public Short getManageauth() {
        return manageauth;
    }

    public void setManageauth(Short manageauth) {
        this.manageauth = manageauth;
    }

    public Short getCusSign() {
        return cusSign;
    }

    public void setCusSign(Short cusSign) {
        this.cusSign = cusSign;
    }

    public Short getOrdStatus() {
        return ordStatus;
    }

    public void setOrdStatus(Short ordStatus) {
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

    public String getSttNum() {
        return sttNum;
    }

    public void setSttNum(String sttNum) {
        this.sttNum = sttNum == null ? null : sttNum.trim();
    }

    public BigDecimal getSettlementAmount() {
        return settlementAmount;
    }

    public void setSettlementAmount(BigDecimal settlementAmount) {
        this.settlementAmount = settlementAmount;
    }

    public BigDecimal getReceivedAmount() {
        return receivedAmount;
    }

    public void setReceivedAmount(BigDecimal receivedAmount) {
        this.receivedAmount = receivedAmount;
    }

    public Date getPmcompletedDate() {
        return pmcompletedDate;
    }

    public void setPmcompletedDate(Date pmcompletedDate) {
        this.pmcompletedDate = pmcompletedDate;
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