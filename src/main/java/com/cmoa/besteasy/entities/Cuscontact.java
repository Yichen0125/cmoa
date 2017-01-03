package com.cmoa.besteasy.entities;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Cuscontact {
    private Integer id;

    private String ccNum;

    private Boolean isprimary;

    private Integer cuspId;

    private Integer cusId;

    private String ccName;

    private Boolean sex;

    private String ccAdress;

    private String hobbies;

    private String ccEmail;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birth;

    private Integer ccDept;

    private String duties;

    private String ccQq;

    private String ccTel;

    private String ccFax;

    private String ccWx;

    private String ccMobile;

    private String ccCareer;

    private String ccDesp;

    private String ccGwqk;

    private Integer ccCgljs;

    private Integer ccFylx;

    private Integer ccJczyd;

    private Integer ccXqfl;

    private String ccXqms;

    private Byte ccFgzcdms;

    private String ccPjreason;

    private String ccMotiv;

    private String ccSocial;

    private Date createRDate;

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

    public String getCcNum() {
        return ccNum;
    }

    public void setCcNum(String ccNum) {
        this.ccNum = ccNum == null ? null : ccNum.trim();
    }

    public Boolean getIsprimary() {
        return isprimary;
    }

    public void setIsprimary(Boolean isprimary) {
        this.isprimary = isprimary;
    }

    public Integer getCuspId() {
        return cuspId;
    }

    public void setCuspId(Integer cuspId) {
        this.cuspId = cuspId;
    }

    public Integer getCusId() {
        return cusId;
    }

    public void setCusId(Integer cusId) {
        this.cusId = cusId;
    }

    public String getCcName() {
        return ccName;
    }

    public void setCcName(String ccName) {
        this.ccName = ccName == null ? null : ccName.trim();
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getCcAdress() {
        return ccAdress;
    }

    public void setCcAdress(String ccAdress) {
        this.ccAdress = ccAdress == null ? null : ccAdress.trim();
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies == null ? null : hobbies.trim();
    }

    public String getCcEmail() {
        return ccEmail;
    }

    public void setCcEmail(String ccEmail) {
        this.ccEmail = ccEmail == null ? null : ccEmail.trim();
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Integer getCcDept() {
        return ccDept;
    }

    public void setCcDept(Integer ccDept) {
        this.ccDept = ccDept;
    }

    public String getDuties() {
        return duties;
    }

    public void setDuties(String duties) {
        this.duties = duties == null ? null : duties.trim();
    }

    public String getCcQq() {
        return ccQq;
    }

    public void setCcQq(String ccQq) {
        this.ccQq = ccQq == null ? null : ccQq.trim();
    }

    public String getCcTel() {
        return ccTel;
    }

    public void setCcTel(String ccTel) {
        this.ccTel = ccTel == null ? null : ccTel.trim();
    }

    public String getCcFax() {
        return ccFax;
    }

    public void setCcFax(String ccFax) {
        this.ccFax = ccFax == null ? null : ccFax.trim();
    }

    public String getCcWx() {
        return ccWx;
    }

    public void setCcWx(String ccWx) {
        this.ccWx = ccWx == null ? null : ccWx.trim();
    }

    public String getCcMobile() {
        return ccMobile;
    }

    public void setCcMobile(String ccMobile) {
        this.ccMobile = ccMobile == null ? null : ccMobile.trim();
    }

    public String getCcCareer() {
        return ccCareer;
    }

    public void setCcCareer(String ccCareer) {
        this.ccCareer = ccCareer == null ? null : ccCareer.trim();
    }

    public String getCcDesp() {
        return ccDesp;
    }

    public void setCcDesp(String ccDesp) {
        this.ccDesp = ccDesp == null ? null : ccDesp.trim();
    }

    public String getCcGwqk() {
        return ccGwqk;
    }

    public void setCcGwqk(String ccGwqk) {
        this.ccGwqk = ccGwqk == null ? null : ccGwqk.trim();
    }

    public Integer getCcCgljs() {
        return ccCgljs;
    }

    public void setCcCgljs(Integer ccCgljs) {
        this.ccCgljs = ccCgljs;
    }

    public Integer getCcFylx() {
        return ccFylx;
    }

    public void setCcFylx(Integer ccFylx) {
        this.ccFylx = ccFylx;
    }

    public Integer getCcJczyd() {
        return ccJczyd;
    }

    public void setCcJczyd(Integer ccJczyd) {
        this.ccJczyd = ccJczyd;
    }

    public Integer getCcXqfl() {
        return ccXqfl;
    }

    public void setCcXqfl(Integer ccXqfl) {
        this.ccXqfl = ccXqfl;
    }

    public String getCcXqms() {
        return ccXqms;
    }

    public void setCcXqms(String ccXqms) {
        this.ccXqms = ccXqms == null ? null : ccXqms.trim();
    }

    public Byte getCcFgzcdms() {
        return ccFgzcdms;
    }

    public void setCcFgzcdms(Byte ccFgzcdms) {
        this.ccFgzcdms = ccFgzcdms;
    }

    public String getCcPjreason() {
        return ccPjreason;
    }

    public void setCcPjreason(String ccPjreason) {
        this.ccPjreason = ccPjreason == null ? null : ccPjreason.trim();
    }

    public String getCcMotiv() {
        return ccMotiv;
    }

    public void setCcMotiv(String ccMotiv) {
        this.ccMotiv = ccMotiv == null ? null : ccMotiv.trim();
    }

    public String getCcSocial() {
        return ccSocial;
    }

    public void setCcSocial(String ccSocial) {
        this.ccSocial = ccSocial == null ? null : ccSocial.trim();
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