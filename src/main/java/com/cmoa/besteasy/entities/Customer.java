package com.cmoa.besteasy.entities;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Customer {
    private Integer id;

    private String cusNum;

    private Integer cuspId;

    private Integer depId;

    private Integer empId;

    private String empNum;

    private String cusNameZh;

    private String cusNameEn;

    private Integer cusIndustry;

    private Integer cusType;

    private Integer cusNature;

    private String address;

    private String addressEn;

    private Integer source;

    private Integer isapproval;

    private Integer approval;

    private Integer xdeAims;

    private Integer xdeReal;

    private Integer level;

    private String bank;

    private String bankEn;

    private String bankAccount;

    private String swiftCode;

    private String opponentName;

    private Integer opponentPosition;

    private Integer opponentStage;

    private Integer khtpAction;

    private Integer cdl;

    private Integer myd;

    private Integer xyd;

    private Integer status;

    private String drainReason;

    private String drainStrategy;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCusNum() {
        return cusNum;
    }

    public void setCusNum(String cusNum) {
        this.cusNum = cusNum == null ? null : cusNum.trim();
    }

    public Integer getCuspId() {
        return cuspId;
    }

    public void setCuspId(Integer cuspId) {
        this.cuspId = cuspId;
    }

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
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

    public Integer getCusIndustry() {
        return cusIndustry;
    }

    public void setCusIndustry(Integer cusIndustry) {
        this.cusIndustry = cusIndustry;
    }

    public Integer getCusType() {
        return cusType;
    }

    public void setCusType(Integer cusType) {
        this.cusType = cusType;
    }

    public Integer getCusNature() {
        return cusNature;
    }

    public void setCusNature(Integer cusNature) {
        this.cusNature = cusNature;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getAddressEn() {
        return addressEn;
    }

    public void setAddressEn(String addressEn) {
        this.addressEn = addressEn == null ? null : addressEn.trim();
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getIsapproval() {
        return isapproval;
    }

    public void setIsapproval(Integer isapproval) {
        this.isapproval = isapproval;
    }

    public Integer getApproval() {
        return approval;
    }

    public void setApproval(Integer approval) {
        this.approval = approval;
    }

    public Integer getXdeAims() {
        return xdeAims;
    }

    public void setXdeAims(Integer xdeAims) {
        this.xdeAims = xdeAims;
    }

    public Integer getXdeReal() {
        return xdeReal;
    }

    public void setXdeReal(Integer xdeReal) {
        this.xdeReal = xdeReal;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public String getBankEn() {
        return bankEn;
    }

    public void setBankEn(String bankEn) {
        this.bankEn = bankEn == null ? null : bankEn.trim();
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    public String getSwiftCode() {
        return swiftCode;
    }

    public void setSwiftCode(String swiftCode) {
        this.swiftCode = swiftCode == null ? null : swiftCode.trim();
    }

    public String getOpponentName() {
        return opponentName;
    }

    public void setOpponentName(String opponentName) {
        this.opponentName = opponentName == null ? null : opponentName.trim();
    }

    public Integer getOpponentPosition() {
        return opponentPosition;
    }

    public void setOpponentPosition(Integer opponentPosition) {
        this.opponentPosition = opponentPosition;
    }

    public Integer getOpponentStage() {
        return opponentStage;
    }

    public void setOpponentStage(Integer opponentStage) {
        this.opponentStage = opponentStage;
    }

    public Integer getKhtpAction() {
        return khtpAction;
    }

    public void setKhtpAction(Integer khtpAction) {
        this.khtpAction = khtpAction;
    }

    public Integer getCdl() {
        return cdl;
    }

    public void setCdl(Integer cdl) {
        this.cdl = cdl;
    }

    public Integer getMyd() {
        return myd;
    }

    public void setMyd(Integer myd) {
        this.myd = myd;
    }

    public Integer getXyd() {
        return xyd;
    }

    public void setXyd(Integer xyd) {
        this.xyd = xyd;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDrainReason() {
        return drainReason;
    }

    public void setDrainReason(String drainReason) {
        this.drainReason = drainReason == null ? null : drainReason.trim();
    }

    public String getDrainStrategy() {
        return drainStrategy;
    }

    public void setDrainStrategy(String drainStrategy) {
        this.drainStrategy = drainStrategy == null ? null : drainStrategy.trim();
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