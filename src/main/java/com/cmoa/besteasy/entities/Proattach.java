package com.cmoa.besteasy.entities;

import java.util.Date;

public class Proattach {
    private Integer id;

    private String atthNum;

    private Integer proId;

    private Integer ordId;

    private Integer ptid;

    private Integer submitterId;

    private String submitterNum;

    private String atthUrl;

    private String atthName;

    private Boolean type;

    private String fileName;

    private String atthVer;

    private Double size;

    private String atthContent;

    private String sectionNum;

    private Date createTime;

    private Integer createUid;

    private String createUser;

    private Integer ordered;

    private Boolean delflag;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAtthNum() {
        return atthNum;
    }

    public void setAtthNum(String atthNum) {
        this.atthNum = atthNum == null ? null : atthNum.trim();
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Integer getOrdId() {
        return ordId;
    }

    public void setOrdId(Integer ordId) {
        this.ordId = ordId;
    }

    public Integer getPtid() {
        return ptid;
    }

    public void setPtid(Integer ptid) {
        this.ptid = ptid;
    }

    public Integer getSubmitterId() {
        return submitterId;
    }

    public void setSubmitterId(Integer submitterId) {
        this.submitterId = submitterId;
    }

    public String getSubmitterNum() {
        return submitterNum;
    }

    public void setSubmitterNum(String submitterNum) {
        this.submitterNum = submitterNum == null ? null : submitterNum.trim();
    }

    public String getAtthUrl() {
        return atthUrl;
    }

    public void setAtthUrl(String atthUrl) {
        this.atthUrl = atthUrl == null ? null : atthUrl.trim();
    }

    public String getAtthName() {
        return atthName;
    }

    public void setAtthName(String atthName) {
        this.atthName = atthName == null ? null : atthName.trim();
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getAtthVer() {
        return atthVer;
    }

    public void setAtthVer(String atthVer) {
        this.atthVer = atthVer == null ? null : atthVer.trim();
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public String getAtthContent() {
        return atthContent;
    }

    public void setAtthContent(String atthContent) {
        this.atthContent = atthContent == null ? null : atthContent.trim();
    }

    public String getSectionNum() {
        return sectionNum;
    }

    public void setSectionNum(String sectionNum) {
        this.sectionNum = sectionNum == null ? null : sectionNum.trim();
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