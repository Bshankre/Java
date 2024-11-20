package com.gamblingproject;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Gambling {
	@Id
	@GeneratedValue
	private int id;
	@Column(nullable=false,unique=true)
	private String uName;
	@Column(nullable=false,unique=true)
	private long phNo;
	private double iAmt;
	private double rAmt;
	private String sysNum;
	private String useNum;
	@CreationTimestamp
	private LocalDateTime creatTimestamp;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	public double getiAmt() {
		return iAmt;
	}
	public void setiAmt(double iAmt) {
		this.iAmt = iAmt;
	}
	public double getrAmt() {
		return rAmt;
	}
	public void setrAmt(double rAmt) {
		this.rAmt = rAmt;
	}
	public String getSysNum() {
		return sysNum;
	}
	public void setSysNum(String sysNum) {
		this.sysNum = sysNum;
	}
	public String getUseNum() {
		return useNum;
	}
	public void setUseNum(String useNum) {
		this.useNum = useNum;
	}
	public LocalDateTime getCreatTimestamp() {
		return creatTimestamp;
	}
	public void setCreatTimestamp(LocalDateTime creatTimestamp) {
		this.creatTimestamp = creatTimestamp;
	}
	

	

}
