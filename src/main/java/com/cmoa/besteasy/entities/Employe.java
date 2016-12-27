package com.cmoa.besteasy.entities;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Employe {
    private Integer id;

    private String empNum;

    private Integer deptId;

    private Integer userId;

    private String nameCh;

    private String nameEn;

    private Byte age;

    private String idNumber;

    private Boolean sex;

    private String nation;

    private String photo;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birth;

    private Boolean marriage;

    private Byte education;

    private String profession;

    private String bank;

    private String bankAccount;

    private String address;

    private String phone;

    private String email;

    private Byte duties;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date entryDate;

    private String description;

    private Double salary;

    private Boolean status;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date leavingDate;

    private String leavingReason;

    private Boolean signed;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createRDate;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private String createUsername;

    private Integer createUser;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private Integer ordered;

    private Boolean delflag;

    private String remark;
    
    private Department dept;
    
    private User user;

    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpNum() {
        return empNum;
    }

    public void setEmpNum(String empNum) {
        this.empNum = empNum == null ? null : empNum.trim();
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNameCh() {
        return nameCh;
    }

    public void setNameCh(String nameCh) {
        this.nameCh = nameCh == null ? null : nameCh.trim();
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn == null ? null : nameEn.trim();
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Boolean getMarriage() {
        return marriage;
    }

    public void setMarriage(Boolean marriage) {
        this.marriage = marriage;
    }

    public Byte getEducation() {
        return education;
    }

    public void setEducation(Byte education) {
        this.education = education;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession == null ? null : profession.trim();
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

   

    public Byte getDuties() {
		return duties;
	}

	public void setDuties(Byte duties) {
		this.duties = duties;
	}

	public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getLeavingDate() {
        return leavingDate;
    }

    public void setLeavingDate(Date leavingDate) {
        this.leavingDate = leavingDate;
    }

    public String getLeavingReason() {
        return leavingReason;
    }

    public void setLeavingReason(String leavingReason) {
        this.leavingReason = leavingReason == null ? null : leavingReason.trim();
    }

    public Boolean getSigned() {
        return signed;
    }

    public void setSigned(Boolean signed) {
        this.signed = signed;
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

	@Override
	public String toString() {
		return "Employe [id=" + id + ", empNum=" + empNum + ", deptId=" + deptId + ", userId=" + userId + ", nameCh="
				+ nameCh + ", nameEn=" + nameEn + ", age=" + age + ", idNumber=" + idNumber + ", sex=" + sex
				+ ", nation=" + nation + ", photo=" + photo + ", birth=" + birth + ", marriage=" + marriage
				+ ", education=" + education + ", profession=" + profession + ", bank=" + bank + ", bankAccount="
				+ bankAccount + ", address=" + address + ", phone=" + phone + ", email=" + email + ", duties=" + duties
				+ ", entryDate=" + entryDate + ", description=" + description + ", salary=" + salary + ", status="
				+ status + ", leavingDate=" + leavingDate + ", leavingReason=" + leavingReason + ", signed=" + signed
				+ ", createRDate=" + createRDate + ", createTime=" + createTime + ", createUsername=" + createUsername
				+ ", createUser=" + createUser + ", updateTime=" + updateTime + ", ordered=" + ordered + ", delflag="
				+ delflag + ", remark=" + remark + ", dept=" + dept + ", user=" + user + "]";
	}
    
}